// [GonBee]
// �p�[�e�B�[BOT�@�\�̊O������Q�Ƃ����֐����`����B

#include "pybot_internal.hpp"

namespace pybot {

// -----------------------------------------------------------------------------
// �O������Q�Ƃ����֐��̒�`
	
// MVP�̎����i�߂�B
void advance_mvp_round(
	int cid // �L�����N�^�[ID�B
) {
	sql_session::open([cid] (sql_session* ses) {
		ses->execute(
			"UPDATE `pybot_mvp_stats` "
			"SET"
			" `round` = `round` + 1,"
			" `mobs` = 0 "
			"WHERE `char_id` = ", construct<sql_param>(cid)
		);
		ses->execute(
			"DELETE FROM `pybot_mvp` "
			"WHERE `char_id` = ", construct<sql_param>(cid)
		);
	});
}

// Bot��������Ӓ肷��B
// Bot�ł͂Ȃ��Ȃ牽�����Ȃ��B
// ���łɊӒ�ς݂Ȃ牽�����Ȃ��B
// �A�C�e���Ӓ���g�p�\�ł���Ή���������ɊӒ肷��B
// �����A�C�e�����J�[�g�Ɋg�勾������΂��������ĊӒ肷��B
// �A�C�e���Ӓ���g�p�s�A���g�勾���Ȃ���Ή������Ȃ��B
void bot_identify_equip(
	int cid,
	item* itm
) {
	block_if* bot = find_map_data(all_bots, cid);
	if (bot) bot->identify_equip(itm);
}

// ���x���{�����v�Z����B
double // �v�Z�����{���B
calculate_level_rate(
	block_list* bl, // �u���b�N���X�g�B
	mob_data* md    // �����X�^�[�f�[�^�B
) {
	int lv = status_get_lv(bl);
	if (md &&
		mob_is_pure_flora(md)
	) lv = 1;
	double rat = (lv + 1) / 20.;
	rat *= rat;
	return std::max(rat, 2.);
}

// �L�����N�^�[ID��Bot���𔻒肷��B
bool // ���ʁB
char_is_bot(
	int cid // �L�����N�^�[ID�B
) {
	return find_map_data(all_bots, cid);
}

// �J�[�h��ʂ̃J�[�h�ɕϊ�����B
int // �ϊ������J�[�hID�B
convert_card(
	int car_id // �J�[�hID�B
) {
	return card_converter::instance->convert(car_id);
}

// �p�[�e�B�[BOT�@�\���I������B
void do_final() {
	delete_timer(ai_timer, ai_t::timer_func);
}

// �p�[�e�B�[BOT�@�\������������B
void do_init() {
	load_maps();
	update_fever();
	skill_mobs::instance = construct<skill_mobs>();
	card_converter::instance = construct<card_converter>();
	add_timer_func_list(ai_t::timer_func, "pybot_ai");
	ai_timer = add_timer_interval(
		gettick() + battle_config.pybot_think_time,
		ai_t::timer_func,
		0,
		0,
		battle_config.pybot_think_time
	);
}

// �������ʏ����𑕔��C���f�b�N�X�ɕϊ�����B
equip_index // �ϊ����������C���f�b�N�X�B�ϊ��ł��Ȃ����INT_MIN�B
equip_pos_order_to_index(
	int ord // �������ʏ����B
) {
	equip_index ind = equip_index(INT_MIN);
	if (ord >= 0 &&
		ord < EPO2EQI_TABLE.size()
	) ind = EPO2EQI_TABLE[ord];
	return ind;
}

// �����X�^�[�f�[�^��T���B
int // �������������X�^�[ID�B������Ȃ�������0�B
find_mobdb(
	const std::string& nam // �����X�^�[���B
) {
	using ele_lis = std::list<ptr<command_element>>;
	using ele_lis_lis = std::list<ptr<ele_lis>>;
	using str_lis = std::vector<std::string>;

	auto eles = initialize<ele_lis>(initialize<command_element>(CET_LITERAL, nam));
	eles = command_parse_tokens<ele_lis>(ALL_RANGE(*eles), "|", false, true);
	eles = command_parse_blocks<ele_lis>(ALL_RANGE(*eles), "<", ">", false, true);
	auto tag_blos = command_collect_blocks<ele_lis_lis>(ALL_RANGE(*eles), "<", ">", true);
	if (tag_blos->size() > 1) return 0;

	int mob_cla = INT_MIN;
	bool cau = false;
	if (!tag_blos->empty()) {
		auto tag_toks = command_collect_tokens<ele_lis_lis>(ALL_RANGE(*tag_blos->front()), "|", true);
		auto tag_strs = command_print_all<str_lis>(ALL_RANGE(*tag_toks));
		for (const std::string& tag_str : *tag_strs) {
			int mob_cla_ind = find_name(MOB_CLASS_NAME_TABLE, tag_str);
			if (mob_cla_ind != INT_MIN) {
				mob_cla = mob_cla_ind;
				continue;
			}
			if (tag_str == CAUTION_TAG) {
				cau = true;
				continue;
			}
		}
	}

	auto pay_eles = initialize<ele_lis>();
	for (auto ele : *eles) {
		if (ele->type == CET_OPEN) break;
		pay_eles->push_back(ele);
	}
	std::string pay_str = lowercase(trim(command_print(ALL_RANGE(*pay_eles)), " \t"));

	int mid = parse_id(pay_str);
	if (mid) {
		if (mid == INT_MIN ||
			!mob_db(mid)
		) mid = 0;
	} else {
		meta_mobs emc = find_map_key(META_MONSTER_NAMES, pay_str);
		if (emc) return emc;
		int rac_ind = find_name(RACE_NAME_TABLE, pay_str);
		if (rac_ind != INT_MIN) return MM_RACE + rac_ind;
		int ele_ind = find_name(ELEMENT_NAME_TABLE, pay_str);
		if (ele_ind != INT_MIN) return MM_ELEMENT + ele_ind;
		int siz_ind = find_name(SIZE_NAME_TABLE, pay_str);
		if (siz_ind != INT_MIN) return MM_SIZE + siz_ind;
		uint16 mids[256];
		int cou = mobdb_searchname_array2(pay_str.c_str(), mids, 256);
		for (int i = 0; i < cou; i++) {
			struct mob_db* mdb = mob_db(mids[i]);
			if (mdb &&
				lowercase(mdb->jname) == pay_str &&
				(mob_cla == INT_MIN ||
					mdb->status.class_ == mob_cla
				)
			) {
				mid = mids[i];
				break;
			}
		}
	}
	if (mid &&
		cau
	) mid += MM_CAUTION;
	return mid;
}

// �h���b�v�A�C�e���������A�C�e�����𔻒肷��B
bool // ���ʁB
flooritem_to_be_ignored(
	map_session_data* sd, // �Z�b�V�����f�[�^�B
	flooritem_data* fit   // �h���b�v�A�C�e���B
) {
	auto lea = find_map_data(all_leaders, sd->status.char_id);
	if (!lea) {
		lea = construct<leader_t>(sd);
		all_leaders[lea->char_id()] = lea;
	}
	item_data* idb = itemdb_exists(fit->item.nameid);
	return (lea->ignore_items()->find(fit->item.nameid) ||
			lea->ignore_items()->find(ITEM_TYPE_OFFSET + idb->type)
		) && !fit->item.card[0] &&
		!fit->item.refine;
}

// �������ʖ����擾����B
const char* get_equip_pos_name(equip_index equ_ind) {
	return EQUIP_POS_NAME_TABLE[equ_ind].c_str();
}

// �Ō�Ɏ}��������ID���擾����B
int // �擾����ID�B
get_last_summoned_id(
	map_session_data* sd // �Z�b�V�����f�[�^�B
) {
	auto lea = find_map_data(all_leaders, sd->status.char_id);
	if (!lea) {
		lea = construct<leader_t>(sd);
		all_leaders[lea->char_id()] = lea;
	}
	return lea->last_summoned_id();
}

// Bot�̃��[�_�[���擾����B
map_session_data* // �擾�������[�_�[�B
                  // Bot�ł͂Ȃ����A���[�_�[�����O�A�E�g���Ă���Ȃ�nullptr�B
get_leader(
	int cid // �L�����N�^�[ID�B
) {
	block_if* bot = find_map_data(all_bots, cid);
	map_session_data* lea = nullptr;
	if (bot) lea = map_id2sd(bot->leader()->account_id());
	return lea;
}

// ���݂̃}�b�v�̏����ʒu���擾����B
block_list* // �擾�����ʒu�B
get_map_initial_position(
	map_session_data* sd // �Z�b�V�����f�[�^�B
) {
	auto pos = find_map_data(map_initial_positions, sd->status.char_id);
	if (pos) return pos.get();
	else return &sd->bl;
}

// ���{��̃}�b�v�����擾����B
std::string // �擾�������{��̃}�b�v���B
get_map_name_japanese(
	int mid // �}�b�vID�B
) {
	std::string nam_jap;
	auto map = find_map_data(id_maps, mid);
	if (map) nam_jap = map->name_japanese;
	return nam_jap;
}

// ���{��̃}�b�v�����擾����B
std::string // �擾�������{��̃}�b�v���B
get_map_name_japanese(
	const std::string& nam_eng // �p��̃}�b�v���B
) {
	return get_map_name_japanese(map_mapindex2mapid(mapindex_name2id(nam_eng.c_str())));
}

// �����o�[���X�g���擾����B
std::shared_ptr<std::vector<std::shared_ptr<member_info>>> // �擾���������o�[���X�g�B
get_member_list(
	map_session_data* sd // ���[�_�[�̃Z�b�V�����f�[�^�B
) {
	auto lea = find_map_data(all_leaders, sd->status.char_id);
	if (!lea) {
		lea = construct<leader_t>(sd);
		all_leaders[lea->char_id()] = lea;
	}
	auto lis = initialize<std::vector<std::shared_ptr<member_info>>>();
	for (block_if* mem : lea->members())
		lis->push_back(initialize<member_info>(
			mem->account_id(),
			mem->char_id(),
			mem->name(),
			e_job(mem->sd()->status.class_)
		));
	return lis;
}

// �������S�p�����̍ŏ��̃o�C�g���𔻒肷��B
bool // ���ʁB
letter_is_jlead(
	uint8_t let // �o�C�g�B
) {
    return (let >= 0x80 &&
            let <= 0x9f
        ) || (let >= 0xe0 &&
            let <= 0xfc
        );
}

// �}�b�v�{�����擾����B
double // �擾�����{���B
map_rate(
	int m // �}�b�vID�B
) {
	return find_map_data(fever_rates, m, 100) / 100.;
}

// PC��MVP���l���������Ƃ��L�^����B
// ���h��ꂽ�Ö؂̎}�A�܂��͍Ԃ̎����ŏo�������������X�^�[�̏ꍇ�͋L�^���Ȃ��B
void pc_acquired_mvp(
	int cid,     // �L�����N�^�[ID�B
	mob_data* md // �����X�^�[�f�[�^�B
) {
	if (mob_is_normal_mvp(md)) {
		sql_session::open([cid, md] (sql_session* ses) {
			ses->execute(
				"INSERT INTO `pybot_mvp` "
				"(`char_id`,"
				" `mob_id`) "
				"SELECT"
				" ", construct<sql_param>(cid       ), ","
				" ", construct<sql_param>(md->mob_id), " "
				"FROM dual "
				"WHERE NOT EXISTS("
					"SELECT * "
					"FROM `pybot_mvp` "
					"WHERE"
					" `char_id` = ", construct<sql_param>(cid       ), " AND"
					" `mob_id` = " , construct<sql_param>(md->mob_id), ")"
			);
			int mobs;
			ses->execute(
				"SELECT ", construct<sql_column>("COUNT(*)", mobs), " "
				"FROM `pybot_mvp` "
				"WHERE `char_id` = ", construct<sql_param>(cid)
			);
			ses->next_row();
			ses->execute(
				"INSERT INTO `pybot_mvp_stats`"
				"(`char_id`,"
				" `round`,"
				" `mobs`) "
				"VALUES"
				"(", construct<sql_param>(cid), ","
				" ", construct<sql_param>(0), ","
				" ", construct<sql_param>(mobs), ") "
				"ON DUPLICATE KEY UPDATE `mobs` = ", construct<sql_param>(mobs)
			);
		});
	}
}

// �����X�^�[���ʏ��MVP�����X�^�[�ł��邩�𔻒肷��B
bool // ���ʁB
mob_is_normal_mvp(
	mob_data* md // �����X�^�[�f�[�^�B
) {
	std::string eve(md->npc_event);
	return status_has_mode(&md->status, MD_MVP) &&
		eve.substr(0, PYBOT_DUMMY_NPC_NAME.length()) != PYBOT_DUMMY_NPC_NAME &&
		eve.substr(0, CASTLE_TRIAL_NPC_NAME.length()) != CASTLE_TRIAL_NPC_NAME;
}

// PC���h���b�v�A�C�e�����E���邩�𔻒肷��B
bool // ���ʁB
pc_can_takeitem(
	map_session_data* sd, // �Z�b�V�����f�[�^�B
	flooritem_data* fit   // �h���b�v�A�C�e���B
) {
	now = gettick();
	struct party_data *p = NULL;
	if (sd->status.party_id)
		p = party_search(sd->status.party_id);
	if (fit->first_get_charid > 0 && fit->first_get_charid != sd->status.char_id) {
		struct map_session_data *first_sd = map_charid2sd(fit->first_get_charid);
		if (DIFF_TICK(now,fit->first_get_tick) < 0) {
			if (!(p && p->party.item&1 &&
				first_sd && first_sd->status.party_id == sd->status.party_id
				))
				return false;
		}
		else if (fit->second_get_charid > 0 && fit->second_get_charid != sd->status.char_id) {
			struct map_session_data *second_sd = map_charid2sd(fit->second_get_charid);
			if (DIFF_TICK(now, fit->second_get_tick) < 0) {
				if (!(p && p->party.item&1 &&
					((first_sd && first_sd->status.party_id == sd->status.party_id) ||
					(second_sd && second_sd->status.party_id == sd->status.party_id))
					))
					return false;
			}
			else if (fit->third_get_charid > 0 && fit->third_get_charid != sd->status.char_id){
				struct map_session_data *third_sd = map_charid2sd(fit->third_get_charid);
				if (DIFF_TICK(now,fit->third_get_tick) < 0) {
					if(!(p && p->party.item&1 &&
						((first_sd && first_sd->status.party_id == sd->status.party_id) ||
						(second_sd && second_sd->status.party_id == sd->status.party_id) ||
						(third_sd && third_sd->status.party_id == sd->status.party_id))
						))
						return false;
				}
			}
		}
	}
	return true;
}

// PC��MVP���l���������Ƃ����邩�𔻒肷��B
bool // ���ʁB
pc_has_acquired_mvp(
	int cid,
	int mid
) {
	bool res = false;
	sql_session::open([cid, mid, &res] (sql_session* ses) {
		int cou;
		ses->execute(
			"SELECT ", construct<sql_column>("COUNT(*)", cou), " "
			"FROM `pybot_mvp` "
			"WHERE"
			" `char_id` = ", construct<sql_param>(cid), " AND"
			" `mob_id` = ", construct<sql_param>(mid)
		);
		res = ses->next_row() &&
			cou;
	});
	return res;
}

// �`�b�N�������B
std::string // �������`�b�N�B
print_tick(
	t_tick tic // �`�b�N�B
) {
	std::stringstream out;
	t_tick secs     = tic  / 1000;
	t_tick secs_rem = secs %   60;
	t_tick mins     = secs /   60;
	t_tick mins_rem = mins %   60;
	t_tick hous     = mins /   60;
	if (hous)     out << hous     << "����";
	if (mins_rem) out << mins_rem << "��";
	out               << secs_rem << "�b";
	return out.str();
}

// MVP�����L���O���Ɖ��B
std::shared_ptr<std::vector<std::shared_ptr<mvp_stats>>> // �Ɖ��MVP�����L���O�B
query_mvp_ranking(
	const std::vector<e_job>& jobs, // �E�Ƃ̃x�N�^�B
	int lim                         // �ő�s���B
) {
	auto res = initialize<std::vector<ptr<mvp_stats>>>();
	if (jobs.size() == 1 &&
		jobs.front() == -1
	) {
		sql_session::open([lim, &res] (sql_session* ses) {
			char nam[NAME_LENGTH];
			int cla;
			int rou;
			int mobs;
			ses->execute(
				"SELECT"
				" ", construct<sql_column>("`char`.`name`"            , nam ), ","
				" ", construct<sql_column>("`char`.`class`"           , cla ), ","
				" ", construct<sql_column>("`pybot_mvp_stats`.`round`", rou ), ","
				" ", construct<sql_column>("`pybot_mvp_stats`.`mobs`" , mobs), " "
				"FROM"
				" `char`,"
				" `pybot_mvp_stats` "
				"WHERE `char`.`char_id` = `pybot_mvp_stats`.`char_id` "
				"ORDER BY"
				" `pybot_mvp_stats`.`round` DESC,"
				" `pybot_mvp_stats`.`mobs` DESC "
				"LIMIT ", construct<sql_param>(lim)
			);
			while (ses->next_row())
				res->push_back(initialize<mvp_stats>(nam, e_job(cla), rou, mobs));
		});
	} else {
		std::vector<std::string> job_strs;
		std::transform(
			ALL_RANGE(jobs),
			pybot::back_inserter(job_strs),
			[] (e_job job) -> std::string {return print(job);}
		);
		std::string job_lis = concatinate_strings(ALL_RANGE(job_strs), ", ");
		sql_session::open([lim, &res, &job_lis] (sql_session* ses) {
			char nam[NAME_LENGTH];
			int cla;
			int rou;
			int mobs;
			ses->execute(
				"SELECT"
				" ", construct<sql_column>("`char`.`name`"            , nam ), ","
				" ", construct<sql_column>("`char`.`class`"           , cla ), ","
				" ", construct<sql_column>("`pybot_mvp_stats`.`round`", rou ), ","
				" ", construct<sql_column>("`pybot_mvp_stats`.`mobs`" , mobs), " "
				"FROM"
				" `char`,"
				" `pybot_mvp_stats` "
				"WHERE"
				" `char`.`class` IN (", job_lis, ") AND"
				" `char`.`char_id` = `pybot_mvp_stats`.`char_id` "
				"ORDER BY"
				" `pybot_mvp_stats`.`round` DESC,"
				" `pybot_mvp_stats`.`mobs` DESC "
				"LIMIT ", construct<sql_param>(lim)
			);
			while (ses->next_row())
				res->push_back(initialize<mvp_stats>(nam, e_job(cla), rou, mobs));
		});
	}
	return res;
}

// MVP���v���Ɖ��B
std::shared_ptr<mvp_stats> // �Ɖ��MVP���v�B
query_mvp_stats(
	int cid // �L�����N�^�[ID�B
) {
	ptr<mvp_stats> res;
	sql_session::open([cid, &res] (sql_session* ses) {
		char nam[NAME_LENGTH];
		int cla;
		int rou;
		int mobs;
		ses->execute(
			"SELECT"
			" ", construct<sql_column>("`char`.`name`", nam), ","
			" ", construct<sql_column>("`char`.`class`", cla), ","
			" ", construct<sql_column>("`pybot_mvp_stats`.`round`", rou), ","
			" ", construct<sql_column>("`pybot_mvp_stats`.`mobs`", mobs), " "
			"FROM"
			" `char`,"
			" `pybot_mvp_stats` "
			"WHERE"
			" `char`.`char_id` = ", construct<sql_param>(cid), " AND"
			" `char`.`char_id` = `pybot_mvp_stats`.`char_id`"
		);
		if (ses->next_row())
			res = initialize<mvp_stats>(nam, e_job(cla), rou, mobs);
	});
	return res;
}

// Bot���퓬���ɕ���ꎮ�������[�h����B
void reload_equipset_in_battle(
	int cid // �L�����N�^�[ID�B
) {
	block_if* bot = find_map_data(all_bots, cid);
	if (bot) bot->last_reloaded_equipset_tick() = 0;
}

// �Ō�Ɏ}��������ID��ݒ肷��B
void set_last_summoned_id(
	map_session_data* sd, // �Z�b�V�����f�[�^�B
	int bid               // �}�������������X�^�[��ID�B
) {
	auto lea = find_map_data(all_leaders, sd->status.char_id);
	if (!lea) {
		lea = construct<leader_t>(sd);
		all_leaders[lea->char_id()] = lea;
	}
	lea->last_summoned_id() = bid;
}

// ���݂̃}�b�v�̏����ʒu��ݒ肷��B
void set_map_initial_position(
	map_session_data* sd // �Z�b�V�����f�[�^�B
) {
	auto pos = find_map_data(map_initial_positions, sd->status.char_id);
	if (!pos) {
		pos = initialize<block_list>(sd->bl);
		map_initial_positions[sd->status.char_id] = pos;
	} else if (pos->m != sd->bl.m) *pos = sd->bl;

}

// �X�L���������h�v���e�N�^�[��ɐݒu�\���𔻒肷��B
bool // ���ʁB
skill_is_layable_on_lp(
	e_skill kid // �X�L��ID�B
) {
	return KEY_EXISTS(LAYABLE_ON_LP_SKILLS, kid);
}

// �t�B�[�o�[�Ɋւ�������X�V����B
void update_fever() {
	fever_rates.clear();
	sql_session::open([] (sql_session* ses) {
		int fev_rat = 2;
		ses->execute(
			"SELECT"
			" `", construct<sql_column>("value", fev_rat), "` "
			"FROM `global_acc_reg_num` "
			"WHERE"
			" `account_id` = ", construct<sql_param>(1                     ), " AND"
			" `key` = "       , construct<sql_param>(FEVER_RATE_KEY.c_str()), " AND"
			" `index` = "     , construct<sql_param>(0                     )
		);
		ses->next_row();
		int dou_fev_rat = fev_rat * 2;
		ses->execute(
			"SELECT"
			" `", construct<sql_column>("value", dou_fev_rat), "` "
			"FROM `global_acc_reg_num` "
			"WHERE"
			" `account_id` = ", construct<sql_param>(1                     ), " AND"
			" `key` = "       , construct<sql_param>(FEVER_RATE_KEY.c_str()), " AND"
			" `index` = "     , construct<sql_param>(1                     )
		);
		ses->next_row();
		int nat_typ;
		int map_typ;
		int siz;
		ses->execute(
			"SELECT"
			" `", construct<sql_column>("nation_type", nat_typ), "`,"
			" `", construct<sql_column>("map_type"   , map_typ), "`,"
			" `", construct<sql_column>("size"       , siz    ), "` "
			"FROM `pybot_fever_size`"
		);
		std::vector<fever_size> sizs;
		while (ses->next_row())
			sizs.push_back(fever_size{nation_types(nat_typ), map_types(map_typ), siz});
		std::vector<int> fev_ids;
		for (const fever_size& siz : sizs) {
			int typ = siz.nation_type * 100 + siz.map_type;
			auto& maps = type_maps[typ];
			for (int i = 0; i < siz.size; ++i) {
				if (i >= maps.size()) break;
				for (;;) {
					auto map = maps[rnd() % maps.size()];
					if (map->fever_flag &&
						!KEY_EXISTS(fever_rates, map->id)
					) {
						fever_rates[map->id] = fev_rat;
						fev_ids.push_back(map->id);
						break;
					}
				}
			}
		}

		if (fev_ids.size() >= DOUBLE_FEVER_MAPS_SIZE) {
			std::sort(ALL_RANGE(fev_ids), [](int lid, int rid) -> bool {
				auto lmap = id_maps.at(lid);
				auto rmap = id_maps.at(rid);
				return lmap->average_level > rmap->average_level;
			});
			std::unordered_set<int> dou_fev_ids;
			while (dou_fev_ids.size() < DOUBLE_FEVER_MAPS_SIZE) {
				int ind = rnd() % fev_ids.size();
				int id = fev_ids[ind];
				auto map = id_maps.at(id);
				if (dou_fev_ids.find(id) == dou_fev_ids.end() &&
					(ind < DOUBLE_FEVER_MAPS_SIZE ||
						map->mvp_flag
					)
				) {
					fever_rates[id] = dou_fev_rat;
					dou_fev_ids.insert(id);
				}
			}

		}

		ses->execute("TRUNCATE `pybot_fever_rate`");
		for (auto& fev_rat_val : fever_rates) {
			int id = fev_rat_val.first;
			int rat = fev_rat_val.second;
			auto map = id_maps.at(id);
			ses->execute(
				"INSERT INTO `pybot_fever_rate` "
				"VALUES "
				"(", construct<sql_param>(map->name_english.c_str()), ","
				" ", construct<sql_param>(rat                      ), ")"
			);
		}
	});
}

// -----------------------------------------------------------------------------
// �O������Q�Ƃ����ϐ��̒�`

// �L���b�V���o���l�̓o�^���B
const std::string CASH_EXP = "CASH_EXP";

// PyBot�p�_�~�[NPC���B
const std::string PYBOT_DUMMY_NPC_NAME = "PyBotDummy";

}
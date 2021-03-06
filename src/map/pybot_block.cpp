// [GonBee]
// パーティーBOT機能のブロックを定義する。

#include "pybot_internal.hpp"

namespace pybot {

// -----------------------------------------------------------------------------
// ブロック型のメンバー関数の定義

bool& battler_if::around_wall_exists() {RAISE_NOT_IMPLEMENTED_ERROR;}
void battler_if::attack(block_if* blo, bool con) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& battler_if::attacked_by_blower() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& battler_if::attacked_by_detector() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::vector<block_if*>& battler_if::attacked_enemies() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& battler_if::attacked_long_range_attacker() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& battler_if::attacked_short_range_attacker() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& battler_if::attacked_short_range_attackers() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& battler_if::attacked_via_devotion() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& battler_if::battle_index() {RAISE_NOT_IMPLEMENTED_ERROR;}
battle_modes& battler_if::battle_mode() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_attack(block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_hp(int rat) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_normal_attack(block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_sp(int rat) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_supply_hp() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_supply_sp() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_use_skill(e_skill kid, int klv, block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::check_use_taunt_skill(block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
distance_policy_values battler_if::default_distance_policy_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
normal_attack_policy_values battler_if::default_normal_attack_policy_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
distance_policy_values& battler_if::distance_policy_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_hold_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_def() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_def_vit() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_flee() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_hit() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_level() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_mob_high_mdef() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_supply_hp_rate() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::get_supply_sp_rate() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::guild_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& battler_if::is_best_pos() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_dead() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_invincible() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_no_castcancel() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_no_gemstone() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_primary() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::is_wall_side() {RAISE_NOT_IMPLEMENTED_ERROR;}
void battler_if::iterate_meta_mobs(const std::vector<block_if*>* enes, block_if* tar_ene, battle_modes bat_mod, yield_meta_mob_func yie) {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& battler_if::leader() {RAISE_NOT_IMPLEMENTED_ERROR;}
void battler_if::load_policy(int mid, distance_policy_values* dis_pol_val, normal_attack_policy_values* nor_att_pol_val) {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::max_distance_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& battler_if::member_index() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::min_distance_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::mob_is_first(block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::mob_is_ignore(block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::no_knockback() {RAISE_NOT_IMPLEMENTED_ERROR;}
normal_attack_policy_values& battler_if::normal_attack_policy_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::party_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<e_skill>>& battler_if::reject_skills() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::skill_ratio(e_skill kid, int klv, block_if* tar) {RAISE_NOT_IMPLEMENTED_ERROR;}
void battler_if::stop_attacking() {RAISE_NOT_IMPLEMENTED_ERROR;}
void battler_if::stop_walking(int typ) {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& battler_if::target_enemy() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::teleport(block_list* bl_) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::walk_bl(block_list* tbl, int ran, const check_distance_pred& nea) {RAISE_NOT_IMPLEMENTED_ERROR;}
ai_t::done_func& battler_if::walk_end_func() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool battler_if::walk_xy(int x, int y, int ran) {RAISE_NOT_IMPLEMENTED_ERROR;}
e_element battler_if::weapon_attack_element() {RAISE_NOT_IMPLEMENTED_ERROR;}
int battler_if::weapon_attack_element_ratio(block_if* tar) {RAISE_NOT_IMPLEMENTED_ERROR;}

int& bot_if::bot_index() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick& bot_if::last_emotion_tick() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick& bot_if::last_reloaded_equipset_tick() {RAISE_NOT_IMPLEMENTED_ERROR;}
void bot_if::reload_buffer_equipset(equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
void bot_if::reload_skill_equipset(e_skill kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
void bot_if::respawn() {RAISE_NOT_IMPLEMENTED_ERROR;}
skill_id_set& bot_if::using_skills() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_skill& bot_if::want_to_play() {RAISE_NOT_IMPLEMENTED_ERROR;}

std::vector<block_if*>& enemy_if::attacked_battlers() {RAISE_NOT_IMPLEMENTED_ERROR;}
int enemy_if::away_distance(block_if* lea) {RAISE_NOT_IMPLEMENTED_ERROR;}
std::vector<block_if*>& enemy_if::close_battlers() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool enemy_if::fullpower(block_if* lea) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_earthquake() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_knockback_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_layout_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_long_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_long_weapon_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_path_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_summon_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_unequip_armor_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_unequip_helm_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_unequip_shield_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_unequip_weapon_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& enemy_if::has_usefull_skill() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool enemy_if::need_to_leave() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& enemy_if::skill_target_battler() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& enemy_if::target_battler() {RAISE_NOT_IMPLEMENTED_ERROR;}
pos_t enemy_if::waiting_position() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& enemy_if::walk_target_battler() {RAISE_NOT_IMPLEMENTED_ERROR;}

void general_if::act_end() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::attack_element_ratio(block_if* tar, e_element ele) {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::attack_range() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_list* general_if::bl() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::can_act() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::can_move() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::can_reach_bl(block_list* bl_, bool eas) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::can_reach_block(block_if* blo, bool eas) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::can_reach_xy(int x, int y, bool eas) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_attack_range(block_if* blo) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_line_bl(block_list* bl_) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_line_block(block_if* blo) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_line_xy(int x, int y) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_range_bl(block_list* bl0, block_list* bl1, int dis) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_range_blxy(block_list* bl_, int x, int y, int dis) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_range_xy(int x0, int y0, int x1, int y1, int dis) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_sc_types(const sc_type_set& sc_typs) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_skill_range_block(e_skill kid, int klv, block_if* blo) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::check_skill_range_xy(e_skill kid, int klv, int x, int y) {RAISE_NOT_IMPLEMENTED_ERROR;}
defType general_if::def() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::def2() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_element general_if::element() {RAISE_NOT_IMPLEMENTED_ERROR;}
void general_if::emotion(emotion_type typ) {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::flee() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::hit() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::hp() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::hp_ratio() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::inner_product(const coords_t& a, const coords_t& b) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_attacking() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_casting() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_ensemble() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_gospel() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_hiding() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_long_range_attacker() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_long_weapon_immune() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_magic_immune() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_paralysis() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_short_range_attacker() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_solo() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::is_walking() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::level() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::max_hp() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::max_sp() {RAISE_NOT_IMPLEMENTED_ERROR;}
defType general_if::mdef() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::string general_if::name() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool general_if::on_water() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_race general_if::race() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_race2 general_if::race2() {RAISE_NOT_IMPLEMENTED_ERROR;}
status_change* general_if::sc() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick general_if::sc_rest(sc_type typ) {RAISE_NOT_IMPLEMENTED_ERROR;}
size general_if::size_() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::skill_advantage(int x, int y) {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::sp() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::sp_ratio() {RAISE_NOT_IMPLEMENTED_ERROR;}
unit_data* general_if::ud() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::vit() {RAISE_NOT_IMPLEMENTED_ERROR;}
int general_if::walkpath_length() {RAISE_NOT_IMPLEMENTED_ERROR;}
pos_t general_if::walkpath_pos(int stes) {RAISE_NOT_IMPLEMENTED_ERROR;}

homun_data* homun_if::hd() {RAISE_NOT_IMPLEMENTED_ERROR;}
homun_mapid homun_if::homun_mapid_() {RAISE_NOT_IMPLEMENTED_ERROR;}

std::unordered_map<int,t_tick>& item_user_if::item_used_ticks() {RAISE_NOT_IMPLEMENTED_ERROR;}
void item_user_if::use_item(int ind, bool exc) {RAISE_NOT_IMPLEMENTED_ERROR;}

std::unordered_map<int,ptr<block_if>>& leader_if::ally_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& leader_if::attack_target() {RAISE_NOT_IMPLEMENTED_ERROR;}
coords_t leader_if::back_base() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::vector<ptr<block_if>>& leader_if::bots() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_list& leader_if::center() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::unordered_map<int,ptr<block_if>>& leader_if::enemies() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if* leader_if::find_bot(const std::string& nam) {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if* leader_if::find_member(const std::string& nam) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool leader_if::flooritem_to_be_ignored(flooritem_data* fit) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& leader_if::great_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& leader_if::ignore_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,coords_t>>& leader_if::journals() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick& leader_if::last_heavy_tick() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& leader_if::last_summoned_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& leader_if::member_dead() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::vector<block_if*>& leader_if::members() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick leader_if::next_heavy_tick() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& leader_if::not_ignore_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::stringstream& leader_if::output_buffer() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& leader_if::passive() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& leader_if::resurrectionable() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<rush_modes>>& leader_if::rush() {RAISE_NOT_IMPLEMENTED_ERROR;}
void leader_if::save_team(int tea_num) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& leader_if::sell_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
void leader_if::show_next() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& leader_if::sp_suppliable() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool& leader_if::stay() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& leader_if::storage_put_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,team_t>>& leader_if::teams() {RAISE_NOT_IMPLEMENTED_ERROR;}
void leader_if::update_bot_indices() {RAISE_NOT_IMPLEMENTED_ERROR;}
void leader_if::update_member_indices() {RAISE_NOT_IMPLEMENTED_ERROR;}

int& member_if::account_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::berserk_rate() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::can_ka(block_if* tar_mem) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,int>>& member_if::cart_auto_get_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& member_if::char_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_skill member_if::combo_skill_id() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,distance_policy>>& member_if::distance_policies() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,equipset_t>>& member_if::equipsets() {RAISE_NOT_IMPLEMENTED_ERROR;}
int& member_if::fd() {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::find_broken_equip(int bas) {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::find_cart(const std::string& nam) {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::find_cart(const item_key& key) {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::find_inventory(const std::string& nam) {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::find_inventory(const item_key&, int equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::find_item_not_save_mobs(int nid) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::find_item_save_mobs(int nid) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::find_skill_ignore_mobs(e_skill kid, block_if* ene) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& member_if::first_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,e_skill>>& member_if::first_skills() {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::get_skill_members() {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::get_skill_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
t_tick member_if::get_skill_tail(e_skill kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::hold_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<block_if>& member_if::homun() {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::identify_equip(item* itm, storage_context* inv_con, storage_context* car_con) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& member_if::ignore_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::is_carton() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::is_sit() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& member_if::item_not_save_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& member_if::item_save_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_buffer_equipset(sc_type sc_typ, equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_equipset(int mid, equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_equipset(const std::vector<ptr<equipset_item>>& es_itms, equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_map_equipset(int m, equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_play_skill(int mid, e_skill* kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::load_skill_equipset(e_skill kid, equip_pos* equ) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<loot_modes>>& member_if::loot() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::loot_limit() {RAISE_NOT_IMPLEMENTED_ERROR;}
int member_if::loot_limit_value() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::magicpower_is_active() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::max_cast_time() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::max_distance() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::min_distance() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_def() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_def_vit() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_flee() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_hit() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_level() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::mob_high_mdef() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,normal_attack_policy>>& member_if::normal_attack_policies() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool member_if::over_loot(int wei_inc) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<block_if>& member_if::pet() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,play_skill>>& member_if::play_skills() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,int>>& member_if::recover_hp_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,int>>& member_if::recover_sp_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
std::unordered_set<int>& member_if::request_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::safe_cast_time() {RAISE_NOT_IMPLEMENTED_ERROR;}
map_session_data*& member_if::sd() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<e_skill,skill_equipset>>& member_if::skill_equipsets() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<sc_type,buffer_equipset>>& member_if::buffer_equipsets() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,map_equipset>>& member_if::map_equipsets() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::supply_hp_rate() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::supply_sp_rate() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,e_element>>& member_if::kew_elements() {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::sit() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int>>& member_if::skill_ignore_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::skill_members() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<regnum_t<int>>& member_if::skill_mobs() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<e_skill,int>>& member_if::skill_tails() {RAISE_NOT_IMPLEMENTED_ERROR;}
void member_if::stand() {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<int,int>>& member_if::storage_get_items() {RAISE_NOT_IMPLEMENTED_ERROR;}
e_job member_if::substancial_job() {RAISE_NOT_IMPLEMENTED_ERROR;}

bool mob_if::has_can_attack() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::can_be_provoke() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::has_can_move() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::has_detector() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::has_knockback_immune() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::has_mvp() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::has_status_immune() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_berserk() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_boss() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_freezable() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_flora() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_great(block_if* lea) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_summoned() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool mob_if::is_undead() {RAISE_NOT_IMPLEMENTED_ERROR;}
mob_data*& mob_if::md() {RAISE_NOT_IMPLEMENTED_ERROR;}

pet_data* pet_if::pd() {RAISE_NOT_IMPLEMENTED_ERROR;}

bool skill_target_if::check_skill_used_tick(e_skill kid, t_tick ela_tic) {RAISE_NOT_IMPLEMENTED_ERROR;}
std::unordered_map<e_skill,t_tick>& skill_target_if::skill_used_ticks() {RAISE_NOT_IMPLEMENTED_ERROR;}

bool skill_user_if::can_use_skill(e_skill kid, int klv) {RAISE_NOT_IMPLEMENTED_ERROR;}
ai_t::done_func& skill_user_if::cast_end_func() {RAISE_NOT_IMPLEMENTED_ERROR;}
int skill_user_if::check_skill(e_skill kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool skill_user_if::collect_coins(int cou) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool skill_user_if::collect_spirits(int cou) {RAISE_NOT_IMPLEMENTED_ERROR;}
s_skill* skill_user_if::find_skill(const std::string& nam) {RAISE_NOT_IMPLEMENTED_ERROR;}
int skill_user_if::get_max_cast_time() {RAISE_NOT_IMPLEMENTED_ERROR;}
int skill_user_if::get_safe_cast_time() {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::iterate_skill(yield_skill_func yie) {RAISE_NOT_IMPLEMENTED_ERROR;}
ptr<registry_t<e_skill,int>>& skill_user_if::limit_skills() {RAISE_NOT_IMPLEMENTED_ERROR;}
int skill_user_if::skill_point() {RAISE_NOT_IMPLEMENTED_ERROR;}
s_skill* skill_user_if::skill(e_skill kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
int skill_user_if::skill_range(e_skill kid, int klv) {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::skill_up(e_skill kid) {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::use_encore(e_skill dan_id) {RAISE_NOT_IMPLEMENTED_ERROR;}
bool skill_user_if::use_magicpower() {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::use_skill_bl(e_skill kid, int klv, block_list* bl_, bool tur_end, ai_t::done_func cas_end_fun) {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::use_skill_block(e_skill kid, int klv, block_if* blo, bool tur_end, ai_t::done_func cas_end_fun) {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::use_skill_self(e_skill kid, int klv, bool tur_end, ai_t::done_func cas_end_fun) {RAISE_NOT_IMPLEMENTED_ERROR;}
void skill_user_if::use_skill_xy(e_skill kid, int klv, int x, int y, bool tur_end, ai_t::done_func cas_end_fun) {RAISE_NOT_IMPLEMENTED_ERROR;}

bool slave_if::exists() {RAISE_NOT_IMPLEMENTED_ERROR;}
bool slave_if::is_active() {RAISE_NOT_IMPLEMENTED_ERROR;}
block_if*& slave_if::master() {RAISE_NOT_IMPLEMENTED_ERROR;}

// 周辺に壁があるか。
bool& battler_impl::around_wall_exists() {
	return around_wall_exists_;
}

// ブロックを攻撃する。
void battler_impl::attack(
	block_if* blo, // ブロック。
	bool con       // 連続か。
) {
	unit_attack(bl(), blo->bl()->id, con);
}

// ノックバックスキル所持モンスターに攻撃を受けているか。
bool& battler_impl::attacked_by_blower() {
	return attacked_by_blower_;
}

// 検知可能モンスターに攻撃を受けているか。
bool& battler_impl::attacked_by_detector() {
	return attacked_by_detector_;
}

// 攻撃を受けている敵モンスターのベクタ。
std::vector<block_if*>& battler_impl::attacked_enemies() {
	return attacked_enemies_;
}

// 攻撃を受けている遠隔攻撃モンスター。
block_if*& battler_impl::attacked_long_range_attacker() {
	return attacked_long_range_attacker_;
}

// 攻撃を受けている近接攻撃モンスター。
block_if*& battler_impl::attacked_short_range_attacker() {
	return attacked_short_range_attacker_;
}

// 攻撃を受けている近接攻撃モンスター数。
int& battler_impl::attacked_short_range_attackers() {
	return attacked_short_range_attackers_;
}

// ディボーション経由で攻撃を受けているか。
bool& battler_impl::attacked_via_devotion() {
	return attacked_via_devotion_;
}

// 戦闘時のインデックス。
int& battler_impl::battle_index() {
	return battle_index_;
}

// 戦闘モード。
battle_modes& battler_impl::battle_mode() {
	return battle_mode_;
}

// バトラーが敵モンスターを攻撃しても大丈夫かを判定する。
bool // 結果。
battler_impl::check_attack(
	block_if* ene // 敵モンスター。
) {
	block_if* tan = ene->target_battler();
	return battle_mode() == BM_TAUNT ||
		!ene->has_can_attack() ||
		ene->is_long_range_attacker() ||
		ene->is_flora() ||
		ene->is_paralysis() ||
		ene->sc()->data[SC_BLADESTOP] ||
		(ene->is_berserk() && 
			(!ene->is_great(leader()) ||
				!around_wall_exists() ||
				!tan ||
				!tan->is_primary() ||
				!tan->attacked_by_blower() ||
				tan->is_wall_side()
			)
		);
}

// バトラーのHPが大丈夫かを判定する。
bool // 結果。
battler_impl::check_hp(
	int rat // HPの四分率。
) {
	return check_quad_ratio(hp(), max_hp(), rat) ||
		!check_supply_hp();
}

// バトラーが敵モンスターを通常攻撃しても大丈夫かを判定する。
bool // 結果。
battler_impl::check_normal_attack(
	block_if* ene // 敵モンスター。
) {
	return check_attack(ene) &&
		!ene->is_hiding() &&
		(is_short_range_attacker() ||
			!ene->is_long_weapon_immune()
		);
}

// バトラーのSPが大丈夫かを判定する。
bool // 結果。
battler_impl::check_sp(
	int rat // SPの四分率。
) {
	return ((leader()->sp_suppliable() ||
				sc()->data[SC_DIGESTPOTION]
			) && !check_supply_sp()
		) || check_quad_ratio(sp(), max_sp(), rat);
}

// バトラーがHPの供給を許可するかを判定する。
bool // 結果。
battler_impl::check_supply_hp() {
	return hp() * 100 < get_supply_hp_rate() * max_hp();
}

// バトラーがSPの供給を許可するかを判定する。
bool // 結果。
battler_impl::check_supply_sp() {
	return sp() * 100 < get_supply_sp_rate() * max_sp();
}

// バトラーが敵モンスターにスキルを使っても大丈夫かを判定する。
bool // 結果。
battler_impl::check_use_skill(
	e_skill kid,  // スキルID。
	int klv,      // スキルレベル。
	block_if* ene // 敵モンスター。
) {
	return check_attack(ene) &&
		(skill_get_nk(kid) & NK_NO_DAMAGE ||
			((skill_get_inf3(kid) & INF3_HIT_HIDING ||
					!ene->is_hiding()
				) && (!(skill_get_type(kid) & BF_WEAPON) ||
					((skill_range(kid, klv) > 3 ||
							!ene->sc()->data[SC_SAFETYWALL]
						) && (skill_range(kid, klv) <= 3 ||
							!ene->is_long_weapon_immune()
						) && (!ene->sc()->data[SC_REFLECTSHIELD] ||
							skill_range(kid, klv) > 3 ||
							kid == NJ_ISSEN ||
							check_hp(3)
						)
					)
				) && (!(skill_get_type(kid) & BF_MAGIC) ||
					(!ene->is_magic_immune() &&
						(!(skill_get_inf(kid) & INF_ATTACK_SKILL) ||
							!ene->sc()->data[SC_FOGWALL]
						)
					)
				)
			)
		);
}

// バトラーが敵モンスターに挑発目的でスキルを使うべきかを判定する。
bool battler_impl::check_use_taunt_skill(block_if* ene) {
	return !check_attack_range(ene) &&
		ene->has_can_attack() &&
		ene->has_can_move() &&
		!ene->is_berserk() &&
		!ene->md()->tdmg &&
		!ene->sc()->data[SC_PROVOKE];
}

// 距離ポリシー値。
distance_policy_values& battler_impl::distance_policy_value() {
	return distance_policy_value_;
}

// 最高の位置か。
bool& battler_impl::is_best_pos() {
	return is_best_pos_;
}

// 一次バトラーかを判定する。
bool // 結果。
battler_impl::is_primary() {
	return !battle_index();
}

// メタモンスターを反復する。
void battler_impl::iterate_meta_mobs(
	const std::vector<block_if*>* enes, // 敵モンスターのベクタ。
	block_if* tar_ene,                  // ターゲットしている敵モンスター。
	battle_modes bat_mod,               // 戦闘モード。
	yield_meta_mob_func yie             // メタモンスター獲得ハンドラ。
) {
	if (bat_mod != BM_NONE) {
		int pre_mid = 0;
		if (enes) {
			for (block_if* ene : *enes) {
				if (ene->md()->mob_id == pre_mid) continue;
				yie(MM_CAUTION + ene->md()->mob_id);
				pre_mid = ene->md()->mob_id;
			}
		}
		if (tar_ene) yie(tar_ene->md()->mob_id);
	}
	if (leader()->member_dead()) yie(MM_MEMBER_DEAD);
	if (bat_mod != BM_NONE) {
		if (!check_hp(4)) {
			if (!check_hp(3)) {
				if (!check_hp(2)) {
					if (!check_hp(1)) {
						yie(MM_HP_DECLINE1);
					}
					yie(MM_HP_DECLINE2);
				}
				yie(MM_HP_DECLINE3);
			}
			yie(MM_HP_DECLINE4);
		}
		if (!check_sp(4)) {
			if (!check_sp(3)) {
				if (!check_sp(2)) {
					if (!check_sp(1)) {
						yie(MM_SP_DECLINE1);
					}
					yie(MM_SP_DECLINE2);
				}
				yie(MM_SP_DECLINE3);
			}
			yie(MM_SP_DECLINE4);
		}
		if (tar_ene) {
			if (tar_ene->level() >= get_mob_high_level()) yie(MM_HIGH_LEVEL);
			if (tar_ene->hit() >= get_mob_high_hit()) yie(MM_HIGH_HIT);
			if (tar_ene->flee() >= get_mob_high_flee()) yie(MM_HIGH_FLEE);
			if (tar_ene->def() + tar_ene->vit() >= get_mob_high_def_vit()) yie(MM_HIGH_DEF_VIT);
			if (tar_ene->def() >= get_mob_high_def()) yie(MM_HIGH_DEF);
			if (tar_ene->mdef() >= get_mob_high_mdef()) yie(MM_HIGH_MDEF);
			if (tar_ene->is_flora()) yie(MM_FLORA);
			if (tar_ene->is_great(leader())) yie(MM_GREAT);
			else yie(MM_NOT_GREAT);
			yie(MM_RACE + tar_ene->race());
			yie(MM_ELEMENT + tar_ene->element());
			yie(MM_SIZE + tar_ene->size_());
			if (tar_ene->is_boss()) yie(MM_BOSS);
			else yie(MM_COMMON);
		}
		yie(MM_BASE);
		yie(MM_BACKUP);
	} else 	yie(MM_REST);
}

// 通常攻撃ポリシー値。
normal_attack_policy_values& battler_impl::normal_attack_policy_value() {
	return normal_attack_policy_value_;
}

// スキルのダメージ倍率を計算する。
int // 計算した倍率。
battler_impl::skill_ratio(
	e_skill kid,  // スキルID。
	int klv,      // スキルレベル。
	block_if* tar // ターゲット。
) {
	int rat = 0;
	if (!(skill_get_type(kid) & BF_MAGIC) ||
		!tar->is_magic_immune()
	) {
		e_element ele = e_element(skill_get_ele(kid, klv));
		if (ele == ELE_NONE) ele = weapon_attack_element();
		rat = attack_element_ratio(tar, ele);
	}
	return rat;
}

// バトラーが歩き始める。
void battler_impl::start_walking() {
	if (dynamic_cast<member_impl*>(this)) {
		pc_delinvincibletimer(sd());
		if (sc()->data[SC_DANCING] &&
			!sc()->data[SC_LONGING]
		) {
			status_change_end(bl(), SC_DANCING, INVALID_TIMER);
			skill_used_ticks()[BD_ADAPTATION] = now;
		}
		if (is_gospel()) status_change_end(bl(), SC_GOSPEL, INVALID_TIMER);
	}
}

// 攻撃を停止する。
void battler_impl::stop_attacking() {
	unit_stop_attack(bl());
}

// 歩行を停止する。
void battler_impl::stop_walking(int typ) {
	unit_stop_walking(bl(), typ);
}

// ターゲットしている敵モンスター。
block_if*& battler_impl::target_enemy() {
	return target_enemy_;
}

// バトラーがブロックに向かって歩く。
bool // 離れているか。
battler_impl::walk_bl(
	block_list* tbl,               // ターゲットのブロック。
	int ran,                       // 近づく距離。
	const check_distance_pred& nea // 近いか。
) {
	if ((nea &&
			nea(bl(), tbl, ran)
		) || (!nea &&
			check_range_bl(bl(), tbl, ran)
		)
	) {
		stop_walking();
		return false;
	}
	if (!is_walking() ||
		!check_range_blxy(tbl, ud()->to_x, ud()->to_y, ran)
	) {
		start_walking();
		unit_walktobl(bl(), tbl, ran, 0);
	}
	return true;
}

// 歩行終了ハンドラ。
ai_t::done_func& battler_impl::walk_end_func() {
	return walk_end_func_;
}

// バトラーが座標に向かって歩く。
bool // 離れているか。
battler_impl::walk_xy(
	int x,  // X座標。
	int y,  // Y座標。
	int ran // 近づく距離。
) {
	if (check_range_blxy(bl(), x, y, ran)) {
		stop_walking();
		return false;
	}
	if ((!is_walking() ||
			!check_range_xy(ud()->to_x, ud()->to_y, x, y, ran)
		) && can_move()
	) {
		start_walking();
		ud()->target_to = -1;
		ud()->chaserange = ran;
		unit_walktoxy(bl(), x, y, 0);
	}
	return true;
}

// 武器攻撃の属性ダメージ倍率を計算する。
int // 計算した倍率。
battler_impl::weapon_attack_element_ratio(
	block_if* tar // ターゲット。
) {
	return attack_element_ratio(tar, weapon_attack_element());
}

// Botのインデックス。
int& bot_impl::bot_index() {
	return bot_index_;
}

// 最後にエモーションを表示したチック。
t_tick& bot_impl::last_emotion_tick() {
	return last_emotion_tick_;
}

// 最後に武具一式をリロードしたチック。
t_tick& bot_impl::last_reloaded_equipset_tick() {
	return last_reloaded_equipset_tick_;
}

// バッファ武具一式をリロードする。
void bot_impl::reload_buffer_equipset(
	equip_pos* equ // 装備済み部位。
) {
	buffer_equipsets()->iterate(
		[this, equ] (sc_type sc_typ, buffer_equipset* equ_set) -> bool {
			if (!sc()->data[sc_typ]) load_buffer_equipset(sc_typ, equ);
			return true;
		}
	);
}

// スキル武具一式をリロードする。
void bot_impl::reload_skill_equipset(e_skill kid) {
	if (using_skills().find(kid) == using_skills().end()) {
		load_skill_equipset(kid);
		using_skills().insert(kid);
	}
}

// Botがリスポーンする。
void bot_impl::respawn() {
	walk_end_func() = cast_end_func() = nullptr;
	pc_respawn(sd(), CLR_OUTSIGHT);
	sd()->state.rewarp = 0;
	clif_parse_LoadEndAck(fd(), sd());
}

// Botがテレポートする。
bool // テレポートしたか。
bot_impl::teleport(
	block_list* bl_ // テレポート先のブロックリスト。
) {
	bool done = false;
	if (bl_->m != bl()->m ||
		bl_->x != bl()->x ||
		bl_->y != bl()->y
	) {
		walk_end_func() = cast_end_func() = nullptr;
		stop_attacking();
		stop_walking(USW_FORCE_STOP);
		pc_setpos(sd(), map_id2index(bl_->m), bl_->x, bl_->y, CLR_TELEPORT, true);
		sd()->state.rewarp = 0;
		clif_parse_LoadEndAck(fd(), sd());
		pc_delinvincibletimer(sd());
		done = true;
	}
	return done;
}

// 使用中のスキルのセット。
skill_id_set& bot_impl::using_skills() {
	return using_skills_;
}

// Botが演奏したいスキル。
e_skill& bot_impl::want_to_play() {
	return want_to_play_;
}

// クライアントにおいて2つのブロックリストが距離範囲内かを判定する。
bool // 結果。
client_impl::check_range_bl(
	block_list* bl0, // ブロックリスト0。
	block_list* bl1, // ブロックリスト1。
	int dis          // 距離。
) {
	return check_distance_client_bl(bl0, bl1, dis);
}

// クライアントにおいてブロックリストと座標が距離範囲内かを判定する。
bool // 結果。
client_impl::check_range_blxy(
	block_list* bl_, // ブロックリスト。
	int x,           // X座標。
	int y,           // Y座標。
	int dis          // 距離。
) {
	return check_distance_client_blxy(bl_, x, y, dis);
}

// クライアントにおいて2つの座標が距離範囲内かを判定する。
bool // 結果。
client_impl::check_range_xy(
	int x0, // X0座標。
	int y0, // Y0座標。
	int x1, // X1座標。
	int y1, // Y1座標。
	int dis // 距離。
) {
	return check_distance_client_xy(x0, y0, x1, y1, dis);
}

// 攻撃を受けているバトラーのベクタ。
std::vector<block_if*>& enemy_impl::attacked_battlers() {
	return attacked_battlers_;
}

// 敵モンスターから離れていると言える距離を取得する。
int // 取得した距離。
enemy_impl::away_distance(
	block_if* lea // リーダー。
) {
	int dis = battle_config.pybot_away_distance;
	if (is_great(lea) &&
		is_short_range_attacker()
	) dis = battle_config.pybot_away_distance_great;
	return dis;
}

// 攻撃範囲内にいるバトラーのベクタ。
std::vector<block_if*>& enemy_impl::close_battlers() {
	return close_battlers_;
}

// フルパワーを発揮するべきかを判定する。
bool // 結果。
enemy_impl::fullpower(
	block_if* lea // リーダー。
) {
	return lea->rush()->get() == RM_FULL_POWER ||
		is_great(lea);
}

// アースクエイク所持か。
bool& enemy_impl::has_earthquake() {
	return has_earthquake_;
}

// ノックバックスキル所持か。
bool& enemy_impl::has_knockback_skill() {
	return has_knockback_skill_;
}

// レイアウトスキル所持か。
bool& enemy_impl::has_layout_skill() {
	return has_layout_skill_;
}

// 遠隔スキル所持か。
bool& enemy_impl::has_long_skill() {
	return has_long_skill_;
}

// 遠隔物理スキル所持か。
bool& enemy_impl::has_long_weapon_skill() {
	return has_long_weapon_skill_;
}

// パススキル所持か。
bool& enemy_impl::has_path_skill() {
	return has_path_skill_;
}

// 召喚スキル所持か。
bool& enemy_impl::has_summon_skill() {
	return has_summon_skill_;
}

// 鎧解除スキル所持か。
bool& enemy_impl::has_unequip_armor_skill() {
	return has_unequip_armor_skill_;
}

// 兜解除スキル所持か。
bool& enemy_impl::has_unequip_helm_skill() {
	return has_unequip_helm_skill_;
}

// 盾解除スキル所持か。
bool& enemy_impl::has_unequip_shield_skill() {
	return has_unequip_shield_skill_;
}

// 武器解除スキル所持か。
bool& enemy_impl::has_unequip_weapon_skill() {
	return has_unequip_weapon_skill_;
}

// 有用スキル所持か。
bool& enemy_impl::has_usefull_skill() {
	return has_usefull_skill_;
}

// 範囲外に移動する必要があるかを判定する。
bool // 結果。
enemy_impl::need_to_leave() {
	return has_can_move() &&
		is_short_range_attacker() &&
		(sc()->data[SC_PNEUMA] ||
			sc()->data[SC_SAFETYWALL] ||
			skill_unit_exists_block(this, skill_unit_key_map{SKILL_UNIT_KEY(PF_FOGWALL)})
		);
}

// ターゲットしているバトラー。
block_if*& enemy_impl::target_battler() {
	return target_battler_;
}

// スキルをターゲットしているバトラー。
block_if*& enemy_impl::skill_target_battler() {
	return skill_target_battler_;
}

// 敵モンスターを待ち受ける位置を取得する。
pos_t enemy_impl::waiting_position() {
	pos_t pos{0, bl()->x, bl()->y};
	if (is_short_range_attacker() &&
		is_walking()
	) pos = pos_t(0, ud()->to_x, ud()->to_y);
	return pos;
}

// 歩行先としてターゲットしているバトラー。
block_if*& enemy_impl::walk_target_battler() {
	return walk_target_battler_;
}

// アクションを終える。
void general_impl::act_end() {
	ud()->canact_tick = std::max(ud()->canact_tick, now + status_get_amotion(bl()));
}

// 攻撃による属性ダメージ倍率を取得する。
int // 取得した倍率。
general_impl::attack_element_ratio(
	block_if* tar, // ターゲット。
	e_element ele  // 属性。
) {
	return int(battle_attr_fix(
		bl(),
		tar->bl(),
		100,
		ele,
		status_get_element(tar->bl()),
		status_get_element_level(tar->bl())
	));
}

// 攻撃の射程を取得する。
int // 取得した射程。
general_impl::attack_range() {
	return status_get_range(bl());
}

// アクション可能かを判定する。
bool // 結果。
general_impl::can_act() {
	return DIFF_TICK(now, ud()->canact_tick) >= 0 &&
		ud()->skilltimer == INVALID_TIMER;
}

// 移動可能かを判定する。
bool // 結果。
general_impl::can_move() {
	return (unit_can_move(bl()) ||
			is_ensemble() ||
			is_gospel()
		) && DIFF_TICK(now, ud()->canmove_tick) >= 0;
}

// ブロックリストに到達可能かを判定する。
bool // 結果。
general_impl::can_reach_bl(
	block_list* bl_, // ブロックリスト。
	bool eas         // 簡易探索か。
) {
	return unit_can_reach_bl(bl(), bl_, 0, eas, nullptr, nullptr);
}

// ブロックに到達可能かを判定する。
bool // 結果。
general_impl::can_reach_block(
	block_if* blo, // ブロック。
	bool eas       // 簡易探索か。
) {
	return can_reach_bl(blo->bl(), eas);
}

// 座標に到達可能かを判定する。
bool // 結果。
general_impl::can_reach_xy(
	int x,   // X座標。
	int y,   // Y座標。
	bool eas // 簡易探索か。
) {
	return unit_can_reach_pos(bl(), x, y, eas);
}

// モンスターの攻撃射程内にいるかを判定する。
bool // 結果。
general_impl::check_attack_range(
	block_if* blo // 攻撃を受けるブロック。
) {
	return check_range_bl(bl(), blo->bl(), attack_range());
}

// ブロックリストに視線が通るかを判定する。
bool // 結果。
general_impl::check_line_bl(
	block_list* bl_ // ブロックリスト。
) {
	return check_line_xy(bl_->x, bl_->y);
}

// ブロックに視線が通るかを判定する。
bool // 結果。
general_impl::check_line_block(
	block_if* blo // ブロック。
) {
	return check_line_bl(blo->bl());
}

// 座標に視線が通るかを判定する。
bool // 結果。
general_impl::check_line_xy(
	int x, // X座標。
	int y  // Y座標。
) {
	return path_search_long(NULL, bl()->m, bl()->x, bl()->y, x, y, CELL_CHKWALL);
}

// 状態変化しているかを判定する。
bool // 結果。
general_impl::check_sc_types(
	const sc_type_set& sc_typs
) {
	for (sc_type sc_typ : sc_typs) {
		if (sc()->data[sc_typ]) return true;
	}
	return false;
}

// ブロックがスキル射程内かを判定する。
bool // 結果。
general_impl::check_skill_range_block(
	e_skill kid,  // スキルID。
	int klv,      // スキルレベル。
	block_if* blo // スキルを受けるブロック。
) {
	return check_skill_range_xy(kid, klv, blo->bl()->x, blo->bl()->y);
}

// 座標がスキル射程内かを判定する。
bool // 結果。
general_impl::check_skill_range_xy(
	e_skill kid, // スキルID。
	int klv,     // スキルレベル。
	int x,       // X座標。
	int y        // Y座標。
) {
	return check_range_blxy(bl(), x, y, skill_range(kid, klv));
}

// Defを取得する。
defType general_impl::def() {
	return status_get_def(bl());
}

// Def2を取得する。
int general_impl::def2() {
	return status_get_def2(bl());
}

// 属性を取得する。
e_element // 取得した属性。
general_impl::element() {
	return e_element(status_get_element(bl()));
}

// エモーションを表示する。
void general_impl::emotion(
	emotion_type typ // エモーションの種類。
) {
	clif_emotion(bl(), typ);
}

// Fleeを取得する。
int // 取得したFlee。
general_impl::flee() {
	return status_get_flee(bl());
}

// Hitを取得する。
int // 取得したHit。
general_impl::hit() {
	return status_get_hit(bl());
}

// HPを取得する。
int // 取得したHP。
general_impl::hp() {
	return status_get_hp(bl());
}

// HPの百分率を計算する。
int // 結果。
general_impl::hp_ratio() {
	return hp() * 100 / max_hp();
}

// このブロックを原点として、2点の内積を計算する。
int general_impl::inner_product(const coords_t& a, const coords_t& b) {
	coords_t A{a.x - bl()->x, a.y - bl()->y};
	coords_t B{b.x - bl()->x, b.y - bl()->y};
	return A.x * B.x + A.y * B.y;
}

// 攻撃中かを判定する。
bool general_impl::is_attacking() {
	return ud()->target &&
		ud()->state.attack_continue;
}

// 詠唱中かを判定する。
bool // 結果。
general_impl::is_casting() {
	return ud()->skilltimer != INVALID_TIMER;
}

// 合奏しているかを判定する。
bool // 結果。
general_impl::is_ensemble() {
	return sc()->data[SC_DANCING] &&
		sc()->data[SC_DANCING]->val4;
}

// ゴスペルしているかを判定する。
bool // 結果。
general_impl::is_gospel() {
	return sc()->data[SC_GOSPEL] &&
		sc()->data[SC_GOSPEL]->val4 == BCT_SELF;
}

// ハイディング状態かを判定する。
bool // 結果。
general_impl::is_hiding() {
	return sc()->option & (OPTION_HIDE | OPTION_CLOAK | OPTION_CHASEWALK | OPTION_INVISIBLE);
}

// 遠隔攻撃かを判定する。
bool // 結果。
general_impl::is_long_range_attacker() {
	return attack_range() > 3;
}

// 遠隔物理攻撃耐性状態かを判定する。
bool // 結果。
general_impl::is_long_weapon_immune() {
	return sc()->data[SC_FOGWALL] ||
		sc()->data[SC_PNEUMA] ||
		sc()->data[SC_TATAMIGAESHI];
}

// 麻痺状態かを判定する。
bool // 結果。
general_impl::is_paralysis() {
	return sc()->opt1 &&
		sc()->opt1 != OPT1_BURNING;
}

// 近接攻撃かを判定する。
bool // 結果。
general_impl::is_short_range_attacker() {
	return attack_range() <= 3;
}

// 独奏しているかを判定する。
bool // 結果。
general_impl::is_solo() {
	return sc()->data[SC_DANCING] &&
		!sc()->data[SC_DANCING]->val4;
}

// 歩行中かを判定する。
bool // 結果。
general_impl::is_walking() {
	return unit_is_walking(bl());
}

// レベルを取得する。
int // 取得したレベル。
general_impl::level() {
	return status_get_lv(bl());
}

// 最大HPを取得する。
int // 取得した最大HP。
general_impl::max_hp() {
	return status_get_max_hp(bl());
}

// 最大SPを取得する。
int // 取得した最大SP。
general_impl::max_sp() {
	return status_get_max_sp(bl());
}

// Mdefを取得する。
defType general_impl::mdef() {
	return status_get_mdef(bl());
}

// 水の上にいるかを判定する。
bool // 結果。
general_impl::on_water() {
	return map_getcellp(map_getmapdata(bl()->m), bl()->x, bl()->y, CELL_CHKWATER);
}

// 種族を取得する。
e_race // 取得した種族。
general_impl::race() {
	return e_race(status_get_race(bl()));
}

// 種族2を取得する。
e_race2 // 取得した種族2。
general_impl::race2() {
	return e_race2(status_get_race2(bl()));
}

// 状態変化を取得する。
status_change* // 取得した状態変化。
general_impl::sc() {
	return status_get_sc(bl());
}

// 状態変化の残り時間を取得する。
t_tick // 取得した残り時間。永続ならINFINITE_TICK。
general_impl::sc_rest(
	sc_type typ // 状態。
) {
	t_tick res = INFINITE_TICK;
	status_change_entry* sce = sc()->data[typ];
	if (sce) {
		const TimerData * td = get_timer(sce->timer);
		if (td &&
			td->tick != INFINITE_TICK
		) res = DIFF_TICK(td->tick, now);
	}
	return res;
}

// 大きさを取得する。
size // 取得した大きさ。
general_impl::size_() {
	return size(status_get_size(bl()));
}

// 設置スキルのアドバンテージを取得する。
int // 取得したアドバンテージ。
general_impl::skill_advantage(
	int x, // X座標。
	int y  // Y座標。
) {
	int adv = 0;
	iterate_skill_unit(bl()->m, x, y, [this, &adv] (skill_unit* kun, block_list* src_bl) -> int {
		const std::unordered_map<e_skill,int>* advs;
		if (battle_check_target(bl(), src_bl, BCT_ENEMY) > 0) {
			if (distance_policy_value() == DPV_CLOSE) advs = &ENEMY_SKILL_ADVANTAGES_CLOSE;
			else advs = &ENEMY_SKILL_ADVANTAGES_AWAY;
		} else {
			if (distance_policy_value() == DPV_CLOSE) advs = &ALLY_SKILL_ADVANTAGES_CLOSE;
			else advs = &ALLY_SKILL_ADVANTAGES_AWAY;
		}
		adv += find_map_data(*advs, e_skill(kun->group->skill_id), 0);
		return 0;
	});
	return adv;
}

// SPを取得する。
int // 取得したSP。
general_impl::sp() {
	return status_get_sp(bl());
}

// SPの百分率を計算する。
int // 結果。
general_impl::sp_ratio() {
	return sp() * 100 / max_sp();
}

// ユニットデータを取得する。
unit_data* // 取得したユニットデータ。
general_impl::ud() {
	return unit_bl2ud(bl());
}

// Vitを取得する。
int general_impl::vit() {
	return status_get_vit(bl());
}

// 歩行経路の長さを取得する。
int // 取得した長さ。
general_impl::walkpath_length() {
	return ud()->walkpath.path_len - ud()->walkpath.path_pos;
}

// 歩行経路上の位置を取得する。
pos_t // 取得した位置。
general_impl::walkpath_pos(
	int stes // 歩数。
) {
	pos_t pos(0, bl()->x, bl()->y, stes);
	for (int i = 0; i < stes; ++i) {
		directions dir = ud()->walkpath.path[ud()->walkpath.path_pos + i];
		pos.x += dirx[dir];
		pos.y += diry[dir];
	}
	return pos;
}

// ホムンクルスのブロックリストを取得する。
block_list* // 取得したブロックリスト。
homun_impl::bl() {
	return &hd()->bl;
}

// ホムンクルスがスキルを使えるかを判定する。
bool // 結果。
homun_impl::can_use_skill(
	e_skill kid, // スキルID。
	int klv      // スキルレベル。
) {
	return !(sc()->option & OPTION_INVISIBLE) &&
		skill_check_condition_mercenary(bl(), kid, klv, 0) &&
		skill_check_condition_mercenary(bl(), kid, klv, 2);
}

// ホムンクルスのスキルをチェックする。
int // 最大レベル。
homun_impl::check_skill(
	e_skill kid // スキルID。
) {
	int klv = hom_checkskill(hd(), kid);
	int* lim_slv = master()->limit_skills()->find(kid);
	if (lim_slv) klv = std::min(klv, *lim_slv);
	return klv;
}

// ホムンクルスのデフォルト距離ポリシー値を取得する。
distance_policy_values // 取得した距離ポリシー値。
homun_impl::default_distance_policy_value() {
	distance_policy_values dis_pol_val = DPV_CLOSE;
	if (homun_mapid_() == MAPID_LIF &&
		!check_skill(HLIF_CHANGE)
	) dis_pol_val = DPV_AWAY;
	return dis_pol_val;
}

// ホムンクルスのデフォルト通常攻撃ポリシー値を取得する。
normal_attack_policy_values // 取得した通常攻撃ポリシー値。
homun_impl::default_normal_attack_policy_value() {
	normal_attack_policy_values nor_att_pol_val = NAPV_CONTINUOUS;
	if ((homun_mapid_() == MAPID_LIF &&
			!check_skill(HLIF_CHANGE)
		) || (homun_mapid_() == MAPID_AMISTR &&
			!check_skill(HAMI_BLOODLUST)
		)
	) nor_att_pol_val = NAPV_SINGLE;
	return nor_att_pol_val;
}

// ホムンクルスが存在するかを判定する。
bool // 結果。
homun_impl::exists() {
	return master()->sd()->status.hom_id &&
		hd();
}

// ホムンクルスが抱えることのできるモンスター数を取得する。
int // 取得したモンスター数。
homun_impl::get_hold_mobs() {
	int res = INT_MAX;
	if (distance_policy_value() == DPV_AWAY) res = 0;
	return res;
}

// ホムンクルスが使用する最大の詠唱時間を取得する。
int // 取得した詠唱時間。
homun_impl::get_max_cast_time() {
	return INT_MAX;
}

// ホムンクルスのモンスターの高Defを取得する。
int // 取得した高Def。
homun_impl::get_mob_high_def() {
	return master()->get_mob_high_def();
}

// ホムンクルスのモンスターの高DefVitを取得する。
int // 取得した高DefVit。
homun_impl::get_mob_high_def_vit() {
	return master()->get_mob_high_def_vit();
}

// ホムンクルスのモンスターの高Fleeを取得する。
int // 取得した高Flee。
homun_impl::get_mob_high_flee() {
	return master()->get_mob_high_flee();
}

// ホムンクルスのモンスターの高Hitを取得する。
int // 取得した高Hit。
homun_impl::get_mob_high_hit() {
	return master()->get_mob_high_hit();
}

// ホムンクルスのモンスターの高レベルを取得する。
int // 取得した高レベル。
homun_impl::get_mob_high_level() {
	return master()->get_mob_high_level();
}

// ホムンクルスのモンスターの高Mdefを取得する。
int // 取得した高Mdef。
homun_impl::get_mob_high_mdef() {
	return master()->get_mob_high_mdef();
}

// ホムンクルスが安全に詠唱できる時間を取得する。
int // 取得した詠唱時間。
homun_impl::get_safe_cast_time() {
	return 0;
}

// ホムンクルスのHPの供給を許可するHP率を取得する。
int // 取得したHP率。
homun_impl::get_supply_hp_rate() {
	return DEFAULT_SUPPLY_HP_RATE;
}

// ホムンクルスのSPの供給を許可するSP率を取得する。
int // 取得したSP率。
homun_impl::get_supply_sp_rate() {
	return DEFAULT_SUPPLY_SP_RATE;
}

// ホムンクルスデータを取得する。
homun_data* // 取得したホムンクルスデータ。
homun_impl::hd() {
	return master()->sd()->hd;
}

// ホムンクルスのマップIDを取得する。
homun_mapid // 取得したマップID。進化はアンマスクされる。
homun_impl::homun_mapid_() {
	return homun_mapid(hom_class2mapid(hd()->homunculus.class_) & ~HOM_EVO);
}

// ホムンクルスがアクティブかを判定する。
bool // 結果。
homun_impl::is_active() {
	return exists() &&
		hom_is_active(hd());
}

// ホムンクルスが死亡かを判定する。
bool // 結果。
homun_impl::is_dead() {
	return hd()->homunculus.vaporize != HOM_ST_REST &&
		status_isdead(bl());
}

// ホムンクルスが無敵状態かを判定する。
bool // 結果。
homun_impl::is_invincible() {
	return false;
}

// ホムンクルスが魔法耐性かを判定する。
bool // 結果。
homun_impl::is_magic_immune() {
	return status_isimmune(bl());
}

// ホムンクルスがキャスト中断無効かを判定する。
bool // 結果。
homun_impl::is_no_castcancel() {
	return false;
}

// ホムンクルスがジェムストーン消費なしかを判定する。
bool // 結果。
homun_impl::is_no_gemstone() {
	return false;
}

// ホムンクルスが壁際にいるかを判定する。
bool // 結果。
homun_impl::is_wall_side() {
	return master() == leader() ||
		check_wall_side(bl()->m, bl()->x, bl()->y);
}

// ホムンクルスのスキルを反復する。
void homun_impl::iterate_skill(
	yield_skill_func yie // スキル獲得ハンドラ。
) {
	for (int kid = HM_SKILLBASE; kid < HM_SKILLBASE + MAX_HOMUNSKILL; ++kid) {
		int kind = hom_skill_get_index(kid);
		if (kind) {
			s_skill* sk = &hd()->homunculus.hskill[kind];
			if (sk->id &&
				!yie(sk)
			) break;
		}
	}
}

// 制限スキルのレジストリ。
ptr<registry_t<e_skill,int>>& homun_impl::limit_skills() {
	return master()->limit_skills();
}

// ホムンクルスがポリシーをロードする。
void homun_impl::load_policy(
	int mid,                                     // モンスターID。
	distance_policy_values* dis_pol_val,         // 距離ポリシー値。
	normal_attack_policy_values* nor_att_pol_val // 攻撃ポリシー値。
) {}

// ホムンクルスの最大距離の値を取得する。
int // 取得した最大距離の値。
homun_impl::max_distance_value() {
	return battle_config.pybot_around_distance;
}

// ホムンクルスの最小距離の値を取得する。
int // 取得した最小距離の値。
homun_impl::min_distance_value() {
	return 0;
}

// 優先モンスターかを判定する。
bool // 結果。
homun_impl::mob_is_first(
	block_if* ene // 敵モンスター。
) {
	return master()->mob_is_first(ene);
}

// 無視モンスターかを判定する。
bool // 結果。
homun_impl::mob_is_ignore(
	block_if* ene // 敵モンスター。
) {
	return master()->mob_is_ignore(ene);
}

// ホムンクルスの名前を取得する。
std::string // 取得した名前。
homun_impl::name() {
	return hd()->homunculus.name;
}

// ホムンクルスがノックバック耐性状態かを判定する。
bool // 結果。
homun_impl::no_knockback() {
	return false;
}

// 主人の拒否スキルのレジストリ。
ptr<registry_t<e_skill>>& homun_impl::reject_skills() {
	return master()->reject_skills();
}

// ホムンクルスのスキルを取得する。
s_skill* // 取得したスキル。なければnullptr。
homun_impl::skill(
	e_skill kid
) {
	int kind = hom_skill_get_index(kid);
	if (kind) return &hd()->homunculus.hskill[kind];
	return nullptr;
}

// ホムンクルスのスキルポイントを取得する。
int // 取得したスキルポイント。
homun_impl::skill_point() {
	return hd()->homunculus.skillpts;
}

// ホムンクルスのスキルを上げる。
void homun_impl::skill_up(
	e_skill kid // スキルID。
) {
	hom_skillup(hd(), kid);
}

// ホムンクルスがテレポートする。
bool // テレポートしたか。
homun_impl::teleport(
	block_list* bl_ // テレポート先のブロックリスト。
) {
	bool done = false;
	if (bl_->x != bl()->x ||
		bl_->y != bl()->y
	) {
		stop_attacking();
		stop_walking(USW_FORCE_STOP);
		unit_warp(bl(), bl_->m, bl_->x, bl_->y, CLR_TELEPORT);
		done = true;
	}
	return done;
}

// ホムンクルスの武器攻撃の属性を取得する。
e_element // 取得した属性。
homun_impl::weapon_attack_element() {
	return ELE_NEUTRAL;
}

// アイテム使用チックのマップ。
std::unordered_map<int,t_tick>& item_user_impl::item_used_ticks() {
	return item_used_ticks_;
}

// アイテムを使う。
void item_user_impl::use_item(
	int ind, // インデックス。
	bool exc // 例外か。
) {
	item* itm = &sd()->inventory.u.items_inventory[ind];
	if (itm->nameid &&
		(!find_item_save_mobs(itm->nameid) ||
			find_item_not_save_mobs(itm->nameid)
		) && pc_useitem(sd(), ind)
	) {
		item_used_ticks()[itm->nameid] = now;
		if (exc) throw item_used_exception();
	}
}

// 味方モンスターのマップ。
std::unordered_map<int,ptr<block_if>>& leader_impl::ally_mobs() {
	return ally_mobs_;
}

// 攻撃対象とするモンスターのブロックID。
int& leader_impl::attack_target() {
	return attack_target_;
}

// 後衛陣地を取得する。
coords_t leader_impl::back_base() {
	coords_t res{};
	int bacs_siz = 0;
	for (block_if* mem : members()) {
		if (!mem->is_dead() &&
			mem->distance_policy_value() == DPV_AWAY
		) {
			res.x += mem->bl()->x;
			res.y += mem->bl()->y;
			++bacs_siz;
		}
	}
	if (bacs_siz) {
		int hal_siz = bacs_siz >> 1;
		res.x = (res.x + hal_siz) / bacs_siz;
		res.y = (res.y + hal_siz) / bacs_siz;
	} else res = coords_t{bl()->x, bl()->y};
	return res;
}

// Botのベクタ。
std::vector<ptr<block_if>>& leader_impl::bots() {
	return bots_;
}

// 中心。
block_list& leader_impl::center() {
	return center_;
}

// 敵モンスターのマップ。
std::unordered_map<int,ptr<block_if>>& leader_impl::enemies() {
	return enemies_;
}

// Botを探す。
block_if* // 見つかったBot。見つからなかったらnullptr。
leader_impl::find_bot(
	const std::string& nam // 名前。整数ならメンバーのインデックス。
) {
	block_if* mem = find_member(nam);
	if (!mem ||
		!dynamic_cast<bot_impl*>(mem)
	) return nullptr;
	return mem;
}

// メンバーを探す。
block_if* // 見つかったメンバー。見つからなかったらnullptr。
leader_impl::find_member(
	const std::string& nam // 名前。整数ならメンバーのインデックス。
) {
	block_if* mem = nullptr;
	int i = parse_index(nam);
	if (i != -1) {
		if (i >= 0 &&
			i < members_.size()
		) mem = members_[i];
	} else {
		int cid = parse_id(nam);
		if (cid) {
			if (cid != INT_MIN) {
				for (block_if* mem2 : members_) {
					if (mem2->char_id() == cid) {
						mem = mem2;
						break;
					}
				}
			}
		} else {
			std::string lc_nam = lowercase(nam);
			for (block_if* mem2 : members_) {
				if (lowercase(mem2->name()) == lc_nam) {
					mem = mem2;
					break;
				}
			}
		}
	}
	return mem;
}

// ドロップアイテムが無視アイテムかを判定する。
bool // 結果。
leader_impl::flooritem_to_be_ignored(
	flooritem_data* fit // ドロップアイテム。
) {
	item_data* idb = itemdb_exists(fit->item.nameid);
	return (ignore_items()->find(fit->item.nameid) ||
			ignore_items()->find(ITEM_TYPE_OFFSET + idb->type)
		) && !not_ignore_items()->find(fit->item.nameid) &&
		!not_ignore_items()->find(ITEM_TYPE_OFFSET + idb->type) &&
		!fit->item.card[0] &&
		!fit->item.refine;
}

// グレートモンスターのレジストリ。
ptr<registry_t<int>>& leader_impl::great_mobs() {
	return great_mobs_;
}

// 無視アイテムのレジストリ。
ptr<registry_t<int>>& leader_impl::ignore_items() {
	return ignore_items_;
}

// ジャーナルのレジストリ。
ptr<registry_t<int,coords_t>>& leader_impl::journals() {
	return journals_;
}

// 最後にBotをログインさせたチック。
t_tick& leader_impl::last_heavy_tick() {
	return last_heavy_tick_;
}

// 最後に枝召喚したID。
int& leader_impl::last_summoned_id() {
	return last_summoned_id_;
}

// メンバーが死亡しているか。
bool& leader_impl::member_dead() {
	return member_dead_;
}

// メンバーのベクタ。
std::vector<block_if*>& leader_impl::members() {
	return members_;
}

// 次の重たいコマンドまでのチックを計算する。
t_tick leader_impl::next_heavy_tick() {
	t_tick hev_tic = DIFF_TICK(last_heavy_tick() + battle_config.pybot_heavy_cool_time, now);
	if (hev_tic < 0) hev_tic = 0;
	return hev_tic;
}

// 非無視アイテムのレジストリ。
ptr<registry_t<int>>& leader_impl::not_ignore_items() {
	return not_ignore_items_;
}

// 出力バッファ。
std::stringstream& leader_impl::output_buffer() {
	return output_buffer_;
}

// チームがモンスターに反応しないか。
bool& leader_impl::passive() {
	return passive_;
}

// リザレクション可能か。
bool& leader_impl::resurrectionable() {
	return resurrectionable_;
}

// ラッシュモードの登録値。
ptr<regnum_t<rush_modes>>& leader_impl::rush() {
	return rush_;
}

// チームを保存する。
void leader_impl::save_team(
	int tea_num // チームの番号。
) {
	CS_ENTER;
	auto tea = initialize<team_t>(tea_num);
	for (block_if* mem : members())
		tea->members.push_back(initialize<team_member>(mem->char_id(), mem->name()));
	teams()->register_(tea_num, tea);
}

// 売却アイテムのレジストリ。
ptr<registry_t<int>>& leader_impl::sell_items() {
	return sell_items_;
}

// 出力バッファから次のページを表示する。
void leader_impl::show_next() {
	std::stringstream out;
	for (int cou = 0; cou < PAGE_LINES; ++cou) {
		std::string lin;
		std::getline(output_buffer(), lin);
		if (!output_buffer()) break;
		out << lin << "\n";
	}
	if (output_buffer()) out << "…続きはNextサブコマンドで表示できます。\n";
	show_client(fd(), out.str());
}

// SPを供給可能か。
bool& leader_impl::sp_suppliable() {
	return sp_suppliable_;
}

// 待機か。
bool& leader_impl::stay() {
	return stay_;
}

// 倉庫格納アイテムのレジストリ。
ptr<registry_t<int>>& leader_impl::storage_put_items() {
	return storage_put_items_;
}

// チームのレジストリ。
ptr<registry_t<int,team_t>>& leader_impl::teams() {
	return teams_;
}

// Botのインデックスを更新する。
void leader_impl::update_bot_indices() {
	for (int i = 0; i < bots().size(); ++i) bots()[i]->bot_index() = i;
}

// メンバーのインデックスを更新する。
void leader_impl::update_member_indices() {
	for (int i = 0; i < members().size(); ++i) members()[i]->member_index() = i;
}

// アカウントID。
int& member_impl::account_id() {
	return account_id_;
}

// バーサーク発動率の登録値。
ptr<regnum_t<int>>& member_impl::berserk_rate() {
	return berserk_rate_;
}

// メンバーのブロックリストを取得する。
block_list* // 取得したブロックリスト。
member_impl::bl() {
	return &sd()->bl;
}

// バッファ武具一式のレジストリ。
ptr<registry_t<sc_type,buffer_equipset>>& member_impl::buffer_equipsets() {
	return buffer_equipsets_;
}

// メンバーがスキルを使えるかを判定する。
bool // 結果。
member_impl::can_use_skill(
	e_skill kid, // スキルID。
	int klv      // スキルレベル。
) {
	int8_t old_spi = sd()->spiritball;
	skill_condition req = skill_get_requirement(sd(), kid, klv);
	sd()->spiritball = req.spiritball;
	bool res = !(sc()->option & OPTION_INVISIBLE) &&
		!skill_isNotOk(kid, sd()) &&
		(kid == AS_GRIMTOOTH ||
			skill_check_condition_castbegin(sd(), kid, klv, 0)
		) && skill_check_condition_castend(sd(), kid, klv, 0);
	sd()->spiritball = old_spi;
	return res;
}

// メンバーがメンバーにカ系を使えるかを判定する。
bool // 結果。
member_impl::can_ka(
	block_if* tar_mem // ターゲットのメンバー。
) {
	status_change_entry* spi_sce = sc()->data[SC_SPIRIT];
	return tar_mem == this ||
		(spi_sce &&
			spi_sce->val2 == SL_SOULLINKER
		) || (tar_mem->sd()->class_ & MAPID_UPPERMASK) == MAPID_SOUL_LINKER ||
		tar_mem->char_id() == char_id() ||
		tar_mem->char_id() == sd()->status.partner_id ||
		tar_mem->char_id() == sd()->status.child;
}

// カート自動補充アイテムのレジストリ。
ptr<registry_t<int,int>>& member_impl::cart_auto_get_items() {
	return cart_auto_get_items_;
}

// キャラクターID。
int& member_impl::char_id() {
	return char_id_;
}

// メンバーのスキルをチェックする。
int // 最大レベル。
member_impl::check_skill(
	e_skill kid // スキルID。
) {
	int klv = pc_checkskill(sd(), kid);
	if (!klv &&
		kid == pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM))
	) klv = pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM_LV));
	int* lim_slv = limit_skills()->find(kid);
	if (lim_slv) klv = std::min(klv, *lim_slv);
	return klv;
}

// 次のコンボスキルIDを取得する。
e_skill // 取得したスキルID。コンボ状態でなければ0。
member_impl::combo_skill_id() {
	e_skill kid = e_skill(0);
	status_change_entry* com_ent = sc()->data[SC_COMBO];
	if (com_ent) kid = e_skill(com_ent->val1);
	return kid;
}

// メンバーのデフォルト距離ポリシー値を取得する。
distance_policy_values // 取得した距離ポリシー値。
member_impl::default_distance_policy_value() {
	return find_map_data(DEFAULT_DISTANCE_POLICY_VALUES, substancial_job());
}

// メンバーのデフォルト通常攻撃ポリシー値を取得する。
normal_attack_policy_values // 取得した通常攻撃ポリシー値。
member_impl::default_normal_attack_policy_value() {
	return find_map_data(DEFAULT_NORMAL_ATTACK_POLICY_VALUES, substancial_job());
}

// 距離ポリシーのレジストリ。
ptr<registry_t<int,distance_policy>>& member_impl::distance_policies() {
	return distance_policies_;
}

// 武具一式のレジストリ。
ptr<registry_t<int,equipset_t>>& member_impl::equipsets() {
	return equipsets_;
}

// ソケットの記述子。
int& member_impl::fd() {
	return fd_;
}

// 壊れた装備を探す。
int // 見つかったインデックス。見つからなかったらINT_MIN。
member_impl::find_broken_equip(
	int bas // 探し始めるインデックス。
) {
	for (int i = bas; i < MAX_INVENTORY; ++i) {
		item* itm = &sd()->inventory.u.items_inventory[i];
		if (itm->nameid &&
			itm->attribute == 1
		) return i;
	}
	return INT_MIN;
}

// カートからアイテムを探す。
int // 見つかったインデックス。見つからなかったらINT_MIN。
member_impl::find_cart(
	const std::string& nam // アイテム名。整数ならインデックス。
) {
	int i = parse_index(nam);
	if (i != -1) {
		if (i < 0 ||
			i >= MAX_CART ||
			!sd()->cart.u.items_cart[i].nameid
		) i = INT_MIN;
	} else i = find_cart(item_key(nam));
	return i;
}

// カートからアイテムを探す。
int // 見つかったインデックス。見つからなかったらINT_MIN。
member_impl::find_cart(
	const item_key& key // アイテムのキー。
) {
	return find_item(&sd()->cart, MAX_CART, key);
}

// インベントリからアイテムを探す。
int // 見つかったインデックス。見つからなかったらINT_MIN。
member_impl::find_inventory(
	const std::string& nam // アイテム名。整数ならインデックス。
) {
	int i = parse_index(nam);
	if (i != -1) {
		if (i < 0 ||
			i >= MAX_INVENTORY ||
			!sd()->inventory.u.items_inventory[i].nameid
		) i = INT_MIN;
	} else i = find_inventory(item_key(nam));
	return i;
}

// インベントリからアイテムを探す。
int // 見つかったインデックス。見つからなかったらINT_MIN。
member_impl::find_inventory(
	const item_key& key, // アイテムのキー。
	int equ              // 装備部位。INT_MINならチェックなし。
) {
	return find_item(&sd()->inventory, MAX_INVENTORY, key, sd()->inventory_data, equ);
}

// アイテム非節約モンスターを探す。
bool // 結果。
member_impl::find_item_not_save_mobs(
	int nid // アイテムID。
) {
	bool res = false;
	iterate_meta_mobs(
		nullptr,
		target_enemy(),
		battle_mode(),
		[this, nid, &res] (int mid)
		{res = res || item_not_save_mobs()->find(ITEM_SAVE_MOB(nid, mid));}
	);
	return res;
}

// アイテム節約モンスターを探す。
bool // 結果。
member_impl::find_item_save_mobs(
	int nid // アイテムID。
) {
	bool res = false;
	iterate_meta_mobs(
		nullptr,
		target_enemy(),
		battle_mode(),
		[this, nid, &res] (int mid)
		{res = res || item_save_mobs()->find(ITEM_SAVE_MOB(nid, mid));}
	);
	return res;
}

// スキル無視モンスターを探す。
bool // 結果。
member_impl::find_skill_ignore_mobs(
	e_skill kid,  // スキルID。
	block_if* ene // 敵モンスター。
) {
	bool res = false;
	iterate_meta_mobs(
		nullptr,
		ene,
		battle_mode(),
		[this, kid, &res] (int mid)
		{res = res || skill_ignore_mobs()->find(SKILL_IGNORE_MOB(kid, mid));}
	);
	return res;
}

// 優先モンスターのレジストリ。
ptr<registry_t<int>>& member_impl::first_mobs() {
	return first_mobs_;
}

// 優先スキルのレジストリ。
ptr<registry_t<int,e_skill>>& member_impl::first_skills() {
	return first_skills_;
}

// メンバーが抱えることのできるモンスター数を取得する。
int // 取得したモンスター数。
member_impl::get_hold_mobs() {
	return hold_mobs()->get();
}

// メンバーが使用する最大の詠唱時間を取得する。
int // 取得した詠唱時間。
member_impl::get_max_cast_time() {
	int res = max_cast_time()->get();
	if (!res) res = INT_MAX;
	return res;
}

// メンバーが安全に詠唱できる時間を取得する。
int // 取得した詠唱時間。
member_impl::get_safe_cast_time() {
	return safe_cast_time()->get();
}

// メンバーのモンスターの高Defを取得する。
int // 取得した高Def。
member_impl::get_mob_high_def() {
	int res = mob_high_def()->get();
	if (!res) res = DEFAULT_MOB_HIGH_DEF;
	return res;
}

// メンバーのモンスターの高DefVitを取得する。
int // 取得した高DefVit。
member_impl::get_mob_high_def_vit() {
	int res = mob_high_def_vit()->get();
	if (!res) res = DEFAULT_MOB_HIGH_DEF_VIT;
	return res;
}

// メンバーのモンスターの高Fleeを取得する。
int // 取得した高Flee。
member_impl::get_mob_high_flee() {
	int res = mob_high_flee()->get();
	if (!res) res = DEFAULT_MOB_HIGH_FLEE;
	return res;
}

// メンバーのモンスターの高Hitを取得する。
int // 取得した高Hit。
member_impl::get_mob_high_hit() {
	int res = mob_high_hit()->get();
	if (!res) res = DEFAULT_MOB_HIGH_HIT;
	return res;
}

// メンバーのモンスターの高レベルを取得する。
int // 取得した高レベル。
member_impl::get_mob_high_level() {
	int res = mob_high_level()->get();
	if (!res) res = DEFAULT_MOB_HIGH_LEVEL;
	return res;
}

// メンバーのモンスターの高Mdefを取得する。
int // 取得した高Mdef。
member_impl::get_mob_high_mdef() {
	int res = mob_high_mdef()->get();
	if (!res) res = DEFAULT_MOB_HIGH_MDEF;
	return res;
}

// 範囲スキルの発動条件となるメンバー数を取得する。
int // 取得したメンバー数。
member_impl::get_skill_members() {
	int cou = skill_members()->get();
	if (!cou) cou = DEFAULT_SKILL_MEMBERS;
	return cou;
}

// 範囲スキルの発動条件となるモンスター数を取得する。
int // 取得したモンスター数。
member_impl::get_skill_mobs() {
	int cou = skill_mobs()->get();
	if (!cou) cou = DEFAULT_SKILL_MOBS;
	return cou;
}

// 掛け直し時間を取得する。
t_tick // 取得した掛け直し時間。
member_impl::get_skill_tail(
	e_skill kid // スキルID。
) {
	int* dur = skill_tails()->find(kid);
	return dur ? *dur : 0;
}

// メンバーのHPの供給を許可するHP率を取得する。
int // 取得したHP率。
member_impl::get_supply_hp_rate() {
	int res = supply_hp_rate()->get();
	if (!res) res = DEFAULT_SUPPLY_HP_RATE;
	return res;
}

// メンバーのSPの供給を許可するSP率を取得する。
int // 取得したSP率。
member_impl::get_supply_sp_rate() {
	int res = supply_sp_rate()->get();
	if (!res) res = DEFAULT_SUPPLY_SP_RATE;
	return res;
}

// メンバーのギルドIDを取得する。
int // 取得したギルドID。
member_impl::guild_id() {
	return sd()->status.guild_id;
}

// 抱えることのできるモンスター数の登録値。
ptr<regnum_t<int>>& member_impl::hold_mobs() {
	return hold_mobs_;
}

// ホムンクルス。
ptr<block_if>& member_impl::homun() {
	return homun_;
}

// 武具を鑑定する。
// すでに鑑定済みなら何もしない。
// アイテム鑑定を使用可能であれば何も消費せずに鑑定する。
// 所持アイテムかカートに拡大鏡があればそれを消費して鑑定する。
// アイテム鑑定を使用不可、かつ拡大鏡がなければ何もしない。
void member_impl::identify_equip(
	item* itm,                // 鑑定する武具。
	storage_context* inv_con, // 所持アイテムの文脈。nullptrなら必要に応じて作成。
	storage_context* car_con  // カートの文脈。nullptrなら必要に応じて作成。
) {
	ptr<storage_context> inv_con_ptr, car_con_ptr;
	if (!itm->identify) {
		if (check_skill(MC_IDENTIFY)) itm->identify = 1;
		else {
			if (!inv_con) {
				inv_con_ptr = construct<inventory_context>(sd());
				inv_con = inv_con_ptr.get();
			}
			int mag_inv_ind = inv_con->find(ITEMID_MAGNIFIER);
			if (mag_inv_ind != INT_MIN) {
				inv_con->delete_(mag_inv_ind, 1);
				itm->identify = 1;
			} else {
				if (is_carton() &&
					!car_con
				) {
					car_con_ptr = construct<cart_context>(sd());
					car_con = car_con_ptr.get();
				}
				int mag_car_ind = INT_MIN;
				if (car_con) mag_car_ind = car_con->find(ITEMID_MAGNIFIER);
				if (mag_car_ind != INT_MIN) {
					car_con->delete_(mag_car_ind, 1);
					itm->identify = 1;
				}
			}
		}
	}
}

// 無視モンスターのレジストリ。
ptr<registry_t<int>>& member_impl::ignore_mobs() {
	return ignore_mobs_;
}

// カートを引いているかを判定する。
bool // 結果。
member_impl::is_carton() {
	return pc_iscarton(sd());
}

// メンバーが死亡かを判定する。
bool // 結果。
member_impl::is_dead() {
	return pc_isdead(sd());
}

// メンバーが無敵かを判断する。
bool member_impl::is_invincible() {
	return sd()->invincible_timer != INVALID_TIMER;
}

// メンバーが魔法耐性かを判定する。
bool member_impl::is_magic_immune() {
	return sd()->special_state.no_magic_damage ||
		status_isimmune(bl());
}

// メンバーがキャスト中断無効かを判定する。
bool member_impl::is_no_castcancel() {
	return sd()->special_state.no_castcancel;
}

// メンバーがジェムストーン消費なしかを判定する。
bool member_impl::is_no_gemstone() {
	return sd()->special_state.no_gemstone;
}

// 座っているかを判定する。
bool // 結果。
member_impl::is_sit() {
	return pc_issit(sd());
}

// メンバーが壁際にいるかを判定する。
bool // 結果。
member_impl::is_wall_side() {
	return this == leader() ||
		no_knockback() ||
		check_wall_side(bl()->m, bl()->x, bl()->y);
}

// アイテム非節約モンスターのレジストリ。
ptr<registry_t<int>>& member_impl::item_not_save_mobs() {
	return item_not_save_mobs_;
}

// アイテム節約モンスターのレジストリ。
ptr<registry_t<int>>& member_impl::item_save_mobs() {
	return item_save_mobs_;
}

// メンバーのスキルを反復する。
void member_impl::iterate_skill(
	yield_skill_func yie // スキル獲得ハンドラ。
) {
	int i;
	for (i = 0; i < MAX_SKILL; ++i) {
		s_skill* sk = &sd()->status.skill[i];
		if (sk->id &&
			!yie(sk)
		) break; 
	}
	if (i == MAX_SKILL) {
		static s_skill pla_sk;
		pla_sk.id = pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM));
		if (pla_sk.id) {
			pla_sk.lv = pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM_LV));
			pla_sk.flag = SKILL_FLAG_PLAGIARIZED;
			yie(&pla_sk);
		}
	}
}

// 武器属性付与のレジストリ。
ptr<registry_t<int,e_element>>& member_impl::kew_elements() {
	return kew_elements_;
}

// リーダー。
block_if*& member_impl::leader() {
	return leader_;
}

// 制限スキルのレジストリ。
ptr<registry_t<e_skill,int>>& member_impl::limit_skills() {
	return limit_skills_;
}

// メンバーがバッファ武具一式をロードする。
void member_impl::load_buffer_equipset(
	sc_type sc_typ, // ステータス変化。
	equip_pos* equ  // 装備済み部位。
) {
	buffer_equipset* es = buffer_equipsets()->find(sc_typ);
	if (es) load_equipset(es->items, equ);
}

// メンバーが武具一式をロードする。
void member_impl::load_equipset(
	int mid,       // モンスターID。
	equip_pos* equ // 装備済み部位。
) {
	equipset_t* es = equipsets()->find(mid);
	if (es) load_equipset(es->items, equ);
}

// メンバーが武具一式をロードする。
void member_impl::load_equipset(
	const std::vector<ptr<equipset_item>>& es_itms, // アイテムのベクタ。
	equip_pos* equ                                  // 装備済み部位。
) {
	equip_pos dum_equ = equip_pos(0);
	if (!equ) equ = &dum_equ;
	for (auto es_itm : es_itms) {
		if (!(es_itm->equip & *equ)) {
			int inv_ind = find_inventory(*es_itm->key, es_itm->equip);
			if (inv_ind == INT_MIN) {
				inv_ind = find_inventory(*es_itm->key, 0);
				if (inv_ind == INT_MIN) {
					if (dynamic_cast<bot_impl*>(this))
						request_items().insert(es_itm->key->nameid);
					continue;
				}
				if (!pc_equipitem(sd(), inv_ind, es_itm->equip)) continue;
			}
			if (es_itm->equip == EQP_AMMO &&
				sd()->inventory.u.items_inventory[inv_ind].amount < AMMO_REQUEST_THRESHOLD &&
				dynamic_cast<bot_impl*>(this)
			) request_items().insert(es_itm->key->nameid);
			*equ = equip_pos(*equ | es_itm->equip);
		}
	}
}

// メンバーがマップ武具一式をロードする。
void member_impl::load_map_equipset(
	int m,          // マップID。
	equip_pos* equ  // 装備済み部位。
) {
	map_equipset* es = map_equipsets()->find(m);
	if (es) load_equipset(es->items, equ);
}

// メンバーが演奏スキルをロードする。
void member_impl::load_play_skill(int mid, e_skill* kid) {
	if (!*kid) {
		auto pla_sk = play_skills()->find(mid);
		if (pla_sk) *kid = pla_sk->skill_id;
	}
}

// メンバーがポリシーをロードする。
void member_impl::load_policy(
	int mid,                                     // モンスターID。
	distance_policy_values* dis_pol_val,         // 距離ポリシー。
	normal_attack_policy_values* nor_att_pol_val // 通常攻撃ポリシー。
) {
	if (*dis_pol_val == DPV_PENDING) {
		auto dis_pol = distance_policies()->find(mid);
		if (dis_pol)*dis_pol_val = dis_pol->value;
	}
	if (*nor_att_pol_val == NAPV_PENDING) {
		auto nor_att_pol = normal_attack_policies()->find(mid);
		if (nor_att_pol) *nor_att_pol_val = nor_att_pol->value;
	}
}

// メンバーがスキル武具一式をロードする。
void member_impl::load_skill_equipset(
	e_skill kid,   // スキルID。
	equip_pos* equ // 装備済み部位。
) {
	skill_equipset* es = skill_equipsets()->find(kid);
	if (es) load_equipset(es->items, equ);
}

// ドロップアイテムを拾うかの登録値。
ptr<regnum_t<loot_modes>>& member_impl::loot() {
	return loot_;
}

// 拾得制限の登録値。
ptr<regnum_t<int>>& member_impl::loot_limit() {
	return loot_limit_;
}

// 拾得制限の値を取得する。
int // 取得した拾得制限。
member_impl::loot_limit_value() {
	int val = loot_limit()->get();
	if (!val) val = DEFAULT_LOOT_LIMIT;
	return val;
}

// 魔法力増幅状態かを判定する。
bool // 結果。
member_impl::magicpower_is_active() {
	status_change_entry* mag_pow_ent = sc()->data[SC_MAGICPOWER];
	return mag_pow_ent &&
		!mag_pow_ent->val4;
}

// マップ武具一式のレジストリ。
ptr<registry_t<int,map_equipset>>& member_impl::map_equipsets() {
	return map_equipsets_;
}

// 使用する最大の詠唱時間の登録値。
ptr<regnum_t<int>>& member_impl::max_cast_time() {
	return max_cast_time_;
}

// 最大距離の登録値。
ptr<regnum_t<int>>& member_impl::max_distance() {
	return max_distance_;
}

// メンバーの最大距離の値を取得する。
int // 取得した最大距離の値。
member_impl::max_distance_value() {
	int val = max_distance()->get();
	if (!val) val = battle_config.pybot_around_distance;
	return val;
}

// メンバーのインデックス。
int& member_impl::member_index() {
	return member_index_;
}

// 最小距離の登録値。
ptr<regnum_t<int>>& member_impl::min_distance() {
	return min_distance_;
}

// メンバーの最小距離の値を取得する。
int // 取得した最小距離の値。
member_impl::min_distance_value() {
	return min_distance()->get();
}

// モンスターの高Defの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_def() {
	return mob_high_def_;
}

// モンスターの高DefVitの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_def_vit() {
	return mob_high_def_vit_;
}

// モンスターの高Fleeの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_flee() {
	return mob_high_flee_;
}

// モンスターの高Hitの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_hit() {
	return mob_high_hit_;
}

// モンスターの高レベルの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_level() {
	return mob_high_level_;
}

// モンスターの高Mdefの登録値。
ptr<regnum_t<int>>& member_impl::mob_high_mdef() {
	return mob_high_mdef_;
}

// 優先モンスターかを判定する。
bool // 結果。
member_impl::mob_is_first(
	block_if* ene // 敵モンスター。
) {
	bool res = false;
	iterate_meta_mobs(
		nullptr,
		ene,
		battle_mode(),
		[this, &res] (int mid)
		{res = res || first_mobs()->find(mid);}
	);
	return res;
}

// 無視モンスターかを判定する。
bool // 結果。
member_impl::mob_is_ignore(
	block_if* ene // 敵モンスター。
) {
	bool res = false;
	iterate_meta_mobs(
		nullptr,
		ene,
		battle_mode(),
		[this, &res] (int mid)
		{res = res || ignore_mobs()->find(mid);}
	);
	return res;
}

// メンバーの名前を取得する。
std::string // 取得した名前。
member_impl::name() {
	return name_;
}

// メンバーがノックバック耐性状態かを判定する。
bool // 結果。
member_impl::no_knockback() {
	return sd()->special_state.no_knockback;
}

// 通常攻撃ポリシーのレジストリ。
ptr<registry_t<int,normal_attack_policy>>& member_impl::normal_attack_policies() {
	return normal_attack_policies_;
}

// 最大拾得率をオーバーするかを判定する。
bool // 結果。
member_impl::over_loot(
	int wei_inc // 重量の増分。
) {
	int lim = loot_limit_value();
	int lhs = (sd()->weight + wei_inc) * 100;
	int rhs = sd()->max_weight * lim;
	if (lim == 100) return lhs > rhs;
	else return lhs >= rhs;
}

// メンバーのパーティーIDを取得する。
int // 取得したパーティーID。
member_impl::party_id() {
	return sd()->status.party_id;
}

// ペット。
ptr<block_if>& member_impl::pet() {
	return pet_;
}

// 演奏スキルのレジストリ。
ptr<registry_t<int,play_skill>>& member_impl::play_skills() {
	return play_skills_;
}

// HP回復アイテムのレジストリ。
ptr<registry_t<int,int>>& member_impl::recover_hp_items() {
	return recover_hp_items_;
}

// SP回復アイテムのレジストリ。
ptr<registry_t<int,int>>& member_impl::recover_sp_items() {
	return recover_sp_items_;
}

// 拒否スキルのレジストリ。
ptr<registry_t<e_skill>>& member_impl::reject_skills() {
	return reject_skills_;
}

// 要求アイテムのセット。
std::unordered_set<int>& member_impl::request_items() {
	return request_items_;
}

// 安全に詠唱できる時間の登録値。
ptr<regnum_t<int>>& member_impl::safe_cast_time() {
	return safe_cast_time_;
}

// セッションデータ。
map_session_data*& member_impl::sd() {
	return sd_;
}

// メンバーが座る。
void member_impl::sit() {
	pc_setsit(sd());
	skill_sit(sd(), 1);
	clif_sitting(bl());
	act_end();
}

// メンバーのスキルを取得する。
s_skill* // 取得したスキル。なければnullptr。
member_impl::skill(
	e_skill kid
) {
	int kind = skill_get_index(kid);
	if (kind) return &sd()->status.skill[kind];
	else {
		static s_skill pla_sk;
		pla_sk.id = pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM));
		if (pla_sk.id == kid) {
			pla_sk.lv = pc_readglobalreg(sd(), add_str(SKILL_VAR_PLAGIARISM_LV));
			pla_sk.flag = SKILL_FLAG_PLAGIARIZED;
			return &pla_sk;
		}
	}
	return nullptr;
}

// スキル武具一式のレジストリ。
ptr<registry_t<e_skill,skill_equipset>>& member_impl::skill_equipsets() {
	return skill_equipsets_;
}

// スキル無視モンスターのレジストリ。
ptr<registry_t<int>>& member_impl::skill_ignore_mobs() {
	return skill_ignore_mobs_;
}

// 範囲魔法スキルの発動メンバー数の登録値。
ptr<regnum_t<int>>& member_impl::skill_members() {
	return skill_members_;
}

// 範囲魔法スキルの発動モンスター数の登録値。
ptr<regnum_t<int>>& member_impl::skill_mobs() {
	return skill_mobs_;
}

// メンバーのスキルポイントを取得する。
int // 取得したスキルポイント。
member_impl::skill_point() {
	return sd()->status.skill_point;
}

// 掛け直し時間のレジストリ。
ptr<registry_t<e_skill,int>>& member_impl::skill_tails() {
	return skill_tails_;
}

// メンバーのスキルを上げる。
void member_impl::skill_up(
	e_skill kid // スキルID。
) {
	pc_skillup(sd(), kid);
}

// メンバーが立つ。
void member_impl::stand() {
	pc_setstand(sd(), false);
	skill_sit(sd(), 0);
	clif_standing(bl());
	act_end();
}

// 倉庫補充アイテムのレジストリ。
ptr<registry_t<int,int>>& member_impl::storage_get_items() {
	return storage_get_items_;
}

// 実質的な職業を取得する。
// 転生1次職は1次職に変換される。
e_job // 取得した職業。
member_impl::substancial_job() {
	int job = sd()->status.class_;
	if (job >= JOB_NOVICE_HIGH &&
		job <= JOB_THIEF_HIGH
	) job -= 4001;
	return e_job(job);
}

// HPの供給を許可するHP率の登録値。
ptr<regnum_t<int>>& member_impl::supply_hp_rate() {
	return supply_hp_rate_;
}

// SPの供給を許可するSP率の登録値。
ptr<regnum_t<int>>& member_impl::supply_sp_rate() {
	return supply_sp_rate_;
}

// メンバーの武器攻撃の属性を取得する。
e_element // 取得した属性。
member_impl::weapon_attack_element() {
	e_element ele = e_element(status_calc_attack_element(bl(), sc(), status_get_attack_element(bl())));
	if (ele == ELE_NEUTRAL &&
		sd()->bonus.arrow_ele
	) ele = e_element(sd()->bonus.arrow_ele);
	return ele;
}

// モンスターのブロックリストを取得する。
block_list* // 取得したブロックリスト。
mob_impl::bl() {
	return &md()->bl;
}

// モンスターにプロボックを使えるかを判定する。
bool // 結果。
mob_impl::can_be_provoke() {
	return !has_status_immune() &&
		!is_hiding() &&
		!is_undead();
}

// モンスターが攻撃可能モード所持かを判定する。
bool // 結果。
mob_impl::has_can_attack() {
	return status_has_mode(&md()->status, MD_CANATTACK);
}

// モンスターが移動可能モード所持かを判定する。
bool // 結果。
mob_impl::has_can_move() {
	return status_has_mode(&md()->status, MD_CANMOVE);
}

// モンスターがハイディングを見破るかを判定する。
bool // 結果。
mob_impl::has_detector() {
	return status_has_mode(&md()->status, MD_DETECTOR);
}

// モンスターがノックバック耐性モード所持かを判定する。
bool // 結果。
mob_impl::has_knockback_immune() {
	return status_has_mode(&md()->status, MD_KNOCKBACK_IMMUNE);
}

// モンスターがMVPモード所持かを判定する。
bool // 結果。
mob_impl::has_mvp() {
	return status_has_mode(&md()->status, MD_MVP);
}

// モンスターが状態異常耐性モード所持かを判定する。
bool // 結果。
mob_impl::has_status_immune() {
	return status_has_mode(&md()->status, MD_STATUS_IMMUNE);
}

// モンスターがバーサク状態かを判定する。
bool // 結果。
mob_impl::is_berserk() {
	return md()->state.skillstate == MSS_BERSERK;
}

// モンスターがボスかを判定する。
bool // 結果。
mob_impl::is_boss() {
	return status_get_class_(bl()) == CLASS_BOSS;
}

// 凍結可能かを判定する。
bool // 結果。
mob_impl::is_freezable() {
	return !has_status_immune() &&
		!is_undead() &&
		!sc()->opt1;
}

// フローラ型モンスターかを判定する。
bool // 結果。
mob_impl::is_flora() {
	return pybot::mob_is_pure_flora(md()) ||
		((sc()->data[SC_ANKLE] ||
				sc()->data[SC_SPIDERWEB]
			) && has_can_attack() &&
			is_short_range_attacker()
		);
}

// モンスターが恐いかを判定する。
bool // 結果。
mob_impl::is_great(
	block_if* lea // リーダー。
) {
	return has_mvp() ||
		lea->great_mobs()->find(md()->mob_id);
}

// モンスターが魔法耐性かを判定する。
bool // 結果。
mob_impl::is_magic_immune() {
	return status_isimmune(bl());
}

// モンスターが召喚されたかを判定する。
bool // 結果。
mob_impl::is_summoned() {
	return md()->master_id;
}

// モンスターがアンデッドかを判定する。
bool // 結果。
mob_impl::is_undead() {
	return battle_check_undead(race(), element());
}

// モンスターデータ。
mob_data*& mob_impl::md() {
	return md_;
}

// モンスターの名前を取得する。
std::string // 取得した名前。
mob_impl::name() {
	return md()->db->jname;
}

// ペットのブロックリストを取得する。
block_list* // 取得したブロックリスト。
pet_impl::bl() {
	return &pd()->bl;
}

// ペットが存在するかを判定する。
bool // 結果。
pet_impl::exists() {
	return master()->sd()->status.pet_id &&
		pd();
}

// ペットがアクティブかを判定する。
bool // 結果。
pet_impl::is_active() {
	return exists() &&
		pd()->pet.intimate > 0 &&
		!pd()->pet.incubate;
}

// ペット名前を取得する。
std::string // 取得した名前。
pet_impl::name() {
	return pd()->pet.name;
}

// ペットデータを取得する。
pet_data* // 取得したペットデータ。
pet_impl::pd() {
	return master()->sd()->pd;
}

// 詠唱終了ハンドラ。
ai_t::done_func& skill_user_impl::cast_end_func() {
	return cast_end_func_;
}

// サーバーにおいて2つのブロックリストが距離範囲内かを判定する。
bool // 結果。
server_impl::check_range_bl(
	block_list* bl0, // ブロックリスト0。
	block_list* bl1, // ブロックリスト1。
	int dis          // 距離。
) {
	return check_distance_bl(bl0, bl1, dis);
}

// サーバーにおいてブロックリストと座標が距離範囲内かを判定する。
bool // 結果。
server_impl::check_range_blxy(
	block_list* bl_, // ブロックリスト。
	int x,           // X座標。
	int y,           // Y座標。
	int dis          // 距離。
) {
	return check_distance_blxy(bl_, x, y, dis);
}

// サーバーにおいて2つの座標が距離範囲内かを判定する。
bool // 結果。
server_impl::check_range_xy(
	int x0, // X0座標。
	int y0, // Y0座標。
	int x1, // X1座標。
	int y1, // Y1座標。
	int dis // 距離。
) {
	return check_distance_xy(x0, y0, x1, y1, dis);
}

// 最後のスキル使用から指定した時間が経過したかをチェックする。
bool // 結果。
skill_target_impl::check_skill_used_tick(
	e_skill kid,   // スキルID。
	t_tick ela_tic // 経過チック。
) {
	return DIFF_TICK(now, skill_used_ticks()[kid]) >= ela_tic;
}

// スキル使用チックのマップ。
std::unordered_map<e_skill,t_tick>& skill_target_impl::skill_used_ticks() {
	return skill_used_ticks_;
}

// コインを集める。
bool // すでに集まっているか。
skill_user_impl::collect_coins(
	int cou // 必要なコインの枚数。
) {
	bool res = sd()->spiritball >= cou;
	if (!res) {
		int gli_lv = check_skill(GS_GLITTERING);
		if (gli_lv) use_skill_self(GS_GLITTERING, gli_lv);
	}
	return res;
}

// 気弾を集める。
bool // すでに集まっているか。
skill_user_impl::collect_spirits(
	int cou // 必要な気弾の個数。
) {
	bool res = sd()->spiritball >= cou;
	if (!res) {
		int cs_lv = check_skill(MO_CALLSPIRITS);
		int sc_lv = check_skill(CH_SOULCOLLECT);
		if (sc_lv &&
			(sd()->spiritball < 4 ||
				cs_lv <= sd()->spiritball
			)
		) use_skill_self(CH_SOULCOLLECT, sc_lv);
		if (cs_lv > sd()->spiritball) use_skill_self(MO_CALLSPIRITS, cs_lv);
	}
	return res;
}

// スキルを探す。
s_skill* // 見つかったスキル。見つからなかったらnullptr。
skill_user_impl::find_skill(
	const std::string& nam // スキル名。整数ならスキルID。
) {
	s_skill* res = nullptr;
	int kid = parse_id(nam);
	if (kid) {
		if (kid != INT_MIN) res = skill(e_skill(kid));
	} else {
		std::string nam_lc = lowercase(nam);
		iterate_skill([nam_lc, &res] (s_skill* sk) -> bool {
			if (lowercase(skill_get_desc(sk->id)) == nam_lc) {
				res = sk;
				return false;
			}
			return true;
		});
	}
	return res;
}

// スキルの射程を取得する。
int // 取得した射程。
skill_user_impl::skill_range(
	e_skill kid, // スキルID。
	int klv      // スキルレベル。
) {
	return skill_get_range2(bl(), kid, klv, true);
}

// アンコールを使う。
void skill_user_impl::use_encore(
	e_skill dan_id // 演奏スキルID。
) {
	int enc_lv = check_skill(BD_ENCORE);
	if (enc_lv &&
		sd()->skill_id_dance == dan_id
	) use_skill_self(BD_ENCORE, enc_lv);
}

// 魔法力増幅を使う。
bool // すでに魔法力増幅状態であるか、または使用不可か。
skill_user_impl::use_magicpower() {
	bool res = false;
	uint16 mag_pow_lv = check_skill(HW_MAGICPOWER);
	if (mag_pow_lv) {
		if (magicpower_is_active()) res = true;
		else use_skill_self(HW_MAGICPOWER, mag_pow_lv);
	} else res = true;
	return res;
}

// ブロックリストにスキルを使う。
void skill_user_impl::use_skill_bl(
	e_skill kid,                // スキルID。
	int klv,                    // スキルレベル。
	block_list* bl_,            // ブロックリスト。
	bool tur_end,               // ターン終了か。
	ai_t::done_func cas_end_fun // 詠唱完了ハンドラ。
) {
	if (status_check_skilluse(bl(), bl_, kid, 0)) {
		auto use = [this, kid, klv, cas_end_fun] (block_list* bl_) {
			if (unit_skilluse_id(bl(), bl_->id, kid, klv)) {
				if (dynamic_cast<member_impl*>(this))
					pc_delinvincibletimer(sd());
				cast_end_func() = cas_end_fun;
				skill_used_ticks()[kid] = now;
			}
		};
		if (dynamic_cast<bot_impl*>(this)) {
			if (is_sit()) stand();
			reload_skill_equipset(kid);
		}
		if (walk_bl(bl_, skill_range(kid, klv))) {
			int bid = bl_->id;
			walk_end_func() = [this, kid, klv, use, bid] (ai_t* ai, void* fun) {
				block_list* bl_ = map_id2bl(bid);
				if (bl_ &&
					can_reach_bl(bl_) &&
					can_move()
				) {
					if (walk_bl(bl_, skill_range(kid, klv)))
						walk_end_func() = *(ai_t::done_func*)(fun);
					else use(bl_);
				}
			};
		} else use(bl_);
		if (tur_end) throw turn_end_exception();
	}
}

// ブロックにスキルを使う。
void skill_user_impl::use_skill_block(
	e_skill kid,                // スキルID。
	int klv,                    // スキルレベル。
	block_if* blo,              // ブロック。
	bool tur_end,               // ターン終了か。
	ai_t::done_func cas_end_fun // 詠唱完了ハンドラ。
) {
	block_list* tar_bl = blo->bl();
	if (status_check_skilluse(bl(), tar_bl, kid, 0)) {
		int ran = skill_range(kid, klv);
		check_distance_pred nea = nullptr;
		if (KEY_EXISTS(EXPOSURE_SKILLS, kid)) {
			tar_bl = bl();
			ran = skill_get_splash(kid, klv);
			nea = [] (block_list* bl1, block_list* bl2, int ran) -> bool {
				return check_distance_bl(bl1, bl2, ran);
			};
		}
		auto use = [this, kid, klv, cas_end_fun, tar_bl] (block_if* blo) {
			if (unit_skilluse_id(bl(), tar_bl->id, kid, klv)) {
				if (dynamic_cast<member_impl*>(this))
					pc_delinvincibletimer(sd());
				cast_end_func() = cas_end_fun;
				blo->skill_used_ticks()[kid] = now;
				if (kid == AS_GRIMTOOTH ||
					kid == NJ_KASUMIKIRI
				) skill_used_ticks()[TF_HIDING] = now;
			}
		};
		if (dynamic_cast<bot_impl*>(this)) {
			if (is_sit()) stand();
			reload_skill_equipset(kid);
		}
		if (walk_bl(blo->bl(), ran, nea)) {
			int blo_bid = blo->bl()->id;
			walk_end_func() = [this, kid, klv, use, blo_bid] (ai_t* ai, void* fun) {
				block_if* blo = ai->find_block<skill_target_impl>(blo_bid);
				if (blo &&
					can_reach_block(blo) &&
					can_move()
				) {
					if (walk_bl(blo->bl(), skill_range(kid, klv)))
						walk_end_func() = *(ai_t::done_func*)(fun);
					else use(blo);
				}
			};
		} else use(blo);
		if (tur_end) throw turn_end_exception();
	}
}

// 自分にスキルを使う。
void skill_user_impl::use_skill_self(
	e_skill kid,                // スキルID。
	int klv,                    // スキルレベル。
	bool tur_end,               // ターン終了か。
	ai_t::done_func cas_end_fun // 詠唱完了ハンドラ。
) {
	if (status_check_skilluse(bl(), bl(), kid, 0)) {
		if (dynamic_cast<bot_impl*>(this)) {
			if (is_sit()) stand();
			reload_skill_equipset(kid);
		}
		if (unit_skilluse_id(bl(), bl()->id, kid, klv)) {
			if (dynamic_cast<member_impl*>(this))
				pc_delinvincibletimer(sd());
			cast_end_func() = cas_end_fun;
			skill_used_ticks()[kid] = now;
			if (skill_get_inf2(kid) & INF2_SONG_DANCE ||
				skill_get_inf2(kid) & INF2_ENSEMBLE_SKILL
			) skill_used_ticks()[BD_ENCORE] = now;
			if (kid == BA_FROSTJOKER) {
				std::stringstream out;
				int mes_ind = rnd() % BA_FROSTJOKER_MESSAGES.size();
				out << name() << " : " << BA_FROSTJOKER_MESSAGES[mes_ind];
				clif_GlobalMessage(bl(), out.str().c_str(), AREA_CHAT_WOC);
			}
			if (tur_end) throw turn_end_exception();
		}
	}
}

// 座標にスキルを使う。
void skill_user_impl::use_skill_xy(
	e_skill kid,                // スキルID。
	int klv,                    // スキルレベル。
	int x,                      // X座標。
	int y,                      // Y座標。
	bool tur_end,               // ターン終了か。
	ai_t::done_func cas_end_fun // 詠唱完了ハンドラ。
) {
	auto use = [this, x, y, kid, klv, cas_end_fun] () {
		if (unit_skilluse_pos(bl(), x, y, kid, klv)) {
			if (dynamic_cast<member_impl*>(this))
				pc_delinvincibletimer(sd());
			cast_end_func() = cas_end_fun;
			skill_used_ticks()[kid] = now;
		}
	};
	if (dynamic_cast<bot_impl*>(this)) {
		if (is_sit()) stand();
		reload_skill_equipset(kid);
	}
	if (walk_xy(x, y, skill_range(kid, klv))) {
		walk_end_func() = [this, kid, klv, use, x, y] (ai_t* ai, void* fun) {
			if (can_reach_xy(x, y) &&
				can_move()
			) {
				if (walk_xy(x, y, skill_range(kid, klv)))
					walk_end_func() = *(ai_t::done_func*)(fun);
				else use();
			}
		};
	} else use();
	if (tur_end) throw turn_end_exception();
}

// 主人のギルドIDを取得する。
int // 取得したギルドID。
slave_impl::guild_id() {
	return master()->sd()->status.guild_id;
}

// 主人のリーダー。
block_if*& slave_impl::leader() {
	return master()->leader();
}

// 主人。
block_if*& slave_impl::master() {
	return master_;
}

// 主人のメンバーインデックス。
int& slave_impl::member_index() {
	return master()->member_index();
}

// 主人のパーティーIDを取得する。
int // 取得したパーティーID。
slave_impl::party_id() {
	return master()->sd()->status.party_id;
}

// メンバーを構築する。
member_t::member_t(
	map_session_data* sd_, // セッションデータ。
	block_if* lea          // リーダー。
) {
	sd() = sd_;
	fd() = sd()->fd;
	account_id() = sd()->status.account_id;
	char_id() = sd()->status.char_id;
	leader() = lea;
	berserk_rate() = construct<regnum_t<int>>(sd(), "pybot_berserk_rate");
	hold_mobs() = construct<regnum_t<int>>(sd(), "pybot_hold_mobs");
	loot() = construct<regnum_t<loot_modes>>(sd(), "pybot_loot");
	loot_limit() = construct<regnum_t<int>>(sd(), "pybot_loot_limit");
	max_cast_time() = construct<regnum_t<int>>(sd(), "pybot_max_cast_time");
	max_distance() = construct<regnum_t<int>>(sd(), "pybot_max_distance");
	min_distance() = construct<regnum_t<int>>(sd(), "pybot_min_distance");
	mob_high_def() = construct<regnum_t<int>>(sd(), "pybot_mob_high_def");
	mob_high_def_vit() = construct<regnum_t<int>>(sd(), "pybot_mob_high_def_vit");
	mob_high_flee() = construct<regnum_t<int>>(sd(), "pybot_mob_high_flee");
	mob_high_hit() = construct<regnum_t<int>>(sd(), "pybot_mob_high_hit");
	mob_high_level() = construct<regnum_t<int>>(sd(), "pybot_mob_high_level");
	mob_high_mdef() = construct<regnum_t<int>>(sd(), "pybot_mob_high_mdef");
	name_ = std::string(sd()->status.name);
	safe_cast_time() = construct<regnum_t<int>>(sd(), "pybot_safe_cast_time");
	skill_members() = construct<regnum_t<int>>(sd(), "pybot_skill_members");
	skill_mobs() = construct<regnum_t<int>>(sd(), "pybot_skill_mobs");
	supply_hp_rate() = construct<regnum_t<int>>(sd(), "pybot_supply_hp_rate");
	supply_sp_rate() = construct<regnum_t<int>>(sd(), "pybot_supply_sp_rate");
	homun() = construct<homun_t>(this);
	pet() = construct<pet_t>(this);
	buffer_equipsets() = construct<registry_t<sc_type,buffer_equipset>>(
		load_buffer_equipset_func(char_id()),
		insert_buffer_equipset_func(char_id()),
		update_buffer_equipset_func(char_id()),
		delete_buffer_equipset_func(char_id()),
		clear_buffer_equipset_func(char_id())
	);
	cart_auto_get_items() = construct<registry_t<int,int>>(
		load_cart_auto_get_item_func(char_id()),
		insert_cart_auto_get_item_func(char_id()),
		update_cart_auto_get_item_func(char_id()),
		delete_cart_auto_get_item_func(char_id()),
		clear_cart_auto_get_item_func(char_id())
	);
	distance_policies() = construct<registry_t<int,distance_policy>>(
		load_distance_policy_func(char_id()),
		insert_distance_policy_func(char_id()),
		update_distance_policy_func(char_id()),
		delete_distance_policy_func(char_id()),
		clear_distance_policy_func(char_id())
	);
	equipsets() = construct<registry_t<int,equipset_t>>(
		load_equipset_func(char_id()),
		insert_equipset_func(char_id()),
		update_equipset_func(char_id()),
		delete_equipset_func(char_id()),
		clear_equipset_func(char_id())
	);
	first_mobs() = construct<registry_t<int>>(
		load_first_mob_func(char_id()),
		insert_first_mob_func(char_id()),
		delete_first_mob_func(char_id()),
		clear_first_mob_func(char_id())
	);
	first_skills() = construct<registry_t<int,e_skill>>(
		load_first_skill_func(char_id()),
		insert_first_skill_func(char_id()),
		update_first_skill_func(char_id()),
		delete_first_skill_func(char_id()),
		clear_first_skill_func(char_id())
	);
	ignore_mobs() = construct<registry_t<int>>(
		load_ignore_mob_func(char_id()),
		insert_ignore_mob_func(char_id()),
		delete_ignore_mob_func(char_id()),
		clear_ignore_mob_func(char_id())
	);
	item_not_save_mobs() = construct<registry_t<int>>(
		load_item_not_save_mob_func(char_id()),
		insert_item_not_save_mob_func(char_id()),
		delete_item_not_save_mob_func(char_id()),
		clear_item_not_save_mob_func(char_id())
	);
	item_save_mobs() = construct<registry_t<int>>(
		load_item_save_mob_func(char_id()),
		insert_item_save_mob_func(char_id()),
		delete_item_save_mob_func(char_id()),
		clear_item_save_mob_func(char_id())
	);
	kew_elements() = construct<registry_t<int,e_element>>(
		load_kew_element_func(char_id()),
		insert_kew_element_func(char_id()),
		update_kew_element_func(char_id()),
		delete_kew_element_func(char_id()),
		clear_kew_element_func(char_id())
	);
	limit_skills() = construct<registry_t<e_skill,int>>(
		load_limit_skill_func(char_id()),
		insert_limit_skill_func(char_id()),
		update_limit_skill_func(char_id()),
		delete_limit_skill_func(char_id()),
		clear_limit_skill_func(char_id())
	);
	map_equipsets() = construct<registry_t<int,map_equipset>>(
		load_map_equipset_func(char_id()),
		insert_map_equipset_func(char_id()),
		update_map_equipset_func(char_id()),
		delete_map_equipset_func(char_id()),
		clear_map_equipset_func(char_id())
	);
	normal_attack_policies() = construct<registry_t<int,normal_attack_policy>>(
		load_normal_attack_policy_func(char_id()),
		insert_normal_attack_policy_func(char_id()),
		update_normal_attack_policy_func(char_id()),
		delete_normal_attack_policy_func(char_id()),
		clear_normal_attack_policy_func(char_id())
	);
	play_skills() = construct<registry_t<int,play_skill>>(
		load_play_skill_func(char_id()),
		insert_play_skill_func(char_id()),
		update_play_skill_func(char_id()),
		delete_play_skill_func(char_id()),
		clear_play_skill_func(char_id())
	);
	skill_equipsets() = construct<registry_t<e_skill,skill_equipset>>(
		load_skill_equipset_func(char_id()),
		insert_skill_equipset_func(char_id()),
		update_skill_equipset_func(char_id()),
		delete_skill_equipset_func(char_id()),
		clear_skill_equipset_func(char_id())
	);
	skill_ignore_mobs() = construct<registry_t<int>>(
		load_skill_ignore_mob_func(char_id()),
		insert_skill_ignore_mob_func(char_id()),
		delete_skill_ignore_mob_func(char_id()),
		clear_skill_ignore_mob_func(char_id())
	);
	skill_tails() = construct<registry_t<e_skill,int>>(
		load_skill_tail_func(char_id()),
		insert_skill_tail_func(char_id()),
		update_skill_tail_func(char_id()),
		delete_skill_tail_func(char_id()),
		clear_skill_tail_func(char_id())
	);
	recover_hp_items() = construct<registry_t<int,int>>(
		load_recover_hp_item_func(char_id()),
		insert_recover_hp_item_func(char_id()),
		update_recover_hp_item_func(char_id()),
		delete_recover_hp_item_func(char_id()),
		clear_recover_hp_item_func(char_id())
	);
	recover_sp_items() = construct<registry_t<int,int>>(
		load_recover_sp_item_func(char_id()),
		insert_recover_sp_item_func(char_id()),
		update_recover_sp_item_func(char_id()),
		delete_recover_sp_item_func(char_id()),
		clear_recover_sp_item_func(char_id())
	);
	reject_skills() = construct<registry_t<e_skill>>(
		load_reject_skill_func(char_id()),
		insert_reject_skill_func(char_id()),
		delete_reject_skill_func(char_id()),
		clear_reject_skill_func(char_id())
	);
	storage_get_items() = construct<registry_t<int,int>>(
		load_storage_get_item_func(char_id()),
		insert_storage_get_item_func(char_id()),
		update_storage_get_item_func(char_id()),
		delete_storage_get_item_func(char_id()),
		clear_storage_get_item_func(char_id())
	);
}

// Botを構築する。
bot_t::bot_t(
	map_session_data* sd_, // セッションデータ。
	block_if* lea          // リーダー。
) : member_t(sd_, lea) {
	last_emotion_tick() = 0;
	last_reloaded_equipset_tick() = 0;
	all_bots[char_id()] = this;
	show_info(print(
		"Bot '" CL_WHITE, name(), CL_RESET "' logged in. "
		"(AID/CID: '" CL_WHITE, account_id(), "/", char_id(), CL_RESET "',"
		" Group '" CL_WHITE, sd()->group_id, CL_RESET "'"
		")."
	));
	clif_parse_LoadEndAck(sd_->fd, sd_);
}

// Botを破棄する。
bot_t::~bot_t() {
	CS_ENTER;
	if (session[fd()] &&
		session[fd()]->session_data == sd()
	) {
		show_info(print("Bot '" CL_WHITE , name(), CL_RESET "' logged off."));
		map_session_data* lea_sd = map_id2sd(leader()->account_id());
		if (lea_sd &&
			lea_sd->target_storage == &sd()->storage
		) storage_storageclose(lea_sd);
		map_quit(sd());
		do_close(fd());
	}
	all_bots.erase(char_id());
}

// ホムンクルスを構築する。
homun_t::homun_t(
	block_if* mas // 主人。
) {
	master() = mas;
}

// リーダーを構築する。
leader_t::leader_t(
	map_session_data* sd_ // セッションデータ。
) : member_t(sd_, this) {
	center() = sd_->bl;
	center().id = -1;
	attack_target() = 0;
	last_heavy_tick() = 0;
	last_summoned_id() = 0;
	member_dead() = false;
	passive() = false;
	stay() = false;
	rush() = construct<regnum_t<rush_modes>>(sd(), "pybot_rush");
	great_mobs() = construct<registry_t<int>>(
		load_great_mob_func(char_id()),
		insert_great_mob_func(char_id()),
		delete_great_mob_func(char_id()),
		clear_great_mob_func(char_id())
	);
	ignore_items() = construct<registry_t<int>>(
		load_ignore_item_func(char_id()),
		insert_ignore_item_func(char_id()),
		delete_ignore_item_func(char_id()),
		clear_ignore_item_func(char_id())
	);
	journals() = construct<registry_t<int,coords_t>>(
		load_journal_func(char_id()),
		insert_journal_func(char_id()),
		update_journal_func(char_id()),
		delete_journal_func(char_id()),
		clear_journal_func(char_id())
	);
	not_ignore_items() = construct<registry_t<int>>(
		load_not_ignore_item_func(char_id()),
		insert_not_ignore_item_func(char_id()),
		delete_not_ignore_item_func(char_id()),
		clear_not_ignore_item_func(char_id())
	);
	sell_items() = construct<registry_t<int>>(
		load_sell_item_func(char_id()),
		insert_sell_item_func(char_id()),
		delete_sell_item_func(char_id()),
		clear_sell_item_func(char_id())
	);
	storage_put_items() = construct<registry_t<int>>(
		load_storage_put_item_func(char_id()),
		insert_storage_put_item_func(char_id()),
		delete_storage_put_item_func(char_id()),
		clear_storage_put_item_func(char_id())
	);
	teams() = construct<registry_t<int,team_t>>(
		load_team_func(char_id()),
		insert_team_func(char_id()),
		update_team_func(char_id()),
		delete_team_func(char_id()),
		clear_team_func(char_id())
	);
	members().push_back(this);
	update_member_indices();
}

// リーダーを破棄する。
leader_t::~leader_t() {
	CS_ENTER;
	if (!bots().empty()) save_team(0);
	bots().clear();
}

// モンスターを構築する。
mob_t::mob_t(
	mob_data* md_ // モンスターデータ。
) {
	md() = md_;
}

// ペットを構築する。
pet_t::pet_t(
	block_if* mas // 主人。
) {
	master() = mas;
}

// 敵モンスターを構築する。
enemy_t::enemy_t(
	mob_data* md_ // モンスターデータ。
) : mob_t(md_) {}

}

// [GonBee]
// パーティーBOT機能のAIにおけるアイテム使用ハンドラを定義する。

#include "pybot_internal.hpp"

namespace pybot {

// -----------------------------------------------------------------------------
// AIのアイテム使用ハンドラの定義
	
// 茹でサソリを使う。
AI_ITEM_USE_FUNC(AGI_DISH10) {
	if (!bot->sc()->data[SC_FOOD_AGI_CASH]) bot->use_item(itm_ind);
}

// キャビアパンケーキを使う。
AI_ITEM_USE_FUNC(CAVIAR_PANCAKE) {
	if (bot->sc()->data[SC_SILENCE] ||
		bot->sc()->data[SC_BLIND] ||
		bot->sc()->data[SC_CURSE] ||
		bot->sc()->data[SC_HALLUCINATION] ||
		bot->sc()->data[SC_BLEEDING]
	) bot->use_item(itm_ind);
}

// フベルゲルミルの酒を使う。
AI_ITEM_USE_FUNC(DEX_DISH10) {
	if (!bot->sc()->data[SC_FOOD_DEX_CASH]) bot->use_item(itm_ind);
}

// 濃縮サラマインジュースを使う。
AI_ITEM_USE_FUNC(ENRICH_CELERMINE_JUICE) {
	if (bot->battle_mode() != BM_NONE &&
		bot->normal_attack_policy_value() == NAPV_CONTINUOUS &&
		!bot->sc()->data[SC_EXTRACT_SALAMINE_JUICE]
	) bot->use_item(itm_ind);
}

// 緑ハーブを使う。
AI_ITEM_USE_FUNC(GREEN_HERB) {
	if (bot->sc()->data[SC_POISON] &&
		!skill_unit_exists_block(bot, skill_unit_key_map{SKILL_UNIT_KEY(AS_VENOMDUST, BL_MOB)})
	) bot->use_item(itm_ind);
}

// 緑ポーションを使う。
AI_ITEM_USE_FUNC(GREEN_POTION) {
	if (bot->sc()->data[SC_SILENCE] ||
		bot->sc()->data[SC_BLIND] ||
		bot->sc()->data[SC_HALLUCINATION]
	) bot->use_item(itm_ind);
}

// 聖水を使う。
AI_ITEM_USE_FUNC(HOLY_WATER) {
	if (bot->sc()->data[SC_CURSE] ||
		bot->sc()->data[SC_CHANGEUNDEAD]
	) bot->use_item(itm_ind);
}

// カクテル・竜の吐息を使う。
AI_ITEM_USE_FUNC(INT_DISH10) {
	if (!bot->sc()->data[SC_FOOD_INT_CASH]) bot->use_item(itm_ind);
}

// イグドラシルの葉を使う。
AI_ITEM_USE_FUNC(LEAF_OF_YGGDRASIL) {
	if (battler->can_act()) {
		block_if* mem = pybot::find_if(ALL_RANGE(members), [this] (block_if* mem) -> bool {
			return bot->can_reach_block(mem) &&
				mem->is_dead() &&
				!mem->reject_skills()->find(ALL_RESURRECTION);
		});
		if (mem) {
			try {bot->use_item(itm_ind);}
			catch (const item_used_exception&) {
				bot->use_skill_block(ALL_RESURRECTION, 1, mem);
			}
		}
	}
}

// 九尾狐のしっぽ料理を使う。
AI_ITEM_USE_FUNC(LUK_DISH10) {
	if (!bot->sc()->data[SC_FOOD_LUK_CASH]) bot->use_item(itm_ind);
}

// オルレアンのフルコースを使う。
AI_ITEM_USE_FUNC(ORLEANS_FULL_COURSE) {
	if (!bot->sc()->data[SC_FOOD_STR_CASH] ||
		!bot->sc()->data[SC_FOOD_AGI_CASH] ||
		!bot->sc()->data[SC_FOOD_VIT_CASH] ||
		!bot->sc()->data[SC_FOOD_INT_CASH] ||
		!bot->sc()->data[SC_FOOD_DEX_CASH] ||
		!bot->sc()->data[SC_FOOD_LUK_CASH] ||
		!bot->sc()->data[SC_ATKPOTION] ||
		!bot->sc()->data[SC_MATKPOTION]
	) bot->use_item(itm_ind);
}

// 万能薬を使う。
AI_ITEM_USE_FUNC(PANACEA) {
	if (bot->sc()->data[SC_SILENCE] ||
		bot->sc()->data[SC_BLIND] ||
		bot->sc()->data[SC_CURSE] ||
		bot->sc()->data[SC_HALLUCINATION]
	) bot->use_item(itm_ind);
}

// 毒薬の瓶を使う。
AI_ITEM_USE_FUNC(POISON_BOTTLE) {
	if (bot->sd()->status.class_ == JOB_ASSASSIN_CROSS &&
		bot->battle_mode() != BM_NONE &&
		bot->normal_attack_policy_value() == NAPV_CONTINUOUS &&
		!bot->sc()->data[SC_ASPDPOTION0] &&
		!bot->sc()->data[SC_ASPDPOTION1] &&
		!bot->sc()->data[SC_ASPDPOTION2] &&
		!bot->sc()->data[SC_ASPDPOTION3]
	) bot->use_item(itm_ind);
}

// タンの盛り合わせを使う。
AI_ITEM_USE_FUNC(STR_DISH10) {
	if (!bot->sc()->data[SC_FOOD_STR_CASH]) bot->use_item(itm_ind);
}

// 不死のチゲ鍋を使う。
AI_ITEM_USE_FUNC(VIT_DISH10) {
	if (!bot->sc()->data[SC_FOOD_VIT_CASH]) bot->use_item(itm_ind);
}

// 矢/弾のコンテナを使う関数を作る。
ai_t::item_use_func // 作った関数。
AI_ITEM_USE_DEF(ammo_container)(
	int amm_id // 矢/弾のアイテムID。
) {
	return [amm_id] (ai_t* ai, int itm_ind) {
		if (KEY_EXISTS(ai->bot->request_items(), amm_id)) {
			try {ai->bot->use_item(itm_ind);}
			catch (const item_used_exception& exc) {
				ai->bot->request_items().erase(amm_id);
				pc_equipitem(
					ai->bot->sd(),
					ai->bot->find_inventory(item_key(amm_id)),
					EQP_AMMO
				);
				throw exc;
			}
		}
	};
}

// 速度増加ポーションを使う関数を作る。
ai_t::item_use_func // 作った関数。
AI_ITEM_USE_DEF(aspd_potion)() {
	return [] (ai_t* ai, int itm_ind) {
		if (ai->bot->battle_mode() != BM_NONE &&
			ai->bot->normal_attack_policy_value() == NAPV_CONTINUOUS &&
			!ai->bot->sc()->data[SC_ASPDPOTION0] &&
			!ai->bot->sc()->data[SC_ASPDPOTION1] &&
			!ai->bot->sc()->data[SC_ASPDPOTION2] &&
			!ai->bot->sc()->data[SC_ASPDPOTION3]
		) ai->bot->use_item(itm_ind);
	};
}

}

// Copyright (c) rAthena Dev Teams - Licensed under GNU GPL
// For more information, see LICENCE in the main folder

/**
 * Custom battle config initializations
 * Place the definition of custom battle configuration initializations in this file.
 *
 * Do not forget to add a comma at the end of the line, if you want to add another config
 *
 * Format:
 *	 { "name", &battle_config.<variable name>, <default value>, <minimum value>, <maximum value> },
 **/

	// [GonBee]
  	{"max_flee2", &battle_config.max_flee2, 950, 0, 1000},
	{"max_mdef", &battle_config.max_mdef, 100, 0, 100},
 	{"max_steal_rate", &battle_config.max_steal_rate, 10000, 0, 10000},
 	{"mvp_spawn_delay", &battle_config.mvp_spawn_delay, 10, 0, INT_MAX},
	{"pybot_around_distance", &battle_config.pybot_around_distance, 9, 1, 14},
 	{"pybot_away_distance", &battle_config.pybot_away_distance, 4, 4, 14},
 	{"pybot_away_distance_great", &battle_config.pybot_away_distance_great, 7, 3, 14},
 	{"pybot_heavy_cool_time", &battle_config.pybot_heavy_cool_time, 10000, 0, INT_MAX},
 	{"pybot_reload_equipset_cool_time", &battle_config.pybot_reload_equipset_cool_time, 2500, 100, INT_MAX},
 	{"pybot_restart_cool_time", &battle_config.pybot_restart_cool_time, 300000, 0, INT_MAX},
 	{"pybot_think_time", &battle_config.pybot_think_time, 250, 100, INT_MAX},

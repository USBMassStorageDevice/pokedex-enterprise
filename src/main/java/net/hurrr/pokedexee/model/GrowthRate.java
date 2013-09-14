package net.hurrr.pokedexee.model;

/**
 * GrowthRate is backed by the pokedexes.growth_rates and pokedexes.growth_rate_prose tables.
 * @author myao
 *
 */
public enum GrowthRate {
	NULL,
	SLOW,
	MEDIUM,
	FAST,
	MEDIUM_SLOW,
	SLOW_THEN_VERY_FAST,
	FAST_THEN_VERY_SLOW;
}

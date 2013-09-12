package net.hurrr.pokedexee.model;

/**
 * GrowthRate is backed by the pokedexes.growth_rates and pokedexes.growth_rate_prose tables.
 * @author myao
 *
 */
public enum GrowthRate {
	SLOW(1),
	MEDIUM(2),
	FAST(3),
	MEDIUM_SLOW(4),
	SLOW_THEN_VERY_FAST(5),
	FAST_THEN_VERY_SLOW(6);
	
	private int id;
	
	GrowthRate(int id) {
		this.id = id;
	}	
	
	public int getId() {
		return id;
	}
	
	public static GrowthRate getGrowthRateById(int id) {
		for (GrowthRate growthRate : GrowthRate.values()){
			if (growthRate.getId() == id) {
				return growthRate;
			}
		}
		return null;
	}
}

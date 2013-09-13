package net.hurrr.pokedexee.model;

/**
 * Backed by the pokedexes.pokedexes table
 */
public enum Pokedex {
	NULL(0, null),
	NATIONAL(1, null),
	KANTO(2, Region.KANTO),
	JOHTO(3, Region.JOHTO),
	HOENN(4, Region.HOENN),
	SINNOH(5, Region.SINNOH),
	SINNOH_EXTENDED(6, Region.SINNOH),
	JOHTO_UPDATED(7, Region.JOHTO),
	UNOVA(8, Region.UNOVA),
	UNOVA_UPDATED(9, Region.UNOVA),
	CONQUEST(11, null);
	
	private final int id;
	private final Region region;
	
	Pokedex(int id, Region region) {
		this.id = id;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public Region getRegion() {
		return region;
	}	
}

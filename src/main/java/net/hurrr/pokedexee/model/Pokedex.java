package net.hurrr.pokedexee.model;

/**
 * Backed by the pokedexes.pokedexes table
 */
public enum Pokedex {
	NULL(null),
	NATIONAL(null),
	KANTO(Region.KANTO),
	JOHTO(Region.JOHTO),
	HOENN(Region.HOENN),
	SINNOH(Region.SINNOH),
	SINNOH_EXTENDED(Region.SINNOH),
	JOHTO_UPDATED(Region.JOHTO),
	UNOVA(Region.UNOVA),
	UNOVA_UPDATED(Region.UNOVA),
	PLACEHOLDER_10_THAT_WILL_PROBABLY_BE_KALOS(null), // need this placeholder to maintain Ordinal positions
	CONQUEST(null);
	
	private final Region region;
	
	Pokedex(Region region) {
		this.region = region;
	}

	public Region getRegion() {
		return region;
	}	
}

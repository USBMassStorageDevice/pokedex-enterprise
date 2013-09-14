package net.hurrr.pokedexee.model;

/**
 * Backed by the pokedexes.generation table. I don't agree with some of the canonical IDs, but whatever, trying to be consistent here.
 * @author myao
 *
 */
public enum Generation {
	NULL(null, null),
	GENERATION_I(Region.KANTO, Pokedex.KANTO),
	GENERATION_II(Region.JOHTO, Pokedex.JOHTO_UPDATED),
	GENERATION_III(Region.HOENN, Pokedex.HOENN),
	GENERATION_IV(Region.SINNOH, Pokedex.SINNOH_EXTENDED),
	GENERATION_V(Region.UNOVA, Pokedex.UNOVA);
	
	private final Region region;
	private final Pokedex canonicalPokedex;
	
	Generation(Region region, Pokedex canonicalPokedex) {
		this.region = region;
		this.canonicalPokedex = canonicalPokedex;
	}

	public Region getRegion() {
		return region;
	}

	public Pokedex getCanonicalPokedex() {
		return canonicalPokedex;
	}	
}

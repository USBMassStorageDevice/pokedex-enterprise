package net.hurrr.pokedexee.model;

/**
 * Backed by the pokedexes.generation table. I don't agree with some of the canonical IDs, but whatever, trying to be consistent here.
 * @author myao
 *
 */
public enum Generation {
	NULL(0, null, null),
	GENERATION_I(1, Region.KANTO, Pokedex.KANTO),
	GENERATION_II(2, Region.JOHTO, Pokedex.JOHTO_UPDATED),
	GENERATION_III(3, Region.HOENN, Pokedex.HOENN),
	GENERATION_IV(4, Region.SINNOH, Pokedex.SINNOH_EXTENDED),
	GENERATION_V(5, Region.UNOVA, Pokedex.UNOVA);
	
	private final int id;
	private final Region region;
	private final Pokedex canonicalPokedex;
	
	Generation(int id, Region region, Pokedex canonicalPokedex) {
		this.id = id;
		this.region = region;
		this.canonicalPokedex = canonicalPokedex;
	}

	public int getId() {
		return id;
	}

	public Region getRegion() {
		return region;
	}

	public Pokedex getCanonicalPokedex() {
		return canonicalPokedex;
	}	
}

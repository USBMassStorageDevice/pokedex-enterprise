package net.hurrr.pokedexee.model;

/**
 * Backed by the versions table, version groups, and pokedexes table:
 * <tt>
 * SELECT * FROM pokedexes
 * JOIN version_groups ON version_groups.pokedex_id = pokedexes.id
 * JOIN versions ON versions.version_group_id = version_groups.id
 * </tt>
 */
public enum GameVersion {
	NULL(null, null, null),
	RED(Generation.GENERATION_I, Pokedex.KANTO, Region.KANTO),
	BLUE(Generation.GENERATION_I, Pokedex.KANTO, Region.KANTO),
	YELLOW(Generation.GENERATION_I, Pokedex.KANTO, Region.KANTO),
	GOLD(Generation.GENERATION_II, Pokedex.JOHTO, Region.JOHTO),
	SILVER(Generation.GENERATION_II, Pokedex.JOHTO, Region.JOHTO),
	CRYSTAL(Generation.GENERATION_III, Pokedex.JOHTO, Region.JOHTO),
	RUBY(Generation.GENERATION_III, Pokedex.HOENN, Region.HOENN),
	SAPPHIRE(Generation.GENERATION_III, Pokedex.HOENN, Region.HOENN),
	EMERALD(Generation.GENERATION_III, Pokedex.HOENN, Region.HOENN),
	FIRERED(Generation.GENERATION_III, Pokedex.KANTO, Region.KANTO),
	LEAFGREEN(Generation.GENERATION_III, Pokedex.KANTO, Region.KANTO),
	DIAMOND(Generation.GENERATION_IV, Pokedex.SINNOH, Region.SINNOH),
	PEARL(Generation.GENERATION_IV, Pokedex.SINNOH, Region.SINNOH),
	PLATINUM(Generation.GENERATION_IV, Pokedex.SINNOH_EXTENDED, Region.SINNOH),
	HEARTGOLD(Generation.GENERATION_IV, Pokedex.JOHTO_UPDATED, Region.JOHTO),
	SOULSILVER(Generation.GENERATION_IV, Pokedex.JOHTO_UPDATED, Region.JOHTO),
	BLACK(Generation.GENERATION_V, Pokedex.UNOVA, Region.UNOVA),
	WHITE(Generation.GENERATION_V, Pokedex.UNOVA, Region.UNOVA),
	PLACEHOLDER_19_WHICH_IS_PROBABLY_X(null, null, null), // maintain ordinal
	ANOTHER_PLACEHOLDER_20_WHICH_IS_PROBABLY_Y(null, null, null),	// maintain ordinal
	BLACK_2(Generation.GENERATION_V, Pokedex.UNOVA_UPDATED, Region.UNOVA),
	WHITE_2(Generation.GENERATION_V, Pokedex.UNOVA_UPDATED, Region.UNOVA);
	
	private final Generation generation;
	private final Pokedex pokedex;
	private final Region region;
	
	GameVersion(Generation generation, Pokedex pokedex, Region region) {
		this.generation = generation;
		this.pokedex = pokedex;
		this.region = region;
	}

	public Generation getGeneration() {
		return generation;
	}

	public Pokedex getPokedex() {
		return pokedex;
	}

	public Region getRegion() {
		return region;
	}
}

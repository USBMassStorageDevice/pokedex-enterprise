package net.hurrr.pokedexee.model;

/**
 * Backed by the encounter_methods table.
 */
public enum EncounterMethod {
	NULL(null),
	WALK(1),
	OLD_ROD(6),
	GOOD_ROD(7),
	SUPER_ROD(8),
	SURF(5),
	ROCK_SMASH(12),
	HEADBUTT(13),
	DARK_GRASS(5),
	GRASS_SPOTS(2),
	CAVE_SPOTS(3),
	BRIDGE_SPOTS(4),
	SUPER_ROD_SPOTS(9),
	SURF_SPOTS(11);
	
	private final Integer sortOrder;
	
	private EncounterMethod(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}
}

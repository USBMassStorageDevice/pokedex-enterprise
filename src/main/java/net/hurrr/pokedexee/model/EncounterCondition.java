package net.hurrr.pokedexee.model;

public enum EncounterCondition {
	NULL(Category.NULL, null),
	SWARM_ACTIVE(Category.SWARM, false),
	SWARM_INACTIVE(Category.SWARM, true),
	MORNING(Category.TIME_OF_DAY, false),
	DAYTIME(Category.TIME_OF_DAY, true),
	NIGHT(Category.TIME_OF_DAY, false),
	POKERADAR_ACTIVE(Category.POKERADAR, false),
	POKERADAR_INACTIVE(Category.POKERADAR, true),
	EMPTY_SLOT2(Category.NDS_SLOT2, true),
	RUBY(Category.NDS_SLOT2, false),
	SAPPHIRE(Category.NDS_SLOT2, false),
	EMERALD(Category.NDS_SLOT2, false),
	FIRERED(Category.NDS_SLOT2, false),
	LEAFGREEN(Category.NDS_SLOT2, false),
	RADIO_INACTIVE(Category.RADIO, true),
	RADIO_ACTIVE_HOENN(Category.RADIO, false),
	RADIO_ACTIVE_SINNOH(Category.RADIO, false),
	SPRING(Category.SEASON, false),
	SUMMER(Category.SEASON, false),
	AUTUMN(Category.SEASON, false),
	WINTER(Category.SEASON, false);
	
	public enum Category {
		NULL,
		SWARM,
		TIME_OF_DAY,
		POKERADAR,
		NDS_SLOT2,
		RADIO,
		SEASON;
	}
	
	private Category category;
	private Boolean defaultState;
	
	private EncounterCondition(Category category, Boolean defaultState) {
		this.category = category;
		this.defaultState = defaultState;
	}

	public Category getCategory() {
		return category;
	}

	public Boolean getDefaultState() {
		return defaultState;
	}
}

package net.hurrr.pokedexee.model;

public enum Habitat {
	NULL(0),
	CAVE(1),
	FOREST(2),
	GRASSLAND(3),
	MOUNTAIN(4),
	RARE(5),
	ROUGH_TERRAIN(6),
	SEA(7),
	URBAN(8),
	WATERS_EDGE(9);
	
	private int id;
	
	Habitat(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Habitat getHabitatById(int id) {
		for (Habitat habitat : Habitat.values()) {
			if (habitat.getId() == id) {
				return habitat;
			}
		}
		return null;
	}
}

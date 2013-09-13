package net.hurrr.pokedexee.model;

/**
 * Backed by the pokdexes.regions table
 */
public enum Region {
	NULL(0),
	KANTO(1),
	JOHTO(2),
	HOENN(3),
	SINNOH(4),
	UNOVA(5);
	
	private final int id;
	
	Region(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}

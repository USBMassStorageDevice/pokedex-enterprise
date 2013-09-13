package net.hurrr.pokedexee.model;

public enum Color {
	NULL(0),
	BLACK(1),
	BLUE(2),
	BROWN(3),
	GRAY(4),
	GREEN(5),
	PINK(6),
	PURPLE(7),
	RED(8),
	WHITE(9),
	YELLOW(10);
	
	private int id;
	
	Color(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
}

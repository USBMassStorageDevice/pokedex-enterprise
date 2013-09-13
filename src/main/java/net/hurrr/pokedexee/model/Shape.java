package net.hurrr.pokedexee.model;

/**
 * Backed by the pokemon_shape_prose table. Specifically the pokemon_shape_prose.awesomeName.
 * They really make you sound like you know what you're talking about.
 * @author myao
 */
public enum Shape {
	NULL(0),
	POMACEOUS(1),
	CAUDAL(2),
	ICHTHYIC(3),
	BRACHIAL(4),
	ALVINE(5),
	SCIURINE(6),
	CRURAL(7),
	MENSAL(8),
	ALAR(9),
	CILIAL(10),
	POLYCEPHALIC(11),
	ANTHROPOMORPHIC(12),
	LEPIDOPTEROUS(13),
	CHITINOUS(14);
	
	private int id;
	
	Shape(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

package net.hurrr.pokedexee.model;

/**
 * Backed by the pokemon_shape_prose table. Specifically the pokemon_shape_prose.awesomeName.
 * They really make you sound like you know what you're talking about.
 * @author myao
 */
public enum Shape {
	NULL(null),
	POMACEOUS("ball"),
	CAUDAL("squiggle"),
	ICHTHYIC("fish"),
	BRACHIAL("arms"),
	ALVINE("blob"),
	SCIURINE("upright"),
	CRURAL("legs"),
	MENSAL("quadruped"),
	ALAR("wings"),
	CILIAL("tentacles"),
	POLYCEPHALIC("heads"),
	ANTHROPOMORPHIC("humanoid"),
	LEPIDOPTEROUS("bug-wings"),
	CHITINOUS("armor");
	
	private String simpleName;
	
	Shape(String simpleName) {
		this.simpleName = simpleName;
	}	
	
	public String getSimpleName() {
		return simpleName;
	}
}

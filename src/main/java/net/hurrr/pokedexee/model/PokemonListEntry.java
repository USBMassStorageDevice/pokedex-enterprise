package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * A more lightweight class to enumerate all the Pokémon. All of them.
 */
@XmlRootElement
public class PokemonListEntry {
	private int id;
	private int pokedexNumber;
	private String identifier;
	
	@XmlTransient
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@XmlAttribute
	public int getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(int number) {
		this.pokedexNumber = number;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}

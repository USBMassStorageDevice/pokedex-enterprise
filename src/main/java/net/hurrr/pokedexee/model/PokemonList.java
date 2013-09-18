package net.hurrr.pokedexee.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class PokemonList {
	private Pokedex pokedex;
	private List<PokemonListEntry> pokemonListEntries;
	
	@XmlAttribute
	public Pokedex getPokedex() {
		return pokedex;
	}

	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}
	
	@XmlElement(name = "pokemon")
	public List<PokemonListEntry> getPokemonListEntries() {
		return pokemonListEntries;
	}

	public void setPokemonListEntries(List<PokemonListEntry> pokemonListEntries) {
		this.pokemonListEntries = pokemonListEntries;
	}
}

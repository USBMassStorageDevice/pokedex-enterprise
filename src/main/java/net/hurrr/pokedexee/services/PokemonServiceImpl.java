package net.hurrr.pokedexee.services;

import java.util.List;

import net.hurrr.pokedexee.dao.PokemonMapper;
import net.hurrr.pokedexee.model.PokedexEntry;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;

public class PokemonServiceImpl implements PokemonService {
	
	protected PokemonMapper pokemonMapper;
	
	public Pokemon getPokemon(int id) {
		Pokemon pokemon = pokemonMapper.selectPokemon(id);
		return pokemon;
	}
	
	public Species getSpecies(int id) {
		Species species = pokemonMapper.selectSpecies(id);
		return species;
	}
	
	public List<PokedexEntry> getPokedexEntries(int speciesId) {
		List<PokedexEntry> entry = pokemonMapper.selectPokedexEntries(speciesId);
		return entry;
	}
	
	public void setPokemonMapper(PokemonMapper pokemonMapper) {
		this.pokemonMapper = pokemonMapper;
	}		
}

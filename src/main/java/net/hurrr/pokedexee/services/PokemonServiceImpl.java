package net.hurrr.pokedexee.services;

import java.util.List;

import net.hurrr.pokedexee.dao.PokemonMapper;
import net.hurrr.pokedexee.model.Location;
import net.hurrr.pokedexee.model.Pokedex;
import net.hurrr.pokedexee.model.PokedexEntry;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.PokemonList;
import net.hurrr.pokedexee.model.Species;

public class PokemonServiceImpl implements PokemonService {
	
	protected PokemonMapper pokemonMapper;
	
	public void setPokemonMapper(PokemonMapper pokemonMapper) {
		this.pokemonMapper = pokemonMapper;
	}
	
	@Override
	public Pokemon getPokemon(int pokemonId) {
		Pokemon pokemon = pokemonMapper.selectPokemon(pokemonId);
		return pokemon;
	}
	
	@Override
	public Species getSpecies(int speciesId) {
		Species species = pokemonMapper.selectSpecies(speciesId);
		return species;
	}
	
	@Override
	public List<PokedexEntry> getPokedexEntries(int speciesId) {
		List<PokedexEntry> entry = pokemonMapper.selectPokedexEntries(speciesId);
		return entry;
	}	

	@Override
	public PokemonList getPokemonList(Pokedex pokedex) {
		PokemonList list = new PokemonList();
		list.setPokedex(pokedex);
		list.setPokemonListEntries(pokemonMapper.selectPokemonListEntries(pokedex));
		return list;
	}
	
	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = pokemonMapper.selectLocation();
		return locations;
	}
	
}

package net.hurrr.pokedexee.services;

import java.util.List;

import net.hurrr.pokedexee.model.PokedexEntry;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;

public interface PokemonService {
	
	public Pokemon getPokemon(int id);
	
	public Species getSpecies(int id);
	
	public List<PokedexEntry> getPokedexEntries(int id);
}

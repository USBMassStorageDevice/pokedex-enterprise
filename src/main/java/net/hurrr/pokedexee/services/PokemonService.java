package net.hurrr.pokedexee.services;

import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;

public interface PokemonService {
	
	public Pokemon getPokemon(int id);
	
	public Species getSpecies(int id);

}

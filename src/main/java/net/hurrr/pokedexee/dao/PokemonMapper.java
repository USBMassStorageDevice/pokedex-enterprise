package net.hurrr.pokedexee.dao;

import org.apache.ibatis.annotations.Param;

import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;

public interface PokemonMapper {	
	public Pokemon selectPokemon(@Param("id") int id);
	
	public Species selectSpecies(@Param("id") int id);
}

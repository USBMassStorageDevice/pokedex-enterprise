package net.hurrr.pokedexee.dao;

import org.apache.ibatis.annotations.Param;

import net.hurrr.pokedexee.model.Pokemon;

public interface PokemonMapper {
	public Pokemon getPokemon(@Param("id") int id);
}

package net.hurrr.pokedexee.services;

import net.hurrr.pokedexee.dao.PokemonMapper;
import net.hurrr.pokedexee.model.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;

public class PokemonServiceImpl implements PokemonService {

	protected PokemonMapper pokemonMapper;
	
	public void setPokemonMapper(PokemonMapper pokemonMapper) {
		this.pokemonMapper = pokemonMapper;
	}
	
	public Pokemon getPokemon(int id) {
		return pokemonMapper.getPokemon(id);
	}
}

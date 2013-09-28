package net.hurrr.pokedexee.dao;

import java.util.List;

import net.hurrr.pokedexee.model.Location;
import net.hurrr.pokedexee.model.Pokedex;
import net.hurrr.pokedexee.model.PokedexEntry;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.PokemonListEntry;
import net.hurrr.pokedexee.model.Species;

import org.apache.ibatis.annotations.Param;

public interface PokemonMapper {	
	public Pokemon selectPokemon(@Param("id") int id);
	
	public Species selectSpecies(@Param("id") int id);
	
	public List<PokedexEntry> selectPokedexEntries(@Param("id") int id);
	
	public List<PokemonListEntry> selectPokemonListEntries(@Param("id") Pokedex pokedex);
	
	public List<Location> selectLocation();
}

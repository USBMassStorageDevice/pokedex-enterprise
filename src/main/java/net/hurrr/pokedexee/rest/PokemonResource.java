package net.hurrr.pokedexee.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.hurrr.pokedexee.model.Pokedex;
import net.hurrr.pokedexee.model.PokedexEntry;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.PokemonList;
import net.hurrr.pokedexee.model.Species;
import net.hurrr.pokedexee.services.PokemonService;

@Path("pokemon")
public class PokemonResource {
	
	protected PokemonService pokemonService;
	
	public void setPokemonService(PokemonService pokemonService) {
		this.pokemonService = pokemonService;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public PokemonList getAllPokemon() {
		return pokemonService.getPokemonList(Pokedex.NATIONAL);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Pokemon getPokemon(@PathParam("id") int pokemonId) {
		return pokemonService.getPokemon(pokemonId);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/species/{id}")
	public Species getSpecies(@PathParam("id") int speciesId) {
		return pokemonService.getSpecies(speciesId);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/pokedex/{id}/{versionId}")
	public List<PokedexEntry> getSpecies(@PathParam("id") int speciesId, @PathParam("versionId") int versionId) {
		return pokemonService.getPokedexEntries(speciesId);
	}
}

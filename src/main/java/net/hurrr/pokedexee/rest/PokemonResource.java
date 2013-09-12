package net.hurrr.pokedexee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;
import net.hurrr.pokedexee.services.PokemonService;

@Path("pokemon")
public class PokemonResource {
	
	protected PokemonService pokemonService;
	
	public void setPokemonService(PokemonService pokemonService) {
		this.pokemonService = pokemonService;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "WELCOME TO THE WORLD OF POKÉMON";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Pokemon getPokemon(@PathParam("id") int id) {
		return pokemonService.getPokemon(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/species/{id}")
	public Species getSpecies(@PathParam("id") int id) {
		return pokemonService.getSpecies(id);
	}
}

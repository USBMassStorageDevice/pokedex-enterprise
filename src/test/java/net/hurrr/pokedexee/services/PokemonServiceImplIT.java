package net.hurrr.pokedexee.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.hurrr.pokedexee.model.Pokemon;
import net.hurrr.pokedexee.model.Species;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class PokemonServiceImplIT {
	
	public static final int SCYTHER = 123;
	
	@Autowired
	protected PokemonServiceImpl service;
		
	@Test
	public void testPokemonAndSpecies() {
		Pokemon pokemon = service.getPokemon(SCYTHER);
		Species species = service.getSpecies(SCYTHER);
		assertNotNull(pokemon);
		assertNotNull(species);

		// Pokemon object should contain the same Species information
		assertEquals(pokemon.getSpecies().getId(), species.getId());
		assertEquals(pokemon.getSpecies().getGeneration(), species.getGeneration());		
	}

}

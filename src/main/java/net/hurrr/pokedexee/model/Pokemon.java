/**
 * 
 */
package net.hurrr.pokedexee.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Java Bean representing entry of the pokedexes.pokemon table. From what I have gathered, a
 * Pokémon has a bunch of variable stuff (i.e. height and weight can vary between the unique
 * Pokémon of the same species) and all of the consistent stuff is in Species.
 */
@XmlRootElement
public class Pokemon {
	private int id;
	private int sortOrder;
	private int height;
	private int weight;	
	private int baseExperience;
	private boolean isDefault;

	private Species species;
	private List<PokedexEntry> pokedexEntries;
	
	@XmlTransient // Database ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	@XmlAttribute
	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}
	
	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	@XmlElementWrapper(name = "pokedex")
	@XmlElement(name = "entry")
	public List<PokedexEntry> getPokedexEntries() {
		return pokedexEntries;
	}

	public void setPokedexEntries(List<PokedexEntry> pokedexEntries) {
		this.pokedexEntries = pokedexEntries;
	}
}

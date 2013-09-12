package net.hurrr.pokedexee.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Species {
	private int id;
	private int captureRate;
	private int baseHappiness;
	private int hatchCounter;
	private Generation generation;
	private GrowthRate growthRate;
	private boolean genderDifferences;	
	private boolean baby;
	private boolean formsSwitchable;
	
	private List<Text> names;
	
	// TODO COLOR, SHAPE and HABITAT
	// TODO POKEDEX ORDER
	
	@XmlTransient
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaptureRate() {
		return captureRate;
	}

	public void setCaptureRate(int captureRate) {
		this.captureRate = captureRate;
	}

	public int getBaseHappiness() {
		return baseHappiness;
	}

	public void setBaseHappiness(int baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	public int getHatchCounter() {
		return hatchCounter;
	}

	public void setHatchCounter(int hatchCounter) {
		this.hatchCounter = hatchCounter;
	}

	public Generation getGeneration() {
		return generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}
	
	// Convert to Enum
	public void setGenerationId(int id) {
		this.generation = Generation.getGenerationById(id);
	}

	public GrowthRate getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(GrowthRate growthRate) {
		this.growthRate = growthRate;
	}
	
	// Convert to Enum
	public void setGrowthRateId(int id) {
		this.growthRate = GrowthRate.getGrowthRateById(id);
	}

	public boolean isGenderDifferences() {
		return genderDifferences;
	}

	public void setGenderDifferences(boolean genderDifferences) {
		this.genderDifferences = genderDifferences;
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

	public boolean isFormsSwitchable() {
		return formsSwitchable;
	}

	public void setFormsSwitchable(boolean formsSwitchable) {
		this.formsSwitchable = formsSwitchable;
	}
	
	@XmlElementWrapper(name="names")
    @XmlElement(name="name")
	public List<Text> getNames() {
		return names;
	}

	public void setNames(List<Text> names) {
		this.names = names;
	}
}

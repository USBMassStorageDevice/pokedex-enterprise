package net.hurrr.pokedexee.model;

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
	
	private Name speciesName;
	private int evolvesFromId;
	private int evolutionChainId;
	
	// TODO COLOR, SHAPE and HABITAT
	// TODO POKEDEX ORDER
	
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

	public GrowthRate getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(GrowthRate growthRate) {
		this.growthRate = growthRate;
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

	public Name getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(Name speciesName) {
		this.speciesName = speciesName;
	}

	public int getEvolvesFromId() {
		return evolvesFromId;
	}

	public void setEvolvesFromId(int evolvesFromId) {
		this.evolvesFromId = evolvesFromId;
	}

	public int getEvolutionChainId() {
		return evolutionChainId;
	}

	public void setEvolutionChainId(int evolutionChainId) {
		this.evolutionChainId = evolutionChainId;
	}
}

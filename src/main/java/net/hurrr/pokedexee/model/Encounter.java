package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Encounter {
	private int id;
	private GameVersion gameVersion;
	private Location location;
	private EncounterMethod encounterMethod;
	private EncounterCondition encounterCondition; // TODO NULLABLE
	private int rarity;
	private int minLevel;
	private int maxLevel;

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GameVersion getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(GameVersion gameVersion) {
		this.gameVersion = gameVersion;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public EncounterMethod getEncounterMethod() {
		return encounterMethod;
	}

	public void setEncounterMethod(EncounterMethod encounterMethod) {
		this.encounterMethod = encounterMethod;
	}
	
	public EncounterCondition getEncounterCondition() {
		return encounterCondition;
	}
	
	public void setEncounterCondition(EncounterCondition encounterCondition) {
		this.encounterCondition = encounterCondition;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
}

package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Something something JAXB.
 * @author myao
 */
@XmlRootElement
public class PokedexEntry {
	private int speciesId;
	private GameVersion gameVersion;
	private int number;
	private Text flavorText;
	
	@XmlTransient
	public int getSpeciesId() {
		return speciesId;
	}
	
	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}

	@XmlAttribute
	public GameVersion getGameVersion() {
		return gameVersion;
	}
	
	public void setGameVersion(GameVersion gameVersion) {
		this.gameVersion = gameVersion;
	}	
	
	@XmlAttribute
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Text getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(Text flavorText) {
		this.flavorText = flavorText;
	}	
}

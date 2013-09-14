package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Something something JAXB.
 * @author myao
 */
@XmlRootElement
public class PokedexEntry {
	private GameVersion gameVersion;
	private Text flavorText;
		
	@XmlAttribute
	public GameVersion getGameVersion() {
		return gameVersion;
	}
	
	public void setGameVersion(GameVersion gameVersion) {
		this.gameVersion = gameVersion;
	}

	public Text getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(Text flavorText) {
		this.flavorText = flavorText;
	}	
}

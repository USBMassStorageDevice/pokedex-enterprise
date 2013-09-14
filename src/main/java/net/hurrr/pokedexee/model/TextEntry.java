package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * A localized string. Uses our own Language enum since the Pokémon franchise is constrained to a few languages.
 * Pretty-print logic for that Language enum is also in here.
 * @author myao
 */
@XmlRootElement
public class TextEntry {
	private Language language;
	private String string;
	
	@XmlAttribute
	public Language getLanguage() {
		return language;
	}				

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	@XmlAttribute
	public String getLanguageCode() {
		return language.getLanguage().toString();
	}
	
	@XmlValue
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
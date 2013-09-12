package net.hurrr.pokedexee.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * A localized string. Uses our own Language enum since the Pokémon franchise is constrained to a few languages.
 * Pretty-print logic for that Language enum is shoved in here.
 * @author myao
 */
@XmlRootElement
public class Text {

	private Language language;
	private String text;
	
	@XmlAttribute
	public Language getLanguage() {
		return language;
	}
	
	@XmlAttribute
	public String getLocale() {
		return language.getLanguage()+"";
	}
	
	@XmlAttribute
	public String getAutoglossonym() {
		return language.getAutoglossonym();
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	// Convert to Enum
	public void setLanguageId(int id) {
		this.language = Language.getLanguageById(id);
	}
	
	@XmlValue
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}	
}

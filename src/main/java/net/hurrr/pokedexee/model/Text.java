package net.hurrr.pokedexee.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A localized string. Uses our own Language enum since the Pokémon franchise is constrained to a few languages.
 * Pretty-print logic for that Language enum is shoved in here.
 * @author myao
 */
@XmlRootElement
public class Text {

	private List<TextEntry> entries;

    @XmlElement(name="text")
	public List<TextEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<TextEntry> entries) {
		this.entries = entries;
	}
}

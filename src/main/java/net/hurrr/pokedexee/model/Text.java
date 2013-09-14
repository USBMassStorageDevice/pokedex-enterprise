package net.hurrr.pokedexee.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Localized strings.
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

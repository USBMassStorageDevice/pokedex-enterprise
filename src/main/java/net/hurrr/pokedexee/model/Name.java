package net.hurrr.pokedexee.model;

import java.util.Map;

/**
 * A localizable string. Contains a Language enum since the Pokémon franchise is constrained to a few languages.
 * @author myao
 *
 */
public class Name {

	private Map<Language, String> localizedNames;

	public Map<Language, String> getLocalizedNames() {
		return localizedNames;
	}

	public void setLocalizedNames(Map<Language, String> localizedNames) {
		this.localizedNames = localizedNames;
	}

	public String getLocalizedName(Language language) {
		return localizedNames.get(language);
	}

	public String setLocalizedName(Language language, String string) {
		return localizedNames.put(language, string);
	}
}

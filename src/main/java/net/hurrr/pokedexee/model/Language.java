package net.hurrr.pokedexee.model;

import java.util.Locale;

/**
 * Backed by the pokedexes.languages table. This constrained enum is nice, due to
 * limited localization of the franchise.
 */
public enum Language {
	JAPANESE(1, Locale.JAPANESE), 
	JAPANESE_ROMANIZED(2, new Locale("ja", null, "roomaji")), 
	KOREAN(3, Locale.KOREAN), 
	CHINESE(4, Locale.CHINESE), // assume traditional because I'm pretty sure the franchise has not made it to the mainland (TW/HK only)
	FRENCH(5, Locale.FRENCH), 
	GERMAN(6, Locale.GERMAN), 
	SPANISH(7, new Locale("es")), 
	ITALIAN(8, new Locale("it")), 
	ENGLISH(9, Locale.ENGLISH), 
	CZECH(10, new Locale("cs")); // not an official language, but it's in the database

	private final int id;
	private final Locale language;

	Language(int id, Locale language) {
		this.id = id;
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public Locale getLanguage() {
		return language;
	}
}
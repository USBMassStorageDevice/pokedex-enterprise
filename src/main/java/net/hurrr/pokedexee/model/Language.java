package net.hurrr.pokedexee.model;

import java.util.Locale;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Backed by the pokedexes.languages table. This constrained enum is nice, due to
 * limited localization of the franchise.
 */
@XmlEnum
public enum Language {
	JAPANESE(1, Locale.JAPANESE, "日本語"), 
	JAPANESE_ROMANIZED(2, Locale.JAPANESE, "nihongo"), 
	KOREAN(3, Locale.KOREAN, "한국어"), 
	CHINESE(4, Locale.CHINESE, "中文"), // assume traditional because I'm pretty sure the franchise has not made it to the mainland (TW/HK only)
	FRENCH(5, Locale.FRENCH, "français"), 
	GERMAN(6, Locale.GERMAN, "Deutsch"), 
	SPANISH(7, new Locale("es"), "español"), 
	ITALIAN(8, new Locale("it"), "italiano"), 
	ENGLISH(9, Locale.ENGLISH, "English"), 
	CZECH(10, new Locale("cs"), "čeština"); // not an official supported language, but it's in the database

	private final int id;
	private final Locale language;
	private final String autoglossonym;
		
	Language(int id, Locale language, String autoglossonym) {
		this.id = id;
		this.language = language;
		this.autoglossonym = autoglossonym;
	}
	
	/**
	 * Database ID
	 * @return the database ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns the ISO 639 alpha-2 language code. No country codes.
	 * @return an ISO 639 alpha-2 language code
	 */
	public Locale getLanguage() {
		return language;
	}
	
	/**
	 * TIL autoglossonym: the name of the language in that language
	 * @return the name of the language in that language
	 */
	public String getAutoglossonym() {
		return autoglossonym;
	}
	
	public static Language getLanguageById(int id) {
		for (Language language : Language.values()) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}
}
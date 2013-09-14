package net.hurrr.pokedexee.model;

import java.util.Locale;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Backed by the pokedexes.languages table. This constrained enum is nice, due to
 * limited localization of the franchise.
 */
@XmlEnum
public enum Language {
	NULL(null, null),
	JAPANESE(Locale.JAPANESE, "日本語"), 
	JAPANESE_ROMANIZED(Locale.JAPANESE, "nihongo"), 
	KOREAN(Locale.KOREAN, "한국어"), 
	CHINESE(Locale.CHINESE, "中文"), // assume traditional because I'm pretty sure the franchise has not made it to the mainland (TW/HK only)
	FRENCH(Locale.FRENCH, "français"), 
	GERMAN(Locale.GERMAN, "deutsch"), 
	SPANISH(new Locale("es"), "español"), 
	ITALIAN(new Locale("it"), "italiano"), 
	ENGLISH(Locale.ENGLISH, "english"), 
	CZECH(new Locale("cs"), "čeština"); // not an official supported language, but it's in the database

	private final Locale language;
	private final String autoglossonym;
		
	Language(Locale language, String autoglossonym) {
		this.language = language;
		this.autoglossonym = autoglossonym;
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
}
package com.ihg.nativeapp.languages;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public enum Lang {

	ENGLISH("EN", "en"), SPANISH("ES", "es"), CHINESE("CN", "zh"), TRCHINESE("CN-TW", "zh"), FRENCH("FR",
			"fr"), JAPANESE("JP", "ja"), ITALIAN("IT", "it"),
	// GERMAN("de", "de"),
	PORTUGUESE("PT", "pt"), RUSSIAN("RU", "ru"), TURKISH("TR", "tr"), ARABIC("AE", "ar"),
	// HEBREW("il", "iw"),
	KOREAN("KR", "ko"), DUTCH("NL", "nl");

	private String country;
	private String language;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private Lang(String country, String language) {
		this.country = country;
		this.language = language;
	}

	/**
	 * <p>
	 * Converts <code>arr</code> to a <code>Lang[]</code> object.
	 *
	 * @param arr
	 *            The <code>String[]</code> object to convert.
	 * @return The converted <code>Lang[]</code> object.
	 */
	public static List<Lang> convertValuesToList(String[] arr) {
		List<Lang> values = new ArrayList<>();
		for (String value : arr) {
			try {
				Lang lang = Lang.valueOf(value.toUpperCase());
				if (null != lang && !values.contains(lang)) {
					values.add(lang);
				}
			} catch (IllegalArgumentException e) {
				// Just skip the value.
			}
		}
		return values;
	}

	public static Locale getNativeappLocale(Lang lang) {
		return new Locale(lang.getLanguage(), lang.getCountry());
	}
}

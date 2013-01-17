package com.beunique.utils;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.MessageSource;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * Utility class to handle all of the language issues in this application (e.g.
 * available languages)
 * 
 * @author Bruno
 * 
 */
public class LanguageUtil {

	private static MessageSource messageSource;

	/**
	 * When users submit the copy, they can choos in which language is this
	 * copy, so we can use it later for sorting, statistics etc.
	 * 
	 * @param locale
	 * 
	 * @return Map of languages and codes
	 */
	public static Map<String, String> getAvailableLanguagesForSubmit(
			Locale locale) {
		Map<String, String> languages = new LinkedHashMap<String, String>();

		languages.put("-", messageSource.getMessage("language.please.select",
				null, locale));
		languages.put("EN",
				messageSource.getMessage("language.english", null, locale));
		languages.put("FR",
				messageSource.getMessage("language.french", null, locale));
		languages.put("DE",
				messageSource.getMessage("language.german", null, locale));
		languages.put("SR",
				messageSource.getMessage("language.serbian", null, locale));
		languages.put("other",
				messageSource.getMessage("language.other", null, locale));

		return languages;

	}

	public static MessageSource getMessageSource() {
		return messageSource;
	}

	public static void setMessageSource(MessageSource messageSource) {
		LanguageUtil.messageSource = messageSource;
	}

}

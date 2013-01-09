package com.beunique.utils;

/**
 * Utility class for URL manipulations used in this application
 * 
 * @author Bruno
 * 
 */
public class UrlUtil {

	/**
	 * Extracting tweet ID from provided url
	 * 
	 * @param url
	 * @return tweet ID (long) if the extracting was successful or 0 if unsuccessful
	 */
	public static long extractIdFromUrl(String url) {
		if (!url.contains("twitter.com")) {
			return 0;
		}
		String[] parts = url.split("/");
		String tweetIdTemp = parts[parts.length - 1];
		
		try {
			return Long.parseLong(tweetIdTemp);
		} catch (NumberFormatException e) {
			return 0;
		}


	}

}

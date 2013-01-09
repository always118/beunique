package com.beunique.utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import twitter4j.Status;

/**
 * Utility class containing necessary methods for
 * obtaining/converting/extracting JSON objects
 * 
 * @author Bruno
 * 
 */
public class JsonUtil {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");

	/**
	 * Extract only few information about tweet
	 * 
	 * @param Status
	 *            tweet
	 * @return JSON object representing lightweight tweet. Right now we are
	 *         extracting
	 *         <ul>
	 *         <li>img - URL to author's profile image</li>
	 *         <li>text - actual tweet</li>
	 *         <li>authorName - Full name of author</li>
	 *         <li>authorUsername - Author username</li>
	 *         <li>timestamp - Timestamp when the tweet is created</li>
	 *         </ul>
	 */
	public static String getTweetForPreview(Status tweet) {
		if (tweet == null) {
			return "{}";
		}
		Map<String, String> mapJson = new HashMap<String, String>();
		mapJson.put("img", tweet.getUser().getProfileImageURL());
		mapJson.put("text", tweet.getText());
		mapJson.put("authorName", tweet.getUser().getName());
		mapJson.put("authorUsername", tweet.getUser().getScreenName());
		mapJson.put("timestamp", sdf.format(tweet.getCreatedAt()));
		//TODO handle mentions, links

		JSONObject json = new JSONObject(mapJson);

		return json.toString();

	}

}

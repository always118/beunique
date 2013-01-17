package com.beunique.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.social.twitter.api.Tweet;

import twitter4j.Status;

import com.beunique.model.ComparatorResult;

/**
 * Utility class for comparing tweets. It has overloaded methods to support both
 * twitter4j and spring social representation of tweet.
 * 
 * @author Bruno
 * 
 */
public class TweetComparator {

	/**
	 * Compare two tweets (twitter4j implementation)
	 * 
	 * @param firstTweet
	 *            {@link Status}
	 * @param secondTweet
	 *            {@link Status}
	 * @return {@link ComparatorResult}
	 */
	public static ComparatorResult compareTweets(Status firstTweet,
			Status secondTweet) {
		return null;
	}

	/**
	 * Compare two tweets (Spring Social implementation)
	 * 
	 * @param firstTweet
	 *            {@link Tweet}
	 * @param secondTweet
	 *            {@link Tweet}
	 * @return {@link ComparatorResult}
	 */
	public static ComparatorResult compareTweets(Tweet firstTweet,
			Tweet secondTweet) {
		return null;
	}

	/**
	 * Comparing two tweets represented as {@link String}. Every overloaded
	 * method are just extracting the text from the tweets and calling this
	 * method.
	 * 
	 * @return {@link ComparatorResult}
	 */
	protected static ComparatorResult compareTweets(String firstTweet,
			String secondTweet) {

		boolean isIdentical = checkIfIdentical(firstTweet, secondTweet);

		if (isIdentical) {
			return ComparatorResult.IDENTICAL;
		}

		return null;
	}

	private static boolean checkIfIdentical(String firstTweet,
			String secondTweet) {
		if (StringUtils.equalsIgnoreCase(firstTweet, secondTweet)) {
			return true;
		}
		return false;
	}
}

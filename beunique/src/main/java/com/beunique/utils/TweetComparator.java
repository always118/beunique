package com.beunique.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.social.twitter.api.Tweet;

import twitter4j.Status;

import com.beunique.enums.TweetUniqueness;

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
	 * @return {@link TweetUniqueness}
	 */
	public static TweetUniqueness compareTweets(Status firstTweet,
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
	 * @return {@link TweetUniqueness}
	 */
	public static TweetUniqueness compareTweets(Tweet firstTweet,
			Tweet secondTweet) {
		return null;
	}

	/**
	 * Comparing two tweets represented as {@link String}. Every overloaded
	 * method are just extracting the text from the tweets and calling this
	 * method.
	 * 
	 * @return {@link TweetUniqueness}
	 */
	protected static TweetUniqueness compareTweets(String firstTweet,
			String secondTweet) {

		boolean isIdentical = checkIfIdentical(firstTweet, secondTweet);
		boolean isAlmostIdentical = checkIfAlmostIdentical(firstTweet,
				secondTweet);

		if (isIdentical) {
			return TweetUniqueness.IDENTICAL;
		}
		if (isAlmostIdentical) {
			return TweetUniqueness.ALMOST_IDENTICAL;
		}

		return null;
	}

	private static boolean checkIfAlmostIdentical(String firstTweet,
			String secondTweet) {
		// This is the trickiest part, we need to implement algorithm for
		// recognizing this.
		// Perhaps
		return false;
	}

	private static boolean checkIfIdentical(String firstTweet,
			String secondTweet) {
		firstTweet = getRawText(firstTweet);
		secondTweet = getRawText(secondTweet);

		if (StringUtils.equalsIgnoreCase(firstTweet, secondTweet)) {
			return true;
		}
		return false;
	}

	/**
	 * @param tweet
	 * @return raw text, without ellipsis, smileys etc.
	 */
	private static String getRawText(String tweet) {
		// TODO get this smileys and other keywords from database
		tweet = tweet.replaceAll("[...|:D|:/|:(|:(|:)|:)|;)|]", "").trim();
		tweet = tweet.replaceAll("\\s{2,}", " ");
		return tweet;
	}
}

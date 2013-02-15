package com.beunique.utils;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.beunique.enums.TweetUniqueness;

public class TweetComparatorTest {

	String tweetOne;
	String tweetTwo;

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Identical tweets, nothing is changed. Pure copy paste.
	 */
	@Test
	public void testCompareTweetsStringIdentical() {
		// Preparing test data
		tweetOne = "This is example tweet";
		tweetTwo = "This is example tweet";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

	/**
	 * Identical tweets, first one is upper, and second one is lowercase
	 */
	@Test
	public void testCompareTweetsStringIdenticalDifferentCase() {
		// Preparing test data
		tweetOne = "This is EXAMPLE TWEET";
		tweetTwo = "This is example tweet";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

	/**
	 * Identical tweets, ellipsis in the end
	 */
	@Test
	public void testCompareTweetsStringIdenticalEllipsis() {
		// Preparing test data
		tweetOne = "This is EXAMPLE TWEET";
		tweetTwo = "This is example tweet...";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

	/**
	 * Identical tweets, smiley :D in the end
	 */
	@Test
	public void testCompareTweetsStringIdenticalSmiley() {
		// Preparing test data
		tweetOne = "This is EXAMPLE TWEET :D";
		tweetTwo = "This is example tweet";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

	/**
	 * Identical tweets, a lots of smileys and double spaces after removing them
	 */
	@Test
	public void testCompareTweetsStringIdenticalSmiley2() {
		// Preparing test data
		tweetOne = "This is :/ EXAMPLE :( TWEET :) with ;) lots of  smileys";
		tweetTwo = "This is example tweet with lots of smileys";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

	/**
	 * Identical tweets, a lots of blank space
	 */
	@Test
	public void testCompareTweetsStringIdenticalBlank() {
		// Preparing test data
		tweetOne = "This is example tweet";
		tweetTwo = "This is example      tweet";

		// Testing the method
		TweetUniqueness result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(TweetUniqueness.IDENTICAL, result);

	}

}

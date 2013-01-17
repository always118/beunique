package com.beunique.utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.beunique.model.ComparatorResult;

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
		ComparatorResult result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);

		// Assertions
		assertSame(ComparatorResult.IDENTICAL, result);

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
		ComparatorResult result = TweetComparator.compareTweets(tweetOne,
				tweetTwo);
		
		// Assertions
		assertSame(ComparatorResult.IDENTICAL, result);
		
	}
	
	// TODO test after removing ellipsis at the end

}

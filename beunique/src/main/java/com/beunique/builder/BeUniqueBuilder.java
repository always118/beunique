package com.beunique.builder;

import java.util.Date;

import twitter4j.Status;

import com.beunique.enums.TweetUniqueness;
import com.beunique.model.BeUnique;

/**
 * Builder pattern for {@link BeUnique}
 * 
 * @author Bruno
 * 
 */
public class BeUniqueBuilder {

	private BeUnique beUnique;

	public BeUniqueBuilder withOriginalUrl(String originalUrl) {
		this.beUnique.setOriginalUrl(originalUrl);
		return this;
	}

	public BeUniqueBuilder withCopyUrl(String copyUrl) {
		this.beUnique.setCopyUrl(copyUrl);
		return this;
	}

	public BeUniqueBuilder withLanguage(String language) {
		this.beUnique.setLanguage(language);
		return this;
	}

	public BeUniqueBuilder withDateSubmitted(Date dateSubmitted) {
		this.beUnique.setDateSubmitted(dateSubmitted);
		return this;
	}

	public BeUniqueBuilder withVerificationDate(Date verificationDate) {
		this.beUnique.setVerificationDate(verificationDate);
		return this;
	}

	public BeUniqueBuilder withOriginalTweet(Status originalTweet) {
		this.beUnique.setOriginalTweet(originalTweet);
		return this;
	}

	public BeUniqueBuilder withCopyTweet(Status copyTweet) {
		this.beUnique.setCopyTweet(copyTweet);
		return this;
	}

	public BeUniqueBuilder withUniqueness(TweetUniqueness uniqueness) {
		this.beUnique.setUniqueness(uniqueness);
		return this;
	}

	public BeUniqueBuilder withUpvotes(int upvotes) {
		this.beUnique.setUpvotes(upvotes);
		return this;
	}

	public BeUniqueBuilder withDownvotes(int downvotes) {
		this.beUnique.setDownvotes(downvotes);
		return this;
	}

	public BeUniqueBuilder withGoodGuyUrl(String goodGuyUrl) {
		this.beUnique.setGoodGuyUrl(goodGuyUrl);
		return this;
	}

	public BeUniqueBuilder withBadGuyUrl(String badGuyUrl) {
		this.beUnique.setBadGuyUrl(badGuyUrl);
		return this;
	}

	public BeUniqueBuilder withCombinationHash(String combinationHash) {
		this.beUnique.setCombinationHash(combinationHash);
		return this;
	}

	public BeUnique asBeUnique() {
		return this.beUnique;
	}

}

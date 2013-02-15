package com.beunique.model;

import java.util.Date;

import com.beunique.enums.TweetUniqueness;

import twitter4j.Status;

/**
 * This is the main object, containing all necessary data gathered during the
 * submitting and further processing
 * 
 * @author Bruno
 * 
 */
public class BeUnique {

	// Quick reference to the original tweet url
	private String originalUrl;
	// Quick reference to the copied tweet url
	private String copyUrl;
	// Language in which is copied tweet written
	private String language;
	// When the BeUnique is submitted
	private Date dateSubmitted;
	// When the BeUnique is verified (either automatically or after voting)
	private Date verificationDate;
	// Original tweet (complete Twitter4J status, consider if we need all this
	// data)
	private Status originalTweet;
	// Copy tweet (complete Twitter4J status, consider if we need all this data)
	private Status copyTweet;
	// Level of uniqueness
	private TweetUniqueness uniqueness;
	// Number of votes of people saying this combination has same meaning
	private int upvotes;
	// Number of votes of people saying this combination has different meaning
	private int downvotes;
	// Quick reference to the url of the original author
	private String goodGuyUrl;
	// Quick reference to the url of the copycat author
	private String badGuyUrl;
	// This is used for quick search if the combination is already in our
	// database
	private String combinationHash;

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getCopyUrl() {
		return copyUrl;
	}

	public void setCopyUrl(String copyUrl) {
		this.copyUrl = copyUrl;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public Date getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(Date verificationDate) {
		this.verificationDate = verificationDate;
	}

	public Status getOriginalTweet() {
		return originalTweet;
	}

	public void setOriginalTweet(Status originalTweet) {
		this.originalTweet = originalTweet;
	}

	public Status getCopyTweet() {
		return copyTweet;
	}

	public void setCopyTweet(Status copyTweet) {
		this.copyTweet = copyTweet;
	}

	public TweetUniqueness getUniqueness() {
		return uniqueness;
	}

	public void setUniqueness(TweetUniqueness uniqueness) {
		this.uniqueness = uniqueness;
	}

	public int getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}

	public int getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}

	public String getGoodGuyUrl() {
		return goodGuyUrl;
	}

	public void setGoodGuyUrl(String goodGuyUrl) {
		this.goodGuyUrl = goodGuyUrl;
	}

	public String getBadGuyUrl() {
		return badGuyUrl;
	}

	public void setBadGuyUrl(String badGuyUrl) {
		this.badGuyUrl = badGuyUrl;
	}

	public String getCombinationHash() {
		return combinationHash;
	}

	public void setCombinationHash(String combinationHash) {
		this.combinationHash = combinationHash;
	}

}

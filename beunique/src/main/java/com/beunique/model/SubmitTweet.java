package com.beunique.model;

/**
 * We are using this as a model for submitting with all details gathered during
 * the submit
 * 
 * @author Bruno
 * 
 */
public class SubmitTweet {

	// TODO - think about real twitter objects instead of URLs

	private String originalUrl;
	private String copyUrl;
	private String language;

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

}

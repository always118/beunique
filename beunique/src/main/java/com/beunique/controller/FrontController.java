package com.beunique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.beunique.utils.JsonUtil;
import com.beunique.utils.UrlUtil;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Front controller, used for every web action in this application
 * 
 */
@Controller
@RequestMapping("/")
public class FrontController {

	ConfigurationBuilder cb;
	TwitterFactory tf;
	Twitter twitter;

	public FrontController() {
		// TODO - Find a way to move this into the *context.xml
		cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				.setOAuthConsumerKey("aqKUtc2zQEickHvikVg")
				.setOAuthConsumerSecret(
						"Pe6ZgzTqPQDRnT8LOuoTk4sBdm7oebUdweiGaQ7YY")
				.setOAuthAccessToken(
						"1015727234-pY0zfehX0lZcJEsVaKnT0xAmEqXTtmcpVTlOHX0")
				.setOAuthAccessTokenSecret(
						"1Pt8bZia2DsLEGs8brvp26gs53oQvGNR3AbF3zD1w");
		tf = new TwitterFactory(cb.build());

		twitter = tf.getInstance();

	}

	// Simple URL mappings
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "index";
	}

	@RequestMapping("/submit")
	public String submit() throws Exception {
		return "submit";
	}

	// Ajax mappings
	@RequestMapping(value = "/retrieveTweet" , produces = "text/plain;charset=UTF-8")
	public @ResponseBody
	String retrieveTweet(@RequestParam("tweetUrl") String tweetUrl)
			throws TwitterException {
		long statusId = UrlUtil.extractIdFromUrl(tweetUrl);
		Status status = null;
		try {
			status = twitter.showStatus(statusId);
		} catch (Exception e) {
			// NOP
		}
		return JsonUtil.getTweetForPreview(status);

	}

	// Testing purposes
	@RequestMapping("/add")
	public ModelAndView add(ModelMap model) throws Exception {

		model.addAttribute("message", "print add");
		return new ModelAndView("index");

	}

	@RequestMapping("/delete")
	public ModelAndView delete(ModelMap model) throws Exception {

		model.addAttribute("message", "print delete");
		return new ModelAndView("index");

	}
}

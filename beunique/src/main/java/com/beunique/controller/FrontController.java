package com.beunique.controller;

import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import com.beunique.model.SubmitTweet;
import com.beunique.utils.JsonUtil;
import com.beunique.utils.LanguageUtil;
import com.beunique.utils.UrlUtil;

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

	@RequestMapping(value = "/submit", method = RequestMethod.GET)
	public ModelAndView submit(
			@ModelAttribute("submitTweet") SubmitTweet submitTweet,
			ModelMap model, Locale locale) throws Exception {

		Map<String, String> languages = LanguageUtil
				.getAvailableLanguagesForSubmit(locale);
		model.addAttribute("languages", languages);
		
		return new ModelAndView("submit");
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView submitForm(
			@ModelAttribute("submitTweet") SubmitTweet submitTweet,
			ModelMap model, Locale locale) throws Exception {

		// Without this "redirect:" you will end up with the "Resend this form" popup
		// when you hit refresh after submitting
		return new ModelAndView("redirect:submit");
	}

	// Ajax mappings
	@RequestMapping(value = "/retrieveTweet", produces = "text/plain;charset=UTF-8")
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

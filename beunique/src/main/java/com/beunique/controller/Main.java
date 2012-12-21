package com.beunique.controller;

import java.util.List;

import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Trend;
import org.springframework.social.twitter.api.Trends;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		File f = new File("src/main/webapp/WEB-INF/applicationContext.xml");
		//		System.out.println(f.getAbsolutePath());
		//		ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/applicationContext.xml");
		//		TestController controller = (TestController) context.getBean("testController");

		//		System.out.println(controller.getGit());

		Twitter tw = new TwitterTemplate();
		SearchResults search = tw.searchOperations().search("ko se jednom o mlijeko");
		for (Tweet t : search.getTweets()) {
			System.out.println(t.getText());
			System.out.println(t.getFromUser());
			System.out.println(t.getProfileImageUrl());
			System.out.println(t.getCreatedAt());
		}

		List<Trends> dailyTrends = tw.searchOperations().getDailyTrends();
		for (Trends trends : dailyTrends) {
			for (Trend t : trends.getTrends()) {
				//				System.out.println(t.getName());
			}
		}

	}

}

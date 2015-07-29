package Tweets;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class TweetsAbrufen {

	public static void main(String[] args) {
		
		ConfigurationBuilder cb = new MyConfigurationBuilder().getCb();
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		ResponseList<Location> locations = null;
		try {
			locations = twitter.getAvailableTrends();
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Showing available trends");
		for (Location location : locations) {
		    System.out.println(location.getName() + " (woeid:" + location.getWoeid() + ")");
		}
	}

}

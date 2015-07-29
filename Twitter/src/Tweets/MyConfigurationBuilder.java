package Tweets;

import twitter4j.conf.ConfigurationBuilder;

public class MyConfigurationBuilder {

	
	private ConfigurationBuilder cb;
	
	public MyConfigurationBuilder () {
		
		
		cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("mE3Tb38h9HX5Qi995Fhxp2487")
		  .setOAuthConsumerSecret("vVQQEDS78JouMtmR2YeQYNJVXT8ln08CorIpfFq5qmHmwUsPxf")
		  .setOAuthAccessToken("3164393853-dmuBuQfTwDvbegboaO39ptVf5GeoViBku7QCIyz")
		  .setOAuthAccessTokenSecret("fk7Dz9txk0u4vYpt6KW31nn1ZLAPb0J2cOwrcF6P4EZ7K");
		
		
	}
	
	public ConfigurationBuilder getCb () {
		
		return this.cb;
		
	}
	
	
	
}

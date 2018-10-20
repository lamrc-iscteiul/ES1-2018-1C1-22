package Twitter;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAPI {

	public static List<Status> getTimeline(String user) throws TwitterException {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    	  .setOAuthConsumerKey("W1f0VvgWPfT8OBqVxvy4Mw")
    	  .setOAuthConsumerSecret("zKH2yAtRyefwsgOO8h8Szc4kru68iEm95QmIG7svw")
    	  .setOAuthAccessToken("36481851-VhzByC4f9MSsZES1QZQ4e4iBvA9bWGLyv9HKFpy7c")
    	  .setOAuthAccessTokenSecret("OahDuXF2Lhl5xlNYALhYZir6xSflAxKP9Zh89T05po");
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	
    	Twitter twitter = tf.getInstance();
    	
    	List<Status> statuses = twitter.getUserTimeline(user);
    	
    	return statuses;
	}
	
	public static void printTimelineConsole(List<Status> statuses) {
		System.out.println("------------------------\n Showing home timeline \n------------------------");
 		int counter=1;
        for (Status status : statuses) {
			System.out.println("@"+ status.getUser().getName() + ": " + status.getText() + "\n" +
							   "Retweets: " + status.getRetweetCount() + "         Favorites: " + status.getFavoriteCount() + "\n" +
							   "---------------Tweet N� " + counter + "---------------\n");	
			counter++;
         }
	}
	
	public static String getTimelineText(List<Status> statuses) {
		String result = "";
		result += "------------------------\n Showing user's timeline \n------------------------" + "\n";
 		int counter=1;
        for (Status status : statuses) {
        	result += "@"+ status.getUser().getName() + ": " + status.getText() + "\n" +
        			  "Retweets: " + status.getRetweetCount() + "         Favorites: " + status.getFavoriteCount() + "\n" +
        			  "---------------Tweet N� " + counter + "---------------\n";
        	counter++;
        }
        return result;
	}
	
	public static String getTweet(Status status) {
		String result = "";
		result += "@"+ status.getUser().getName() + ": " + status.getText() + "\n" +
  			  "Retweets: " + status.getRetweetCount() + "         Favorites: " + status.getFavoriteCount();
		return result;
	}
}

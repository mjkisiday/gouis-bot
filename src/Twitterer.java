import twitter4j.GeoLocation;       // jar found at http://twitter4j.org/en/index.html
import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.TwitterException;

import java.io.IOException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.List;

public class Twitterer
   {
      private Twitter twitter;
      private PrintStream consolePrint;
      private List<Status> statuses;

     
      public Twitterer(PrintStream console)
      {
         // Makes an instance of Twitter - this is re-useable and thread safe.
         // Connects to Twitter and performs authorizations.
         twitter = TwitterFactory.getSingleton(); 
         consolePrint = console;
         statuses = new ArrayList<Status>();
      }
   
     /******************  Part 1 *******************/
     /** 
      * This method tweets a given message.
      * @param String  a message you wish to Tweet out
      */
      public void tweetOut(String message) throws TwitterException, IOException
      {
          Status status = twitter.updateStatus(message);
          System.out.println("Successfully updated status to {" + status.getText() + "]");
      }
   
      
     /******************  Part 2 *******************/
     /** 
      * This method queries the tweets of a particular user's handle.
      * @param String  the Twitter handle (username) without the @sign
      */
      @SuppressWarnings("unchecked")
      public void queryHandle(String handle) throws TwitterException, IOException
      {
            statuses.clear();
            fetchTweets(handle);
            int counter = statuses.size();
            while(counter > 0){
                counter--;
                System.out.println("Tweet #"+counter+": "+statuses.get(counter).getText());
            }
      }
   	
     /** 
      * This helper method fetches the most recent 2,000 tweets of a particular user's handle and 
      * stores them in an arrayList of Status objects.  Populates statuses.
      * @param String  the Twitter handle (username) without the @sign
      */
      private void fetchTweets(String handle) throws TwitterException, IOException
      {
            Paging page = new Paging(1,200);
            int p = 1;
            while(p <= 10){
                page.setPage(p);
                statuses.addAll(twitter.getUserTimeline(handle, page));
                p++;
            }
       }   
    
     /******************  Part 3 *******************/
     /** 
      * This method finds the last 100 queries in the San Antonio area since yesterday.
      * Lat/Long for San Antonio is 29.4241° N, 98.4936° W (west is negative.)
      * @param searchTerm the term to search for.
      */
      public void saQuery (String searchTerm)
      {
    
       }
   
   }  

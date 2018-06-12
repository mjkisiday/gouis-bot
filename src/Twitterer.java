import twitter4j.GeoLocation;       // jar found at http://twitter4j.org/en/index.html
import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.TwitterException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Twitterer
   {
      private Twitter twitter;
      private PrintStream consolePrint;
      private List<Status> statuses;

     
      public Twitterer(PrintStream console)
      {
         twitter = TwitterFactory.getSingleton(); 
         consolePrint = console;
         statuses = new ArrayList<Status>();
      }


      //* This method tweets a given message.
      public void tweetOut(String message) throws TwitterException, IOException
      {
          Status status = twitter.updateStatus(message);
          System.out.println("Successfully updated status to {" + status.getText() + "]");
      }
   

      //* This method queries the tweets of a particular user's handle.
      @SuppressWarnings("unchecked")
      public void queryHandle(String handle) throws TwitterException, IOException {
            statuses.clear();
            fetchTweets(handle);
            int counter = statuses.size();
            while(counter > 0){
                counter--;
                System.out.println("Tweet #"+counter+": "+statuses.get(counter).getText());
            }
      }

      //* This helper method fetches the most recent 2,000 tweets of a particular user's handle and
      //* stores them in an arrayList of Status objects.  Populates statuses.
      private void fetchTweets(String handle) throws TwitterException, IOException {
            Paging page = new Paging(1,200);
            int p = 1;
            while(p <= 10){
                page.setPage(p);
                statuses.addAll(twitter.getUserTimeline(handle, page));
                p++;
            }
            twitter.retweetStatus(statuses.get((new Random()).nextInt(statuses.size())).getId());
       }
      // This method finds the last 100 queries in the San Antonio area since yesterday.
      // Lat/Long for San Antonio is 29.4241° N, 98.4936° W (west is negative.)
      public void saQuery (String searchTerm) {

      }

//       private static void menu(Twitter twitter) throws TwitterException, IOException {
//           System.out.println("DF Bot Menu");
//           System.out.println("1. Update Status");
//           System.out.println("2. View Timeline");
//           System.out.println("3. Exit");
//
//           System.out.println("Please enter your choice:");
//
//           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//           String option = br.readLine();
//           int a =Integer.parseInt( option );
//
//           switch(a){
//               case 1: tweetOut(message);
//               case 2: twitter.getUserTimeline(handle, page);
//               case 3: System.out.println("Bye!"); System.exit(0);
//               default: menu(dftb);
//           }
//
//       }
   
   }  

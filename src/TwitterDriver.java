/**
 * Twitter Driver and Client
 * 
 * @author Ria Galanos
 * @author Tony Potter
 * Original idea by Ria Galanos, whose documentation and source can be found at
 * https://github.com/riagalanos/cs1-twitter
 * 
 **/
import twitter4j.TwitterException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

   public class TwitterDriver
   {
      private static PrintStream consolePrint;
   
      public static void main (String []args) throws TwitterException, IOException
      {
         // set up classpath and properties file
             
         Twitterer bigBird = new Twitterer(consolePrint);

         // Problem 1         
         // Create and set a String called message here
      
         String message = "philosophical v a g e n e";
           bigBird.tweetOut(message);

         // Problem 2
         // Choose a public Twitter user's handle
         // and analyze their tweets
         
   
         //Scanner scan = new Scanner(System.in);
         //System.out.print("Please enter a Twitter handle, do not include the '@' symbol (or 'done' to quit.)");
         //String twitter_handle = scan.next();
         //while (!"done".equals(twitter_handle))
         //{
          //   bigBird.queryHandle(twitter_handle);
         //    System.out.print("Please enter a Twitter handle, do not include the '@' symbol (or 'done' to quit.)");
          //   twitter_handle = scan.next();
             
         //}
         
         // Problem 3
         // Find all Spurs-related tweets in a 20 mile radius around San Antonio
         // in the past day.
         bigBird.saQuery("Spurs");

      }//main         
         
   }//class    
         
   
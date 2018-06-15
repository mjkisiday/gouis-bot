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
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;



public class TwitterDriver
   {
      private static PrintStream consolePrint;
   
      public static void main (String []args) throws TwitterException, IOException
      {
             
         Twitterer bigBird = new Twitterer(consolePrint);

            while(true) {
               Random rand = new Random();
               int n = rand.nextInt((2) + 1) + 1;
               if (n == 1) {
                  int r = rand.nextInt((1) + 1)+ 1;
                  if (r == 1) {
                     bigBird.tweetOut(wordgenerator.randomSentence());
                  }else {
                     bigBird.tweetOut(new madlib().madlib1());
                  }
               } else if (n == 2) {
                  bigBird.queryHandle(wordgenerator.randomHandle());
               } else {
                  bigBird.locQuery(wordgenerator.randomBuzzWord());
               }
               try {
                  TimeUnit.SECONDS.sleep(20);
               }catch(Exception e){
                  System.out.println("I broke");
               }
            }















         // Create and set a String called message here
      
//         String message = "kill me";
//           bigBird.tweetOut(wordgenerator.randomSentence());
//         System.out.println(wordgenerator.randomSentence());

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

         // Find all Spurs-related tweets in a 20 mile radius around San Antonio
         // in the past day.
//         bigBird.locQuery("Trump");

      }//main         
         
   }//class    
         
   
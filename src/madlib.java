import java.util.Random;

public class madlib {
    private String[] adjectives = new String[]{"REd","Huge","Meaty","Sopping wet","Ostentatious","thicc"};
    private String[] nouns = new String[]{"Dad","dog","your butt","my face","our station wagon","Trump", "wahmen"};
    private String[] verbs = new String[]{"digs", "eats", "buys", "is looking for","has always found a lot of"};
    private Random rand = new Random();


    private String getRandomNoun(){
        StringBuilder sb = new StringBuilder();
        sb.append(nouns[rand.nextInt(nouns.length)]);
        return sb.toString();
    }

    private String getRandomVerb(){
        StringBuilder sb = new StringBuilder();
        sb.append(verbs[rand.nextInt(verbs.length)]);
        return sb.toString();
    }

    private String getRandomAdjective(){
        StringBuilder sb = new StringBuilder();
        sb.append(adjectives[rand.nextInt(adjectives.length)] );
        return sb.toString();
    }


     String madlib1(){
        StringBuilder sb = new StringBuilder();

        sb.append("it seems like ");
        sb.append(getRandomNoun());
        sb.append(" always ");
        sb.append(getRandomVerb());
        sb.append(" ");
        sb.append(getRandomAdjective());
        sb.append(" ");
        sb.append(getRandomNoun());
        return sb.toString();
    }

    String madlib2(){
         StringBuilder sb = new StringBuilder();
         sb.append("we out here in the ");
         sb.append(getRandomNoun());
         sb.append(" swimming inside of ");
         sb.append(getRandomNoun());
         sb.append(" eating ");
         sb.append(getRandomNoun());
         return sb.toString();
    }

    String madlib3(){
         StringBuilder sb = new StringBuilder();
         sb.append("Women are queens but if she breafes she a ");
         sb.append(getRandomAdjective());
         sb.append(getRandomNoun());
         sb.append(" and she ");
         sb.append(getRandomVerb());
         return sb.toString();
    }

    public String getRandomMadlib(){
        StringBuilder sb = new StringBuilder();
        int r = rand.nextInt((2) + 1) + 1;
        if(r == 1){
            sb.append(madlib1());
        }else if(r == 2){
            sb.append(madlib2());
        }else{
            sb.append(madlib3());
        }
        return sb.toString();
    }


}

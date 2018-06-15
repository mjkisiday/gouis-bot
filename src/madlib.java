import java.util.Random;

public class madlib {
    private String[] adjectives = new String[]{"REd","Huge","Meaty","Sopping wet","Ostentatious","Douchy"};
    private String[] nouns = new String[]{"Dad","dog","your butt","my face","our station wagon","Trump"};
    private String[] verbs = new String[]{"digs", "eats", "buys", "is looking for","has always found a lot of"};
    private Random rand = new Random();

     String madlib1(){
        StringBuilder sb = new StringBuilder();

        sb.append("it seems like ");
        sb.append(nouns[rand.nextInt(nouns.length)]);
        sb.append(" always ");
        sb.append(verbs[rand.nextInt(verbs.length)]);
        sb.append(" ");
        sb.append(adjectives[rand.nextInt(adjectives.length)]);
        sb.append(" ");
        sb.append(nouns[rand.nextInt(nouns.length)]);
        return sb.toString();
    }
}

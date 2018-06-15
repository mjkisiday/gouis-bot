public class wordgenerator {

    static final private String[] nouns = { "life", "matti", "zachary", "vegetable oil",
            "scrubs", "juicy dog", "expose marker", "tinfoil machine", "herbs", "foot lettuce", "menstural cycle", "appendix",
            "The Lord", "z u c c ", "jeuse"};

    static final private String[] verbs = { "ran", "swam", "succd",
            "milked", "itched", "seduced", "eroticized", "extricated", "excreetated", "pinched", "instantiated", "ate", "exterminated",
            "exanguinated"};

    static final private String[] modifiers = { "that left me to die", "showing my superiority",
            "all asian and caucasian",
            "all s a d", "with the crumpled horn", "while I ate dogge" };

    static final private String[] phrases = { " I am ", " This is ", " You are ", " We is ", " She be ", " To be ", " That is ", "I wasn't ",
            "My mom is ", "If she breathed ", "cuz all women are queens "};

    static final private String[] buzzwords = {"Trump", "Kanye", "Russia", "equity", "my president", "ihop", "ihob", "kim jong", "flat earth"};

    static final private String[] handles = {"realDonaldTrump", "kanyewest", "wendys", "RudyGiuilani", "BurgerKing", "elonmusk", "jacobsartorius",
                                                "PPFA", "JonTronShow", "JimCarrey", "Pontifex"};


    /**
     * Generate a random sentence, following the grammar rule for a sentence.
     */
    static String randomSentence() {

        /* A simple sentence */
        StringBuilder sb = new StringBuilder();

        sb.append(randomSimpleSentence());

        /* Optionally, "and" followed by another simple sentence.*/

        if (Math.random() > 0.75) { // 25% of sentences continue with another clause.
            sb.append(" and ");
            sb.append(randomSimpleSentence());
        }
        return sb.toString();
    }

    /**
     * Generate a random simple_sentence, following the grammar rule for a simple_sentence.
     */
    static String randomSimpleSentence() {

        /* "this is", optionally followed by a noun phrase, followed by "the house that Jack built. */
        StringBuilder sb = new StringBuilder();
        int p = (int)(Math.random()*phrases.length);
        sb.append(phrases[p]);
        if (Math.random() > 0.15) { // 85% of sentences have a noun phrase.
            sb.append(randomNounPhrase());
        }
        int n = (int)(Math.random()*nouns.length);
        sb.append(nouns[n]);
        return sb.toString();
    }

    /**
     * Generates a random noun_phrase, following the grammar rule for a noun_phrase.
     */
    static String randomNounPhrase() {

        /* A random noun. */
        StringBuilder sb = new StringBuilder();

        int n = (int)(Math.random()*nouns.length);
        sb.append("the " + nouns[n]);

        /* Optionally, a modifier. */

        if (Math.random() > 0.75) { // 25% chance of having a modifier.
            int m = (int)(Math.random()*modifiers.length);
            sb.append(" " + modifiers[m]);
        }

        /* "that", followed by a random verb */

        int v = (int)(Math.random()*verbs.length);
        sb.append(" that " + verbs[v] + " ");

        /* Another random noun phrase */

        if (Math.random() > 0.5) {  // 50% chance of having another noun phrase.
            sb.append(randomNounPhrase());
        }
        return sb.toString();

    }

    static String randomBuzzWord(){
        StringBuilder sb = new StringBuilder();
        int i = (int)(Math.random()*buzzwords.length);
        sb.append(buzzwords[i]);
        return sb.toString();

    }

    static String randomHandle(){
        StringBuilder sb = new StringBuilder();
        int i = (int)(Math.random()*handles.length);
        sb.append(handles[i]);
        return sb.toString();
    }

}

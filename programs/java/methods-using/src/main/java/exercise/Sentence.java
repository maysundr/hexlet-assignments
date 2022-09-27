package exercise;

import java.util.Locale;

class Sentence {
    public static void printSentence(String sentence) {
        // BEGIN
        var lastIndex = sentence.charAt(sentence.length() - 1);
        if (lastIndex == '!') {
            System.out.println(sentence.toUpperCase());
        } else {
            System.out.println(sentence.toLowerCase());
        }
        // END
    }
}

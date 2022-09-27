package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {

        List<Character> lettersCopy = new ArrayList<>();
        for (char letter : letters.toLowerCase().toCharArray()) {
            lettersCopy.add(letter);
        }

        List<Character> wordCopy = new ArrayList<>();
        for (char letter : word.toLowerCase().toCharArray()) {
            wordCopy.add(letter);
        }

        List<Character> check = new ArrayList<>();

        for (Character letterWord: wordCopy) {
                if (lettersCopy.contains(letterWord)) {
                    lettersCopy.remove(letterWord);
                    check.add(letterWord);
            }
        }
        if (check.size() == word.length()) {
            return true;
        }
        return false;
    }
}

//END

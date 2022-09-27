package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {


    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        String[] arr = sentence.split(" ");

        if(sentence.length() == 0) {
            return result;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!result.containsKey(arr[i])) {
                result.put(arr[i], 1);
            } else {
                Integer value = result.get(arr[i]);
                value++;
                result.put(arr[i], value);
            }

        }
        return result;
    }


    public static String toString(Map<String, Integer> result) {

        String check = "";

        if (result.isEmpty()) {
            return "{}";
        }

        for(Map.Entry<String, Integer> entry: result.entrySet()) {
            check += "\u0020" + "\u0020" + entry.getKey() + ": " +  entry.getValue() + "\n";
        }

        return "{\n" + check + "}";
    }
}
//END

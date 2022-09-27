package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> listOfSearch) {

        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> test : books) {
            int index = 0;

            for (Map.Entry<String, String> entry : listOfSearch.entrySet()) {
                boolean check = false;
                String valueBook = entry.getValue();
                check = test.containsValue(valueBook);

                if (check) {
                    index++;
                }
            }

            if (index == (listOfSearch.size())) {
                result.add(test);
            }
        }
        return result;
    }

}

//END

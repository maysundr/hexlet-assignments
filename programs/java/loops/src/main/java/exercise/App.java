package exercise;

import java.util.Locale;

class App {
    // BEGIN
    public static String getAbbreviation(String str) {
        str = str.trim();
        var i = 0;
        var result = "" + str.charAt(0);
        while (i < str.length()) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                result =  result + str.charAt(i + 1);
            }
            i += 1;

        }
        return  result.toUpperCase();
    }
    // END
}

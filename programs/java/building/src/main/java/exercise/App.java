// BEGIN
package exercise;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //System.out.println(App.toJson(fruits));
    }

    public static String toJson(String[] fruits) {
        Gson gson = new Gson();
        //String[] fruits = {"apple", "pear", "lemon"};
        String jsonArray = gson.toJson(fruits);
        return jsonArray;
    }
}
// END

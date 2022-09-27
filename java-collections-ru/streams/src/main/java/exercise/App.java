package exercise;



import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {

        int firstEmail = (int) emailsList.stream()
                 .filter(email -> {
                     boolean freeEmails = (email.contains("@hotmail.com") || email.contains("@yandex.ru") || email.contains("@gmail.com"));
                     return freeEmails;
                 })
                 .count();

        return firstEmail;
    }
}
// END

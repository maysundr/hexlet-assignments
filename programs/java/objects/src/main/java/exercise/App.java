package exercise;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class App {
    // BEGIN

    public static String buildList(String[] arr) {

        if (arr.length == 0) {
            return "";
        }

        String str1 = "<ul>\n";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append("  <li>" + arr[i] + "</li>\n");
        }

        String str2 = "</ul>";
        stringBuilder.append(str2);

        return stringBuilder.toString();
    }



    public static String getUsersByYear(String[][] users, int year) {

        int index = 0;
        String[] person = new String[users.length];

        for (int i = 0; i < users.length; i++) {

            String yearUser = users[i][1];
            LocalDate date1 = LocalDate.parse(yearUser);
            int yearBirth = date1.getYear();

            if (yearBirth == year) {
                person[index] = users[i][0];
                index++;
            }
        }

        person = Arrays.copyOfRange(person, 0, index);

        return buildList(person);


    }
    // END

    // Это дополнительная задача, которая выполняется по желанию.
    public static String getYoungestUser(String[][] users, String date) throws Exception {
        // BEGIN

        String youngestUserName = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate controlDate = LocalDate.parse(date, formatter);
        LocalDate youngestUserBirthDate = LocalDate.MIN;

        for (int i = 0; i < users.length; i++) {

            String yearUser = users[i][1];
            LocalDate dateYear = LocalDate.parse(yearUser);

            if (dateYear.isBefore(controlDate)) {
                 if (youngestUserBirthDate.isBefore(dateYear)) {
                     youngestUserBirthDate = dateYear;
                     youngestUserName = users[i][0];
                 }
            }
        }
        return youngestUserName;


        // END
    }

    public static void main(String[] args) throws Exception {
        String[][] users = {
                {"Andrey Petrov", "1990-11-23"},
                {"Aleksey Ivanov", "2000-02-15"},
                {"Anna Sidorova", "1996-09-09"},
                {"John Smith", "1989-03-11"},
                {"Vanessa Vulf", "1985-11-16"},
                {"Vladimir Nikolaev", "1990-12-27"},
                {"Alice Lucas", "1986-01-01"},
                {"Elsa Oscar", "1989-03-10"},
        };
        System.out.println(getYoungestUser(users, "11 Jul 1989"));
    }
}

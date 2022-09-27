package exercise;

class App {
    // BEGIN
    public static String getTypeOfTriangle(int a, int b, int c) {

        while (a + b > c && a + c > b && b + c > a) {
            if (a != b && b != c && a != c) {
                return "Разносторонний";
            }
            else if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
                return "Равнобедренный";
            }
            else if (a == b && b == c) {
                return "Равносторонний";
            }

        }

        return "Треугольник не существует";

    }

    public static int getFinalGrade(int exam, int project) {
        if (exam > 90 || project > 10) {
            return 100;
        } else if (exam > 75 || project > 5) {
            return 90;
        } else if (exam > 50 || project >= 2) {
            return 75;
        } else {
            return 0;
        }

    }
    // END
}

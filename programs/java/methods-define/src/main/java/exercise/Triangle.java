package exercise;

class Triangle {
    // BEGIN
    public static double getSquare(int a, int b, int angle) {
        return a * b * Math.sin(angle * 3.14 / 180) / 2;
    }
    public static void main(String[] args) {
        System.out.println(getSquare(4, 5, 45));
    }
    // END
}

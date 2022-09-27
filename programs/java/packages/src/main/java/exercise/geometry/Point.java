// BEGIN
package exercise.geometry;
// END

public class Point {
    public static double newBeginX;
    public static double newBeginY;
    public static double newEndX;
    public static double newEndY;

    public static double[] makePoint(double x, double y) {
        double[] point = {x, y};
        return point;
    }

    public static double getX(double[] point) {
        return point[0];
    }

    public static double getY(double[] point) {
        return point[1];
    }
}


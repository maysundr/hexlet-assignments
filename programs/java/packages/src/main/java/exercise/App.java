// BEGIN
package exercise;

import exercise.geometry.Point;
import exercise.geometry.Segment;

public class App {

    public static void main(String[] args) {
        double[][] segment1 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(5, 8));
        System.out.println(App.isBelongToOneQuadrant(segment1)); // true
        double[][] segment2 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(-2, 8));
        System.out.println(App.isBelongToOneQuadrant(segment2)); // false
        double[][] segment3 = Segment.makeSegment(Point.makePoint(1, 4), Point.makePoint(0, 0));
        System.out.println(App.isBelongToOneQuadrant(segment3)); // false
    }

    public static double[] getMidpointOfSegment(double[][] segment) {
        double midlePointX = (segment[0][0] + segment[1][0]) / 2;
        double midlePointY = (segment[0][1] + segment[1][1]) / 2;
        double[] pointMid = {midlePointX, midlePointY};
        return pointMid;
    }

    public static double[][] reverse(double[][] segment) {

        Point pointX1 = new Point();
        Point pointX2 = new Point();
        Point pointY1 = new Point();
        Point pointY2 = new Point();

        double[] arr = segment[0];
        double[] arr1 = segment[1];

        pointY1.newEndY = Point.getY(arr);
        pointX1.newEndX = Point.getX(arr);
        pointY2.newBeginY = Point.getY(arr1);
        pointX2.newBeginX = Point.getX(arr1);

        return Segment.makeSegment(Point.makePoint(pointX2.newBeginX, pointY2.newBeginY), Point.makePoint(pointX2.newEndX, pointY2.newEndY));
    }

    public static boolean isBelongToOneQuadrant(double[][] segment) {

        if (Point.getX(segment[0]) > 0 && Point.getY(segment[0]) > 0 & Point.getX(segment[1]) > 0 && Point.getY(segment[1]) > 0) {
            return true;
        }

        if (Point.getX(segment[0]) < 0 && Point.getY(segment[0]) > 0 & Point.getX(segment[1]) < 0 && Point.getY(segment[1]) > 0) {
            return true;
        }

        if (Point.getX(segment[0]) < 0 && Point.getY(segment[0]) < 0 & Point.getX(segment[1]) < 0 && Point.getY(segment[1]) < 0) {
            return true;
        }

        if (Point.getX(segment[0]) > 0 && Point.getY(segment[0]) < 0 & Point.getX(segment[1]) > 0 && Point.getY(segment[1]) < 0) {
            return true;
        }

        return false;

    }
}
// END

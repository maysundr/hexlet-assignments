package exercise;

class Point {
    // BEGIN
    public static int[] makePoint(int x, int y) {
        return new int[]{x, y};
    }

    public static int getX(int[] point) {
        return point[0];
    }

    public static int getY(int[] point) {
        return point[1];
    }

    public static String pointToString(int[] point) {
        int x = point[0];
        int y = point[1];
        String result = "(" + x + ", " + y + ")";
        return result;
    }

    public static int getQuadrant(int[] point) {
        int result = 0;
        if (point[0] > 0 && point[1] > 0) {
            result = 1;
        }
        if (point[0] < 0 && point[1] > 0) {
            result = 2;
        }
        if (point[0] < 0 && point[1] < 0) {
            result = 3;
        }
        if (point[0] > 0 && point[1] < 0) {
            result = 4;
        }
        return result;
    }

    public static int[] getSymmetricalPointByX(int[] point) {
        int simmetricalPoint = -1 * point[1];
        return new int[] {point[0], simmetricalPoint};
    }

    public static double calculateDistance(int[] point1, int[] point2) {
        int sideX = Math.abs(point1[0] - point2[0]);
        int sideY = Math.abs(point1[1] - point2[1]);
        double sum = Math.pow(sideX, 2) + Math.pow(sideY, 2);
        double distanceXY = Math.sqrt(sum);
        return distanceXY;
    }
    // END
}

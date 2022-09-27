package exercise;

class App {
    // BEGIN
    /*public static int[] reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i += 1) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }*/

    public static int[] reverse(int[] numbers) {
        int[] result = new int[numbers.length];
            for (int i = 0; i < numbers.length; i += 1) {
                    result[numbers.length - 1 - i] = numbers[i];
            }
        return result;
    }


    public static int mult(int[] numbers) {
        int result = 1;
        for (int i = 0; i <= numbers.length - 1; i += 1) {
            result *= numbers[i];
        }
        return result;
    }

    public static int[] flattenMatrix(int[][] arr) {
        int[] nullArr = new int[arr.length];
        if (arr.length == 0) {
            return nullArr;
        } else {
            int[] result = new int[arr.length * arr[0].length];
            //System.out.println(arr[0].length);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int index = i * arr[0].length + j;
                    result[index] = arr[i][j];
                }
            }
            return result;
        }
    }
    // END
}

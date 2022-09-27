package exercise;

import java.util.Arrays;

class App {
    // BEGIN
    public static int getIndexOfMaxNegative(int[] arr) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && index == -1) {
                index = i;
            }
            if (arr[i] < 0 && arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] getElementsLessAverage(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int [] result = new int[arr.length];
        int sum = 0;
        int index = 0;

        for (int numbers : arr) {
            sum += numbers;
        }

        int average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= average) {
                result[index] = arr[i];
                index++;
            }
        }

        return Arrays.copyOfRange(result, 0, index);
    }

    public static int getSumBeforeMinAndMax(int[] arr) {

        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[indexMin] < arr[i]) {
                indexMin = i;
            }
            if (arr[indexMax] > arr[i]) {
                indexMax = i;
            }
        }

        if (indexMax > indexMin) {
            for (int i = indexMin; i < indexMax; i++) {
                sum += arr[i];
            }
        }

        if (indexMax < indexMin) {
            for (int i = indexMax; i < indexMin; i++) {
                sum += arr[i];
            }
        }

        return sum;
    }
    // END
}

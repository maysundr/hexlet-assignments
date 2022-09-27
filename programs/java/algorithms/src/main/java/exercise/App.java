package exercise;

class App {
    // BEGIN

    public static int[] sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }






    public static int[] sortSelection(int[] numbers) {

        for (int left = 0; left < numbers.length; left++) {

            int minInd = left;

            for (int i = left; i < numbers.length; i++) {
                if (numbers[i] < numbers[minInd]) {
                    minInd = i;
                }
            }

            int swap = numbers[left];
            numbers[left] = numbers[minInd];
            numbers[minInd] = swap;
        }
        return numbers;
    }
    // END
}

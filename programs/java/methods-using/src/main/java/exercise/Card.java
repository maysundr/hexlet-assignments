package exercise;

class Card {
    public static void printHiddenCard(String cardNumber, int starsCount) {
        // BEGIN
        var visibleCard = cardNumber.substring(12);
        String result = "";
        int i = 0;
        while (i < starsCount) {
            result += "*";
            i += 1;
        }
        System.out.println(result + visibleCard);
        // END
    }
}

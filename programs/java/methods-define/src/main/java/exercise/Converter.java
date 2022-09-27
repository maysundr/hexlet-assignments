package exercise;

class Converter {
    // BEGIN
    public static int convert(int number, String str ) {
        switch (str) {
            case "Kb":
                return number / 1024;
                //break;
            case "b":
                return  number * 1024;
                //break;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("10 Kb = " + convert(10, "b") + " b");
    }
    // END
}

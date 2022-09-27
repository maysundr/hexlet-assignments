package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;


// BEGIN
public class Kennel {

    private static String[][] allPuppies;


    public static void addPuppy(String[] puppy) {
        int currentCount = allPuppies.length;
        allPuppies = Arrays.copyOf(allPuppies, currentCount + 1);
        allPuppies[currentCount] = puppy;
    }

    public static void addSomePuppies(String[][] puppies) {
        int newPuppiesCount = puppies.length;
        int currentCount = allPuppies.length;
        allPuppies = Arrays.copyOf(allPuppies, currentCount + newPuppiesCount);
        int index = currentCount;
        for (String[] puppy: puppies) {
            allPuppies[index] = puppy;
            index++;
        }

    }


    public static int getPuppyCount() {
        return allPuppies.length;
    }

    public static boolean isContainPuppy(String name) {
        for (String[] puppy: allPuppies) {
            String currentName = puppy[0];
            if (currentName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String[][] getAllPuppies() {
        return allPuppies;
    }


    public static String[] getNamesByBreed(String breed) {
        String[] names = new String[allPuppies.length];
        int index = 0;
        for (int i = 0; i < allPuppies.length; i++) {
            if (allPuppies[i][1] == breed) {
                names[index] = allPuppies[i][0];
                index++;
            }
        }

        return Arrays.copyOfRange(names, 0, index);
    }


    public static void resetKennel() {
        allPuppies = new String[0][0];
    }


    public static boolean removePuppy(String name) {
        String[] names = new String[allPuppies.length - 1];
        for (int i = 0; i < allPuppies.length; i++) {
            if (allPuppies[i][0] == name) {
                System.arraycopy(allPuppies, 0, names, 0, i);
                System.arraycopy(allPuppies, i + 1, names, i, allPuppies.length - 1);
                System.out.println(Arrays.toString(names));
                return true;
            }
        }
        return false;
    }
}
// END



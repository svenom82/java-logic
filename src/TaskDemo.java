import java.util.Arrays;
import java.util.Scanner;

public class TaskDemo {

    public static void main(String[] args) {
        String[] words = {"код", "Програмирование", "джава"};
        System.out.println(findLongestWorld(words));

    }
    public static String findLongestWorld (String[] world) {
        String longest = world[0];
        for (int i = 1; i < world.length; i++) {
            if (longest.length() < world[i].length()) {
                longest = world[i];
            }
        } return longest;
    }
}

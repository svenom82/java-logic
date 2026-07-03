import java.util.Arrays;
import java.util.SplittableRandom;

public class TaskDemo {


    public static void main(String[] args) {
        String name = " евгений ";
        System.out.println(formatUserName(name));

    }

    public static String formatUserName(String name) {
      String cleanName = name.trim();
      String firstLetter = cleanName.substring(0, 1).toUpperCase();
      String restOfName = cleanName.substring(1).toLowerCase();


        return firstLetter + restOfName;
    }
}


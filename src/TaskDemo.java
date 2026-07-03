import java.util.Arrays;
import java.util.SplittableRandom;

public class TaskDemo {


    public static void main(String[] args) {
        int[] userId = {101, 102, 103, 104, 105};
        boolean[] userStatus = {true, false, true, false, true};
        printPremiumUser(userId, userStatus);

    }
    public static void printPremiumUser (int[] userId, boolean[] userStatus) {
        for (int i = 0; i < userId.length; i++) {
            if (userStatus[i]) {
                System.out.print(userId[i] + " ");
            }
        }
    }


}


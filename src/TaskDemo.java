import java.util.Arrays;

public class TaskDemo {

    public static void main(String[] args) {

        int[] yearUser = new int[]{2010, 1995, 2008, 2024, 2015, 1990};
        System.out.println("Совершеннолетних: " + yearUserCount(yearUser));
    }

    public static int yearUserCount(int[] yearUser) {
        int currentUser = 2026;
        int count = 0;

        for (int i = 0; i < yearUser.length; i++) {
            int age = currentUser - yearUser[i];

            if (age >= 18) {
                count++;
            }


        }
        return count;

    }
}
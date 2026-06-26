import java.util.Arrays;
import java.util.Scanner;

public class TaskDemo {

    public static void main(String[] args) {
        Status[] statuses = new Status[]{Status.SUCCESS, Status.ERROR, Status.WARNING};
        System.out.println(Array(statuses));
    }

    public static int Array(Status[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Status.ERROR) {
                count++;
            }
        }
        return count;

    }

}

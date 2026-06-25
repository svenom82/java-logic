import java.util.Scanner;

public class TaskDemo {

    public static void main(String[] args) {
        String[] color = {"FFFFFF", "000000", "E7495B", "333333"};
        System.out.println(findColor(color,"E7495B"));
    }
    public static boolean findColor(String[] pallete, String target) {
        for (int i = 0; i < pallete.length; i++) {
            if (pallete[i].equalsIgnoreCase(target)) {
                return true;
            }
        } return  false;
    }
}

import java.util.Arrays;

public class TaskDemo {

    public static void main(String[] args) {
        String[] list = {"Колодец ", "Собака ", "Корова " };
        System.out.println(mergeText(list));
    }
    public static String mergeText(String[] list){
        String line = "";

        for (int i = 0; i < list.length; i++) {
            line = line + list[i];
        } return  line;
    }


}

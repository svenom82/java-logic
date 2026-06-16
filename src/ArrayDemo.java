import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        U.pl("За сколько дней выводить температуру ? ");
        int num = input.nextInt();

        int[] days = new int[num];

        for (int i = 0; i < days.length; i++) {
            U.pl("Введите температуру за день: " + (i + 1) + ";");
            days[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }

        int average = sum / num;
        U.pl("Средняя температура за " + num + "дней составила " + average);



    }
}

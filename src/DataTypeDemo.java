import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            U.pl(" Введите сумму в доларах: ");
            double sum = sc.nextDouble();
            U.pl("Введите символ: e (евро), y (юань), q (выход) ");
            char operation = sc.next().charAt(0);

            switch (operation) {
                case 'q':
                    System.out.println(" Выход из программы");
                    break;
                case 'y':
                    System.out.println(" Вы выбрали юани: сумма " + (sum * 7.23));
                    break;
                case 'e':
                    System.out.println(" Вы выбрали евро: сумма " + (sum * 0.45));
                    break;
                default:
                    System.out.println(" Неверный код операции ");
            }

        }
    }
}
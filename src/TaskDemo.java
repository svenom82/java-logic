import java.util.ArrayList;

public class TaskDemo {

    public static void main(String[] args) {
        try {
            // throw new IllegalArgumentException("Неверный формат данных");
        } catch (IllegalArgumentException e) {

            System.out.println("Сработал перехват, Сообщение: " + e.getMessage());
        } finally {
            U.pl("Завершение операции");
        }
    }
}

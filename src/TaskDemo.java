import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;


public class TaskDemo {

    enum Status {Scheduled, Active, Overdue}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите дату: ");
        String dateText = input.nextLine();

        System.out.println(checkDate(dateText));
    }

    public static String checkDate(String date) {
        try {
            LocalDate inputDate = LocalDate.parse(date);
            LocalDate today = LocalDate.now();
            Status currentStatus;

            if (inputDate.isBefore(today)) {
                currentStatus = Status.Overdue;
            } else if (inputDate.isEqual(today)) {
                currentStatus = Status.Active;
            } else {
                currentStatus = Status.Scheduled;
            }
            switch (currentStatus) {
                case Overdue:
                return "Статус: Просрочено";
                case Active:
                return  "Статус: Активно сегодня";
                case Scheduled:
                return "Статус: Запланированно";
                default:
                return "Статус: Неизвестен";
            }
        } catch (DateTimeParseException e ) {return  "Ошибка: неверный формат ввода даты";}
    }

}
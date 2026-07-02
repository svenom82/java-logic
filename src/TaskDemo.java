import java.util.Arrays;

public class TaskDemo {


    public static void main(String[] args) {

        int[] time = {20, 51, 55, 66, 45, 54};
        System.out.println("Общее количество минут: " + calculateTotalMinutes(time));
        System.out.println("Среднее время просмотра: " + calculateTotalMinutes(time) / time.length);

        System.out.println("Количество дней больше 50 минут :" + countLongSessions(time) + "дней");
        System.out.println("Ваш статус: " + getUserStatus(countLongSessions(time)));

    }

    public static int calculateTotalMinutes(int[] time) {
        int days = 0;

        for (int i = 0; i < time.length; i++) {
            days += time[i];
        }
        return days;
    }

    public static int countLongSessions(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] > 50) {
                count++;
            }
        }
        return count;
    }
    public static Status getUserStatus(int count) {
        switch (count) {
            case 0, 1, 2 ->  {return Status.LOW;}
            case 3, 4, 5 -> {return Status.MEDIUM;}
            default -> {return Status.HIGH;}
        }
    }


}
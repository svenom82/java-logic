import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TaskDemo {

    public static void main(String[] args) {

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoTime = ZonedDateTime.now(tokyoZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String uiText = tokyoTime.format(formatter);
        System.out.println("Точное время в Токио: " + uiText);
    }
}

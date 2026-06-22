import java.util.ArrayList;

public class TaskDemo {

    public static void main(String[] args) {
        ArrayList<String> card = new ArrayList<>();
        card.add("Кросовки");
        card.add("Подписка");
        card.add("Худи");

        card.removeIf(item ->!item.equals("Подписка") );
        System.out.println(card);
    }

    public static void cleanCart(String[] card) {
        for (String item : card) {
            if (item.equals("Подписка")){
                U.pl(item);
            }
        }

    }
}

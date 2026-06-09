import java.util.ArrayList;

public class UserManager {
    public  void startApp() {

        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Алексей", 5000));
        userList.add(new User("Мария", 10000));

        System.out.println(userList.get(0).getName() + " имеет баланс: " + userList.get(0).getBalance());
        System.out.println(userList.get(1).getName() + " имеет баланс: " + userList.get(1).getBalance());

        ArrayList<ProductCard> productList = new ArrayList<>();
        productList.add(new ProductCard("Сапоги", 3000, 20));
        productList.add(new ProductCard("Шуба", 23000, 10));


        System.out.println("Товар: " + productList.get(0).getTitle() + " цена со скидкой " + productList.get(0).getFinalPrice());
        System.out.println("Товар: " + productList.get(1).getTitle() + " цена со скидкой " + productList.get(1).getFinalPrice());











    }
}

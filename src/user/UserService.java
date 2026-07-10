package user;

public class UserService {
    public void printInfo (UserCard card) {
        System.out.println("Чтение данных пользователя");
        System.out.println("Имя: " + card.getUserName());
        System.out.println("ID: " + card.getNumber());
    }
}
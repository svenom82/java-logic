package user;

import javax.smartcardio.Card;

public class UserService {
    public void printInfo (UserCard card) {
        System.out.println("Чтение данных пользователя");
        System.out.println("Имя: " + card.getUserName());
        System.out.println("ID: " + card.getNumber());
    }
    public void printInfo (UserCard card, String prefix) {
        System.out.println("[" + prefix + "] " + card.getTags());
    }
}
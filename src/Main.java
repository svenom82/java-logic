import user.Button;
import user.UserCard;
import user.UserService;

public class Main {
    public static void main(String[] args) {
        Button loginButton = new Button("Войти", "blue" , 8);
        UserCard Card = new UserCard("Alex" , 101, true, loginButton);



        System.out.println("Карточка создана для : " + Card.getUserName());
        System.out.println("Кнопка внутри карточки : " + Card.getButton().getLabel());
        System.out.println("Скругление кнопок : " + Card.getButton().getRound());

        UserService userService = new UserService();
        userService.printInfo(Card);


    }
}
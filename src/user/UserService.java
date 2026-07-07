package user;

public class UserService {

    public void printSubscribers(User[] users) {
        for (User currentUser : users) {
            if (currentUser.isHasSubscription()) {
                System.out.println("Пользователь: " + currentUser.getName());

                // Берем массив кнопок текущего юзера и перебираем его
                for (Button currentButton : currentUser.getButtons()) {
                    System.out.println("  - Кнопка: " + currentButton.getText() + " (Цвет: " + currentButton.getColor() + ")");
                }
            }
        }
    }
}
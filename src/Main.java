import user.User;
import user.UserService;

public class Main {

    public static void main(String[] args) {
        User user1 = new User ("Alex", 101, true);
        User user2 = new User ("Max", 102, false);
        User user3 = new User ("John", 103, true);

        User[] users = {user1, user2, user3};

        UserService userService = new UserService();
        userService.printSubscribe(users);
    }



}
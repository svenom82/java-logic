package user;

public class UserService {

    public void printSubscribe (User[] users) {
        for (User currentUser : users) {
            if (currentUser.isHasSubscription()) {
                System.out.println(currentUser.getName() + " has subscription");
            }
        }
    }
}

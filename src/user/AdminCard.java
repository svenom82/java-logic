package user;

public class AdminCard extends UserCard {

    private String role;

    public  AdminCard(String userName, int Number, boolean Status, Button button, String role) {
        super(userName, Number, Status, button);
        this.role = role;

    }
    @Override
    public String getTags() {
        return "[" + this.role + "]" + getUserName() + "#" + getNumber();
    }
}

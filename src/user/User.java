package user;

public class User {

    private String name;
    private int id;
    private boolean hasSubscription;

    private Button[] buttons;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isHasSubscription() {
        return hasSubscription;
    }

    public User(String name, int id, boolean hasSubscription, Button[] buttons) {
        this.name = name;
        this.id = id;
        this.hasSubscription = hasSubscription;
        this.buttons = buttons;
    }
    public Button[] getButtons() {
        return buttons;
    }
}





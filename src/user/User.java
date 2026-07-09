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
    public void setId(int id) {
        if (id > 0){
            this.id = id;
        } else {
            System.out.println("Ошибка: ID пользователя должен быть больше 0!");
        }
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: Имя пользователя не может быть пустым");
        }
    }
}





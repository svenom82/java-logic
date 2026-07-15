package user;
import user.Button;

public  class UserCard {
    private String userName;
    private int Number;
    private boolean Status;
    private Button button;
    private CardStyle style;

    public UserCard(String userName, int Number, boolean Status, Button button) {
        this.userName = userName;
        this.Number = Number;
        this.Status = Status;
        this.button = button;
        this.style = new CardStyle("Red");
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int number) {
        this.Number = number;
    }
    public boolean isStatus() {
        return Status;
    }
    public void setStatus(boolean status) {
        this.Status = status;
    }
    public Button getButton() {
        return button;
    }
    public void setButton(Button button) {
        this.button = button;
    }

    private String generateTags () {
     return getUserName() + "#" + getNumber();
    }
    public  String getTags() {
        return generateTags();
    }

    private class CardStyle {
        private String color;

        CardStyle(String color) {
            this.color = color;
        }
    }


}
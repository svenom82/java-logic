package user;

public class Button {

    private String text;
    private String color;

    public Button (String text, String color) {
        this.text = text;
        this.color = color;
    }
    public String getText() {
        return text;
    }
    public String getColor() {
        return color;
    }
}

package user;

public class Button {
    private String label;
    private String color;
    private int round;

    public Button(String label, String color, int round) {
        this.label = label;
        this.color = color;
        this.round = round;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }
}
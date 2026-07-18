package user;


public abstract class BaseButton {

    private String label;
    private int width;

    public BaseButton(String label, int width) {
        this.label = label;
        this.width = width;
    }
    public String getLabel() {
        return label;
    }
    public int getWidth() {
        return width;
    }

    public abstract void draw();

}

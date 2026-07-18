package user;

    public class SecondaryButton extends BaseButton {
        public SecondaryButton(String label, int width) {
            super(label, width);
        }
        @Override
        public void draw() {
            System.out.println("[ " + getLabel() + " ]");
            System.out.println("Ширина контурной кнопки: " + getWidth() + "px");
        }
    }

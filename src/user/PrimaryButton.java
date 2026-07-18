package user;


    public class PrimaryButton extends BaseButton {
        public PrimaryButton(String label, int width) {
            super(label, width);
        }
        @Override
        public void draw() {
            System.out.println("=== " + getLabel() + " ===");
            System.out.println("Ширина главной кнопки: " + getWidth() + "px");
        }
    }

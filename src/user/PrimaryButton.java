package user;


    public class PrimaryButton extends BaseButton implements Clickable {
        public PrimaryButton(String label, int width) {
            super(label, width);
        }
        @Override
        public void draw() {
            System.out.println("=== " + getLabel() + " ===");
            System.out.println("Ширина главной кнопки: " + getWidth() + "px");
        }

        @Override
        public void onClick() {
            System.out.println("Клик по кнопке: " + getLabel() + " - переход на следующую страницу");
        }
    }

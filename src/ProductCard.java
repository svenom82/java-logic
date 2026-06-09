import java.util.Scanner;

public class ProductCard {
        private String title;
        private int price;
        private int discount;

        public ProductCard (String cardTitle, int cardPrice, int cardDiscount) {
                title = cardTitle;
                price = cardPrice;
                discount = cardDiscount;
        }
        public int getFinalPrice() {
                return price - (price * discount / 100);
        }

        public String getTitle() {
                return title;
        }

        public int getPrice() {
                return price;
        }

        public int getDiscount() {
                return discount;
        }
}

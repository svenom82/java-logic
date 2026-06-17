public class MetodDemo {

    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        System.out.println(" Я изолированный метод");
    }

    public static void sayHelloByName(String name) {
        U.pl("Привет, " + name + " !");
    }

    public static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int finMax(int[] number) {
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    public static int calculatedDiscount(int price, int percent) {
        int discountAmount = (price * percent) / 100;
        int finalPrice = price - discountAmount;
        return finalPrice;
    }

    public static boolean checkAsses (int age) {
        if (age < 18) {
            return true;
        } else {
            return false;
        }
    }

}

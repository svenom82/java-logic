public class Main {
    public static void main(String[] args) {
        MetodDemo.sayHelloByName("Евгений");
        MetodDemo.sayHelloByName("Алексей");

        int sum = MetodDemo.plus(22, 23);
        U.pl("Результат сложения: " + sum);

        int[] myArr = {12, 45, 78, 23, 9};
        int maximum = MetodDemo.finMax(myArr);
        U.pl("Самое большое число " + maximum);


        int phonePrice = MetodDemo.calculatedDiscount(50000, 10);
        U.pl("Цена телефона со скидкой: " + phonePrice);
        int laptopPrice = MetodDemo.calculatedDiscount(120000, 20);
        U.pl("Цена ноутбука со скидкой: " + laptopPrice);

        int userAge = 17;
        if (MetodDemo.checkAsses(userAge)) {
            U.pl("Доступ запрещен, вам нет 18! ");
        } else {
            U.pl("Доступ разрешен.Добро пожаловать!");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        MetodDemo.sayHelloByName("Евгений");
        MetodDemo.sayHelloByName("Алексей");

        int sum = MetodDemo.plus(22, 23);
        U.pl("Результат сложения: " + sum);

        int[] myArr = {12, 45, 78, 23, 9};
        int maximum = MetodDemo.finMax(myArr);
        U.pl("Самое большое число " + maximum);
    }

}
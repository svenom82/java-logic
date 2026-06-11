public class Main {
    public static void main(String[] args) {

        int balance = 450;
        int fee = 100;

        for (int i = 1; i <= 5; i++) {
            balance -= 100;
            if (balance < 100) {
                System.out.println("Деньги кончились, прерываем работу! ");
                break;
            }
            System.out.println("Этаж " + i + " проверен. ");



        }


    }

}
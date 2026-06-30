public class TaskDemo {


    public static void main(String[] args) {

        int number = 2;
       printNumber(number);


    }

    public static void printNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("Отрисовка карточки номер " + i);
        }
    }



}
public class Main {
    public static void main(String[] args) {

       java.util.Scanner input = new java.util.Scanner(System.in);
       U.pl(" Введите базовую стоимость ремонта одной комнаты ");

       int basePrice = input.nextInt();
        U.pl(" Введите количество комнат ");
       int roomCount = input.nextInt();


       for (int i = 1; i <= roomCount; i++) {
           int room = i * basePrice;
           U.pl("Комната " + i + " стоит " + room);
       }


    }

}
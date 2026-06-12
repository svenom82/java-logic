public class Main {
    public static void main(String[] args) {

        int roomCount = 4;
        int basePrice = 5000;
        int total = 0;


        for (int i = 1; i <= roomCount; i++) {
            total += basePrice + (i -1) * 1000;
            U.pl("Комната " + i + " расчитана.");
        }
        U.pl("Итоговая стоимоcть ремонта " + total);
    }

}
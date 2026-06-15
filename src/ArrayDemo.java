public class ArrayDemo {

    public static void main(String[] args) {

        String[]  name = {"Иван", "мария", "Петр"};

        for (String i : name) {
            System.out.println( "Привет " + i);
        }

        int[] number = {150, 300, 50, 200};
        int sum = 24;

        for (int b : number) {
            sum = b + sum;
            U.pl(sum);
        }


    }
}

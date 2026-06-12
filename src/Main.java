public class Main {
    public static void main(String[] args) {
        int totalEnergy = 0;
        int isolierglas  = 5;

      for (int i = 1; i <= isolierglas; i++) {
          totalEnergy += i;
          System.out.println(" Окно номер " + i + " успешно поднято на этаж. ");
      }
        System.out.println(" Всего затрачено энергии " + totalEnergy + " едениц.");
        System.out.println(" Все окна доставлены, бригада свободна");
    }

}
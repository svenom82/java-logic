public class TaskDemo {


    public static void main(String[] args) {
        String[][] menu = {
                {"Профиль", "Настройки"},
                {"Главная", "Каталог"},
                {"Корзина", "Оплата"}
        };
        String target = "Каталог";
        System.out.println(java.util.Arrays.toString(masMenu(menu, target)));

    }

    public static int[] masMenu(String[][] menu, String target) {
        if (menu.length == 0 || menu[0].length == 0) {
            return new int[]{-1, -1};
        }else  {
            for (int i = 0; i < menu.length; i++) {
                for (int j = 0; j < menu[0].length; j++) {
                    if (menu[i][j].equals(target)) {
                        return new int[]{i, j};
                    }
                }
            }
        }return new int[]{-1, -1};
    }





}
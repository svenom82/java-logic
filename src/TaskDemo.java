public class TaskDemo {

    public static void main(String[] args) {
        int[] gaps = {8, -2, 0, 16};

        for (int i = 0; i < gaps.length; i++) {
            U.pl(checkGrid(gaps[i]));
        }


    }

    public static String userNameLogin(String username) {
        String cleaned = username.trim();

        if (cleaned.isBlank()) {
            return "Аноним";
        }
        return  cleaned;
    }

    public static String checkGrid(int num) {
        if (num == 0) {
            return "Отступов нет";
        } else if (num > 0) {
            return "Валидный отступ";
        } else {
            return "Ошибка! Отрицательный отступ";
        }
    }

}

package main;

import user.Button;
import user.User;
import user.UserService;

public class Main {
    public static void main(String[] args) {

        // Создаем кнопки для Алекса
        Button btn1 = new Button("Купить", "green");
        Button btn2 = new Button("Удалить", "red");
        Button[] alexButtons = {btn1, btn2};

        // Создаем кнопку для Джона
        Button btn3 = new Button("Поделиться", "blue");
        Button[] johnButtons = {btn3};

        // У Макса кнопок не будет, создаем ему пустой массив
        Button[] maxButtons = {};

        // Создаем пользователей и передаем им их массивы кнопок
        User user1 = new User("Alex", 101, true, alexButtons);
        User user2 = new User("Max", 102, false, maxButtons);
        User user3 = new User("John", 103, true, johnButtons);

        User[] users = {user1, user2, user3};

        UserService userService = new UserService();
        userService.printSubscribers(users);

        System.out.println("--- Тест инкапсуляции ---");
        user1.setId(-500);
        System.out.println("ID после попытки взлома: " + user1.getId());

        user1.setName("   ");
        System.out.println("Имя после попытки взлома: " + user1.getName());


    }
}
package home_work_1;

// решение с использованием Switch case

import java.util.Scanner;

public class SixthTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");

        String input = sc.nextLine();
        ListNames(input);

    }


    /**
     * Метод принимает введенные данные через консоль
     * в зависимости от введенных данных возвращает заданные значения
     * использовано ветвление типа switch case
     * @param input
     * @return
     */

    public static String ListNames(String input) {
        String names = input;
        switch (input) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
        return names;
    }
}

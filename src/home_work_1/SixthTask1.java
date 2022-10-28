package home_work_1;

// Решение с использованием if  else if

import java.util.Scanner;

public class SixthTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        if (sc.hasNextLine()){
            String input = sc.nextLine();
            Name(input);
        }
    }

    /**
     * Метод принимает введенные данные через консоль
     * в зависимости от введенных данных возвращает заданные значения
     * использовано ветвление типа if else if
     * @param input
     * @return
     */



    public static String Name(String input) {
        String names = input;
        if(input.equals("Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (input.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.println("Добрый день, а вы кто?");
        }
        return names;
    }
}

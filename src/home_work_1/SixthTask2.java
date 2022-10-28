package home_work_1;

//решение с использованием if else

import java.util.Scanner;


public class SixthTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            Friends(input);
        }


    }


    /**
     * Метод принимает введенные данные через консоль
     * в зависимости от введенных данных возвращает заданные значения
     * использовано ветвление типа if else
     * @param input
     * @return
     */

    public static String Friends(String input){
        String names = input;
        if(names.equals("Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if(names.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }else{
            System.out.println("Добрый день, а вы кто?");
        }
        return names;
    }

}

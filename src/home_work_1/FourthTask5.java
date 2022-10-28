package home_work_1;

import java.util.Scanner;

public class FourthTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Угадаем, что вы ввели?");
        System.out.println("Введите букву/цифру/символ: ");

        if(!scan.hasNextInt()){
            System.out.println("Вы ввели букву или другой символ");
        }else if (scan.hasNextInt()){
            System.out.println("Вы ввели цифру");
        }


    }
}

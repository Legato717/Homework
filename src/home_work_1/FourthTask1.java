package home_work_1;

import java.util.Scanner;

public class FourthTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");

        int a = scan.nextInt();
        int b = 2;
        if( a % b == 0){
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }
}

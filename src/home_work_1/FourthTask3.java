package home_work_1;

import java.util.Scanner;

public class FourthTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое: ");
        int a = scan.nextInt();

        System.out.println("Введите делитель: ");
        int b = scan.nextInt();

        if(a % b == 0){
            System.out.println(a + " делится без остатка на " + b);
        }else{
            System.out.println(a + " не делится без остатка на " + b);
        }
    }
}

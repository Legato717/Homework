package home_work_1;

import java.util.Scanner;

public class FourthTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год в формате xxxx : ");
        int a = scan.nextInt();

        if(a % 4 == 0){
            System.out.println(a + " - это високосный год");
        }else {
            System.out.println(a + " - это не високосный год");
        }

    }
}
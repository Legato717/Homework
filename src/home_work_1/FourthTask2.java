package home_work_1;

import java.util.Scanner;

public class FourthTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();

        System.out.println("Введите второе число: ");
        int b = scan.nextInt();

        System.out.println("Введите третье число: ");
        int c = scan.nextInt();

        if(a < b & b < c ){
            System.out.println("Среднее число: " + b);
        }
        else if(c < b & b < a) {
            System.out.println("Среднее число: " + b);
        }
        else if(c < a & a < b) {
            System.out.println("Среднее число: " + a);
        }
        else if(b < a & a < c) {
            System.out.println("Среднее число: " + a);
        }
        else if(a < c & c < b) {
            System.out.println("Среднее число: " + c);
        }
        else if (b < c & c < a){
            System.out.println("Среднее число: " + c);
        }


    }
}

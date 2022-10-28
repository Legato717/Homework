package home_work_1;

import java.util.Scanner;

public class FourthTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1, чтобы перевести байты в килобайты или 2, чтобы перевести килобайты в байты");

        int a = scan.nextInt();
        if(a == 1){
            System.out.println("Введите количество байт: ");
            int b = scan.nextInt();
            int res1 = b / 1024;
            System.out.println(b + " байт = " + res1 + " килобайт");
        } else if (a == 2) {
            System.out.println("введите количество килобайт: ");
            int c = scan.nextInt();
            int res2 = c * 1024;
            System.out.println(c + " килобайт = " + res2 +" байт");

        }
    }
}

package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 25");
        if (scan.hasNextLong()) {
            long num = scan.nextLong();
            if (num < 26){
                if (num > -1) {
                    long res = 1;
                    if(num == 0){
                        System.out.println(num + " = " + 1);
                    }
                    for (int i = 1; i <= num; i++) {
                        res = res * i;
                        if (i < num) {
                            System.out.print(i + " * ");
                        } else {
                            System.out.print(i + " = " + res);
                        }
                    }
                } else {
                    System.out.println("Введенное число меньше разрешенного диапазона");
                }
            }else{
                System.out.println("Введенное число больше разрешенного диапазона");
            }
        } else {
            System.out.println("Некорректные данные.");
        }
    }
}
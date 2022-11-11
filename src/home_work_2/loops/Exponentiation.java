package loops;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число, которое хотите возвести в степень");

        double number = scan.nextDouble();
        System.out.println("Введите степень. Степень должна быть целым положительнвм числом");
        if(scan.hasNextInt()) {
            int exp = scan.nextInt();
            double res = number;
            if(exp >0) {
                if (number > 0) {
                    for (int i = 1; i < exp; i++) {
                        res = res  * exp;
                    }
                    System.out.println(number + " ^ " + exp + " = " + res);
                }
            }else{
                System.out.println("Вы ввели отрицательную или дробную степень");
            }
        }else {
            System.out.println("Введено не число или не целое число");
        }
    }
}

package home_work_1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Первое введенное число = 8562, вид в двоичной системе счисления = 10000101110010
        System.out.println("Введите первое число");
        int num1 = console.nextInt();

        //Второе введенное число = 9876, вид в двоичной системе счисления = 10011010010100
        System.out.println("Введите второе число");
        int num2 = console.nextInt();

        int res1 = num1 & num2;
        int res2 = num1 | num2;

        //Побитовое И введенных чисел = 10000000010000
        // Побитовое ИЛИ введенных чисел = 10011111110110
        System.out.println("Побитовое И введенных Вами двух чисел = " + Integer.toBinaryString(res1));
        System.out.println("Побитовое ИЛИ введенных вами чисел = " + Integer.toBinaryString(res2));


        // При попытке совершить побитовые оперцации И / ИЛИ с числом 42.5 возникает ошибка, т.к. число является дробным
        // Для решения проблемы воспользовался приведением типа переменной
        int a = (int)42.5;
        int b = 27;
        int c = a & b;
        int d = a | b;

        System.out.println("Число 42.5 в двоичной системе счисления = " + Integer.toBinaryString(a));
        System.out.println("Число 27 в двоичной системе счисления = " + Integer.toBinaryString(b));
        System.out.println("Побитовое И чисел 42.5 и 27 = " + Integer.toBinaryString(c));
        System.out.println("Побитовое ИЛИ чисел 42.5 и 27 = " + Integer.toBinaryString(d));
    }

}


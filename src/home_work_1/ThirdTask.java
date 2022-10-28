package home_work_1;


//В данном разделе я рассмотрел принцип работы метода Math.random()
//На примере создания симулятора броска игрального кубика

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean isTrue = true;
        int start = 1 + (int) ( Math.random() * 6 );
        // т.к. метод изначально работает с типом double и с интервалом (0;1), а в игральных костях только целые числа
        // необходимо использовать приведение типов и задать необходимые границы случайных чисел

        while (isTrue) {
            System.out.println("Приветствую! Нажмите 1 для броска кубика");
            n = scan.nextInt();
            if ( n == 1){
                isTrue = false;
                System.out.println("Выпало число : " + start);
            }
        }

    }



}


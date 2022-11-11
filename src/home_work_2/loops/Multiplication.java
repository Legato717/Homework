package loops;

import java. util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целые числа. Вводить 0 недопустимо.");
        if(scan.hasNextInt()) {
            String num = scan.nextLine();
            if(!num.contains("0")) {
                int res = 1;
                String strArray[] = num.split(" ");
                int numArr[] = new int[strArray.length];
                for (int i = 0; i < strArray.length; i++) {
                    numArr[i] = Integer.parseInt(strArray[i]);
                    if (i < strArray.length -1) {
                        System.out.print(numArr[i] + " * ");
                    } else {
                        System.out.print(numArr[i]);
                    }
                    res = res * numArr[i];
                }
                System.out.println(" = " + res);
            }else{
                System.out.println("Вы ввели 0.");
            }
        }else{
            System.out.println("Введено не целое число");
        }
    }
}
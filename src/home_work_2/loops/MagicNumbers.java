package loops;

import java.util.Scanner;
public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое натуральное число, чтобы узнать максимальную цифру в нем");
        if (scan.hasNextLong()) {
            String num = scan.nextLine();
            int numMax;
            numMax = maxValue(String.valueOf(num));
            System.out.println("Максимальная цифра = " + numMax);
        } else {
            System.out.println("Вы ввели не число");
            return;
        }
        System.out.println("//////////");
        int totalRes = 0;
        System.out.println("Из 100 чисел четных было = " + varNum(totalRes));
        System.out.println("Распределение четных и нечетных чисел происходит примерно поровну ");
        System.out.println("/////////");
        System.out.println("Введите целое натуральное число, чтобы узнать сколько четных и нечетных цифр в числе");
        if(scan.hasNextInt()) {
            String number1 = scan.nextLine();
            System.out.println("В числе " + number1 + " четных цифр = " + oddOrEvenNumber(number1, "odd"));
            System.out.println("В числе " + number1 + " нечетных цифр = " + oddOrEvenNumber(number1, "even"));
        }else{
            System.out.println("Вы ввели не число");
            return;
        }
        System.out.println("Введите длину для ряда Фибоначчи");
        if(scan.hasNextInt()) {
            int numberF = scan.nextInt();
            System.out.println(fiboLine(numberF));
        }else{
            System.out.println("Вы ввели не число");
        }
        System.out.println("Ряд чисел с шагом. Введите начало диапазона");
        if(scan.hasNextInt()) {
            int startPoint = scan.nextInt();
            System.out.println("Введите конец диапазона");
            if(scan.hasNextInt()) {
                int finishPoint = scan.nextInt();
                System.out.println("Введите шаг");
                if(scan.hasNextInt()) {
                    int stepPoint = scan.nextInt();
                    stepToStep(startPoint, finishPoint, stepPoint);
                }else{
                    System.out.println("Вы ввели не число");
                }
            }else{
                System.out.println("Вы ввели не число");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
        System.out.println("\nВведите число, чтобы узнать его перевернутый вид");
        if(scan.hasNextInt()) {
            int revNum = scan.nextInt();
            System.out.println("Ваше число " + revNum + " Перевернутый вид = " + backNum(revNum));
        }else{
            System.out.println("Вы ввели не число");
        }
    }
    /**
     * метод MaxValue обрабатывает цифры из числа, введенного пользователем.
     * Находит максимальную цифру с помощью типа char и преобразует в тип int
     * возвращает int max - значение.
     *
     * @param number принимает строку
     * @return возвращает максимальное число из заданного в итновом типе.
     */
    public static Integer maxValue(String number) {
        int max = 0;
        for (int i = 0; i < number.length(); i++) {
            if (max < Character.getNumericValue(number.charAt(i))) {
                max = Character.getNumericValue(number.charAt(i));
            }
        }
        return max;
    }

    /**
     * метод VarNum принимает набор случайных чисел и выводит количество четных из них.
     *
     * @param num1 принимает значение случайных чисел.
     * @return возвращает количество четных чисел.
     */

    public static Integer varNum(int num1) {
        int totalRes = 0;
        int result = 0;
        int a = 100;
        for (int i = 0; i < a; i++) {
            int num = (int) (Math.random() * 100);
            if (num % 2 == 0) {
                totalRes = totalRes + 1;
            }
        }
        return totalRes;
    }
    /**
     * OddOrEvenNumber принимает число введенное пользователем.
     * проверяем каждый символ на четность нечетность, заносим результат в результат.
     * в зависимости от четного или нечетного вызываем вывод метода с флагом odd или even
     *
     * @param answer принимает число
     * @param type   принимает тип odd или even
     * @return результат сложения иттрераций с четными и нечетными числами
     */
    public static Integer oddOrEvenNumber(String answer, String type) {
        int result = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (type == "odd") {
                if (Character.getNumericValue(answer.charAt(i)) % 2 == 0 || Character.getNumericValue(answer.charAt(i)) == 0) {
                    result = result + 1;
                }
            }
            if (type == "even") {
                if (Character.getNumericValue(answer.charAt(i)) % 2 != 0) {
                    result = result + 1;
                }
            }
        }
        return result;
    }
    /**
     * метод fiboLine принимает число, и выводит на его основании количество чисел из ряда Фибоначчи.
     *
     * @param numF принимает число, заданное пользователем
     * @return
     */
    public static int fiboLine(int numF) {
        String end = "end";
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= numF; i++) {
            c = a + b;
            a = b;
            b = c;
            if(i < numF) {
                System.out.print(c + " ");
            }
        }
        return c;
    }
    /**
     * метод stepToStep принимает три значения: начальную точку, конечную точку, и шаг.
     * выдает шаги от старта до финиша.
     * @param start
     * @param finish
     * @param step
     * @return
     */
    public static Integer stepToStep(int start, int finish, int step){
        while(start < finish){

            if(start+step < finish) {
                start = start + step;
                System.out.print(start + " ");
            }else {
                System.out.println(finish);
                start = finish;
            }
        }
        return start;
    }
    /**
     * метод принимает Интовое число, в цикле его переворачивает с помощью другой переменной, в которую  и возвращает числа в обратном порядке в перевернутом виде.
     * @param reverseNum принимает число из консоли
     * @return возвращает перевернутое число
     */
    public static Integer backNum(int reverseNum){
        int reverseNumber = 0;
        while(reverseNum != 0){
            reverseNumber = reverseNumber * 10 + reverseNum% 10;
            reverseNum =reverseNum / 10;
        }
        return reverseNumber;
    }
}

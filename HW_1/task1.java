//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW_1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = iScanner.nextInt();
        int fact = 1;
        int sum = 0;
        iScanner.close();

        for (int index = 1; index <= number; index++) {
            sum +=index;
            fact*=index;
        }
        System.out.printf("Треугольное число равно " + sum + "\n"); 
        System.out.printf("Факториал числа равен " + fact);
    }
}
//3) Реализовать простой калькулятор

package HW_1;   

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int num1 = iScanner.nextInt();

        System.out.print("Введите нужную операцию ");
        char operation = iScanner.next().charAt(0);

        System.out.print("Введите второе число ");
        int num2 = iScanner.nextInt();

        
        int res = 0;
        switch(operation){
            case '+':
                res = num1 + num2;
                System.out.printf("Результат: %d",res);
                break;
            case '-':
                res = num1 - num2;
                System.out.printf("Результат: %d", res);
                break;
            case '/':       
                res = num1 / num2;
                System.out.printf("Результат: %d", res);
                break;
            case '*':
                res = num1 * num2;
                System.out.printf("Результат: %d", res);
                break;
            default:
                System.out.println("Вы ввели что-то неправильно!");
                break;
        }
      iScanner.close();
    }
}

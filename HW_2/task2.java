//3) Реализовать простой калькулятор

package HW_2;   

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task2 {

    public static void main(String[] args) {
        Logger logger= Logger.getLogger("My logger");
        logger.setLevel(Level.INFO);
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
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
                logger.log(Level.INFO, "Сложение");
                break;
            case '-':
                res = num1 - num2;
                System.out.printf("Результат: %d", res);
                logger.log(Level.INFO, "Вычитание");
                break;
            case '/':       
                res = num1 / num2;
                System.out.printf("Результат: %d", res);
                logger.log(Level.INFO, "Деление");
                break;
            case '*':
                res = num1 * num2;
                System.out.printf("Результат: %d", res);
                logger.log(Level.INFO, "Умножение");
                break;
            default:
                System.out.println("Вы ввели что-то неправильно!");
                logger.log(Level.INFO, "Неверный ввод");
                break;
        }
      iScanner.close();
    }
}


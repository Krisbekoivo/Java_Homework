// Пусть дан произвольный список целых чисел. Найти среднее значение.
package HW_3;

import java.util.ArrayList;
import java.util.Random;

public class task1_4 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            array.add(x);
        }

        System.out.println(array);
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            int numb = array.get(i);
            sum += numb;
            }
            float srednee = sum / array.size();
        
        System.out.println("Среднее значение равно: " + srednee);
    }
}

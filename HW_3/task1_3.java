// Пусть дан произвольный список целых чисел. Найти максимальное значение.
package HW_3;

import java.util.ArrayList;
import java.util.Random;

public class task1_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            array.add(x);
        }

        System.out.println(array);
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            int numb = array.get(i);
            if (numb > max) {
                max = numb;
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}

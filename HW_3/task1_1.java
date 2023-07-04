// Пусть дан произвольный список целых чисел. Нужно удалить из него чётные числа.
package HW_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task1_1 { 
    public static void main(String[] args) {
         ArrayList<Integer> array = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < 10; i++) {
                int x = ran.nextInt(10);
                array.add(x);
}
System.out.println(array);

for (int i = array.size() - 1; i >= 0; i--) {
                int numb = array.get(i) % 2;
                if (numb == 0) {
                    array.remove(i);
                }
            }
            Collections.sort(array);
            System.out.println(array);
        }
    }
    


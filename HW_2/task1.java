// 1) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HW_2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class task1 {
        private static final Logger logger =Logger.getLogger(task1.class.getName());
    

    public static void main(String[] args) {
        int[] array ={64, 34, 25, 12, 22, 11, 90};
        logger.setLevel(Level.INFO);
        logger.info("Исходный массив: " + Arrays.toString(array));
        bubbleSort(array);
        logger.info("Отсортированыый массив: " + Arrays.toString(array));
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            logger.info("Промежуточный результат на " + (i + 1) + "-й итерации:" + Arrays.toString(array));
        }
    }
}


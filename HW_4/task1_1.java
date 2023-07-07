package HW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1_1 {
    public static void main(String[] args) {
        Deque<Integer> numb1 = new ArrayDeque<>(Arrays.asList(3, 2, 1));
        Deque<Integer> numb2 = new ArrayDeque<>(Arrays.asList(6, 5, 4));
        task1_1 task = new task1_1();
        Deque<Integer> result = task.sum(numb1,numb2);
        System.out.println(result);
    }
    public Deque<Integer> sum(Deque<Integer> numb1, Deque<Integer> numb2) {
        Deque<Integer> result = new ArrayDeque<>();
        int numb3 = 0;
         while (!numb1.isEmpty() || !numb2.isEmpty()) { 
            int sum = numb3;
            if (!numb1.isEmpty()) {
                sum += numb1.removeFirst();
            }
            if (!numb2.isEmpty()) {
                sum += numb2.removeFirst();
            }
            result.addLast(sum % 10);
            numb3 = sum / 10; 
        }
        if (numb3 != 0) {
            result.addLast(numb3);
        }
        return result;

    }
}

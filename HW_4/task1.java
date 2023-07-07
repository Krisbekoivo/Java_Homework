// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.
package HW_4;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task1 {
    
    static int makeInt(Deque<String> arr) {
        int result = 0;
        String inS;
        int krat = 1;

        while(arr.size() != 0) {
            inS = arr.pollFirst();
            if (!inS.equals("-")) {
                result = result + krat * (Integer.parseInt(inS));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Pack(int in) {
        Deque<String> q = new LinkedList<>();
        int temp = 0;
        boolean negative = false;
        if (in < 0) {
            in *= -1;
            negative = true; 
        }
        while (in > 0) {
            temp = in % 10;
            in = (in - temp) / 10;
            q.addFirst(Integer.toString(temp));
        }
        if (negative) {
            q.addFirst("-");
        }
        return q;
    }
    public static void main(String[] args) {

        Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2","1"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("5","4","-"));
        Deque<String> list_3 = new LinkedList<>(Arrays.asList("5","2"));
        Deque<String> list_4 = new LinkedList<>(Arrays.asList("6","4","1"));
        int numb1 = makeInt(list_1);
        int numb2 = makeInt(list_2);
        int multiplication = numb1 * numb2;
        numb1 = makeInt(list_3);
        numb2 = makeInt(list_4);
        int sum = numb1 + numb2;
        System.out.println(Pack(multiplication));
        System.out.println(Pack(sum));        
    }   
}

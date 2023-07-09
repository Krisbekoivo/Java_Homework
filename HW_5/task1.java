// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
public class task1 {

    static void sortedPrint(Map<String, ArrayList> map) {
        Set<String> keySet = map.keySet();
        int maxCount = 0;
        int minCount = 1_000_000;
        
        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();
            
        }
        
        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }  
            }
            num += 1;
        }
        
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        Map<String, ArrayList> phonebook = new HashMap<>() {
            {
                put("Ivanov", new ArrayList<Integer>() {
                    {
                        add(12345);
                        add(67853408);
                        add(89640);
                    }
                });
                put("Petrov", new ArrayList<Integer>() {
                    {
                        add(1098755);
                    }
                });
                put("Sidorov", new ArrayList<Integer>() {
                    {
                        add(78789076);
                        add(89053421);

                    }
                });
                
            }
        };
         
        System.out.println("Телефонная книга: ");
        sortedPrint(phonebook);
    }
}


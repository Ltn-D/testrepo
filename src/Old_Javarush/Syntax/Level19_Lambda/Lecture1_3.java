package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lecture1_3 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        // Collections.sort(numbers,((o1, o2) -> o1 - o2)); преобразовали весь следующий код в методе в лямбде выражение
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        };
        Collections.sort(numbers, comparator);
    }
}

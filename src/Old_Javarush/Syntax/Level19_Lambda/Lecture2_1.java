package Old_Javarush.Syntax.Level19_Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture2_1 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Collections.sort(numbers, (o1,o2)->o2-o1);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach((i) -> System.out.println(i));
    }
}

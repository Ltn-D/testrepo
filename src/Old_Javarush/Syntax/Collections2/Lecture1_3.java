package Old_Javarush.Syntax.Collections2;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Lecture1_3 {
    static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах".split(" ")));
        print(words);
    }

    static void print(HashSet<String> words) {
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}

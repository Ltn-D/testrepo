package Old_Javarush.Syntax.Collections2;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture3_3 {
    public static Integer min(ArrayList<Integer> list) {

        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {

        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {

        return Collections.frequency(list,element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        list.sort(Integer::compareTo);
        return Collections.binarySearch(list,key);
    }
}

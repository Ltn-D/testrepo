package Old_Javarush.Core.Level5_overload;

import java.util.HashMap;
import java.util.Map;

public class Lecture7_1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    public static void main(String[] args) {
        labels.put(5.1, "one");
        labels.put(5.2, "two");
        labels.put(5.3, "tree");
        labels.put(5.4, "four");
        labels.put(5.5, "five");
        System.out.println(labels);
    }
}

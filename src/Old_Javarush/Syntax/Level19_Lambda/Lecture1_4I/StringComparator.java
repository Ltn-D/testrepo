package Old_Javarush.Syntax.Level19_Lambda.Lecture1_4I;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

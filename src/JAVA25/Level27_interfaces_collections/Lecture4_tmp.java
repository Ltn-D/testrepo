package JAVA25.Level27_interfaces_collections;



import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Lecture4_tmp {
    static void main(String[] args) {
        NavigableSet<Integer> tmp = new TreeSet<>(List.of(1, 6, 5, 8, 7, 1, 2, 9, 3, 4));
        System.out.println(tmp);
        NavigableSet<Integer> tmp1 = new TreeSet<>(tmp.subSet(6, false, 8, true));
        System.out.println(tmp1);
        tmp1.remove(7);
        System.out.println(tmp1);
        System.out.println(tmp);

    }

}

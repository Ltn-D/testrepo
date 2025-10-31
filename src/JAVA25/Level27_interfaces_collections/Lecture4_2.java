package JAVA25.Level27_interfaces_collections;

import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Lecture4_2 {
    static void main(String[] args) {
        NavigableSet<Integer> products = new TreeSet<>(List.of(10, 20, 30, 40, 50));
        NavigableSet<Integer> tmpProducts = products.subSet(20, true, 50, false);
        tmpProducts.remove(30);
        System.out.println(tmpProducts);
        System.out.println(products);
        System.out.println(Integer.class.getSuperclass());
    }

}

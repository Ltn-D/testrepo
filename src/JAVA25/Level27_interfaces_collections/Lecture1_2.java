package JAVA25.Level27_interfaces_collections;

import java.util.*;

public class Lecture1_2 {
    static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        Set<Integer> uniqueItems = new HashSet<>();
        items.addAll(Arrays.asList(3, 7, 3, 9));
        uniqueItems.addAll(Arrays.asList(3, 7, 3, 9));
        System.out.println(items.size());
        System.out.println(uniqueItems.size());
    }
}

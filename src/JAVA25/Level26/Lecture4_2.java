package JAVA25.Level26;

import java.util.*;

public class Lecture4_2 {
    static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("яблоко", "груша", "яблоко", "слива", "груша"));
        Set<String> unicalFruits = new HashSet<>(fruits);
        System.out.println(unicalFruits);
    }
}

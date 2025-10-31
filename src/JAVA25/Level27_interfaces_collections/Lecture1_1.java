package JAVA25.Level27_interfaces_collections;

import java.util.LinkedList;
import java.util.List;

public class Lecture1_1 {
    static void main(String[] args) {
        List<String> colors = new LinkedList<>();
        colors.add("красный");
        colors.add("зелёный");
        colors.add("синий");
        System.out.println(colors.get(1));

    }
}

package JAVA25.Level27_interfaces_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Lecture3_1 {
    static void main(String[] args) {
        Queue<Integer> tasks = new LinkedList<>();
        tasks.add(5);
        tasks.add(15);
        tasks.add(25);
        System.out.println(tasks.peek());
        System.out.println(tasks.size());
    }
}

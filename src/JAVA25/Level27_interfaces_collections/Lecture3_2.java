package JAVA25.Level27_interfaces_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Lecture3_2 {
    static void main() {
        Queue<String> animals = new ArrayDeque<>();
        animals.add("Кот");
        animals.add("Пес");
        animals.add("Мышь");
        System.out.println("Очередь");
        for (String animal : animals) {
            System.out.println(animal);
        }
        Deque<String> animalsStack = (Deque) animals;
        System.out.println(animalsStack);

        while (!animalsStack.isEmpty()) {
            System.out.println(animalsStack.pop());
        }
        Deque<Character> simbols = new ArrayDeque<>();
        simbols.add('X');
        simbols.add('Y');
        simbols.add('Z');
        System.out.println(simbols);
        while (!simbols.isEmpty()) {
            System.out.println(simbols.pop());
        }
    }
}

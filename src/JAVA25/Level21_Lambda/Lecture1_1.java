package JAVA25.Level21_Lambda;

public class Lecture1_1 {
    static void main(String[] args) {
        Runnable s = () -> System.out.println("Лямбда без параметров!");
        s.run();
    }

}

package JAVA25.Level18_Polymorfizm;

public class Lecture2_3 {
    public static void main(String[] args) {
        // Создаем объект робота-приветствия
        Greetings robot = new Greetings();

        // Приветствие по имени
        robot.sayHello("Алекс");

        // Полное приветствие по имени и фамилии
        robot.sayHello("Джон", "Доу");
    }

    static class Greetings {
        void sayHello(String name) {
            System.out.println("Hello " + name);
        }

        void sayHello(String name1, String name2) {
            System.out.println("Hello " + name1 + " " + name2);
        }
    }
}

package JAVA25.Level20_interfaces;

public class Lecture1_1 {
    static void main(String[] args) {
        Greetable someone = new Person();
        someone.greet();
    }

    interface Greetable {
        void greet();
    }

    static class Person  implements Greetable{
        @Override
        public void greet() {
            System.out.println("Hello!");
        }
    }
}

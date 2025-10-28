package JAVA25.Level21_Lambda;

public class Lecture3_2 {
    static interface Animal {
        void voice();

        default void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

        static class Dog implements Animal {
            @Override
            public void voice() {
                System.out.println("Woof");
            }

            @Override
            public void sleep() {
                System.out.println("Dog is sleeping");
            }
        }

    static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
        dog.sleep();
    }
}


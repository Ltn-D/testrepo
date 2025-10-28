package JAVA25.Level21_Lambda;

public class Lecture3_1 {
    static interface Counter {
        void increment();
        default void reset() {
            System.out.println("Counter reset");
        }
    }

    static class MyCounter implements Counter {
        @Override
        public void increment() {
            System.out.println("Counter incremented");
        }
    }

    static void main(String[] args) {
        MyCounter device = new MyCounter();
        device.increment();
        device.reset();
    }
}

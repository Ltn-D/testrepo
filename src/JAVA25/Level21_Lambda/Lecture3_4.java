package JAVA25.Level21_Lambda;

public class Lecture3_4 {
    static interface A {
        default void show() {
            System.out.println("A");
        }
    }

    static interface B {
        default void show() {
            System.out.println("B");
        }
    }

    static class C implements A, B {
        @Override
        public void show() {
            A.super.show();
            B.super.show();
        }
    }

    static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

package JAVA25.Level11_Exceptions;

public class Lecture3_1 {
    static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Робот завершил свою работу. Выполнение завершено.");

        }
    }
}

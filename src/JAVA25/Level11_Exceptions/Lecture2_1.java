package JAVA25.Level11_Exceptions;

public class Lecture2_1 {
    static void main(String[] args) {
        int totalDistance = 100;
        int stepPerUnit = 0;
        try {
            System.out.println(totalDistance / stepPerUnit);
            System.out.println("XXX");
        } catch (ArithmeticException e) {
            System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");
        }
    }
}

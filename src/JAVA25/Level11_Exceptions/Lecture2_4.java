package JAVA25.Level11_Exceptions;

public class Lecture2_4 {
    static void main(String[] args) {
        int primaryValue = 10;
        int secondaryValue = 0;
        try {
            System.out.println(primaryValue / secondaryValue);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления. Продолжаем работу системы.");
        }
        System.out.println("Миссия завершена. Программа завершена.");
    }
}

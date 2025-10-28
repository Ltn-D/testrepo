package JAVA25.Level11_Exceptions;

public class Lecture3_2 {
    public static void displayPositiveScore(int currentScore) {
        if (currentScore < 0) {
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }
        System.out.println(currentScore);
    }
    static void main(String[] args) {
        try {
            displayPositiveScore(25);
        } catch (IllegalArgumentException  e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

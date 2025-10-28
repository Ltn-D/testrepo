package JAVA25.Level24_Exception;

public class Lecture2_1 {
    static class ScoreTooLowException extends Exception {
        public ScoreTooLowException(String message) {
            super(message);
        }
    }

    static void main(String[] args) {
        try {
            // Пробуем слишком маленький счёт — ожидаем исключение
            checkPlayerScore(5);
            System.out.println("Этот текст не будет выведен");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage()); // Выведет: "Счёт игрока слишком низкий!"
        }

        try {
            // Пробуем корректный счёт — исключений быть не должно
            checkPlayerScore(12);
            System.out.println("Счёт 12 принят");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkPlayerScore(int score) throws ScoreTooLowException {
        if (score < 10) {
            throw new ScoreTooLowException("Счёт игрока слишком низкий!");
        }
    }

}

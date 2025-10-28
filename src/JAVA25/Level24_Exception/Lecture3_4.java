package JAVA25.Level24_Exception;

public class Lecture3_4 {
    static class FirstSystemFailure extends Exception {
        public FirstSystemFailure(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class SecondSystemFailure extends Exception {
        public SecondSystemFailure(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class ThirdSystemFailure extends Exception {
        public ThirdSystemFailure(String message, Throwable cause) {
            super(message, cause);
        }
    }
    public static void initiateSystemFailure() throws FirstSystemFailure  {
        throw  new FirstSystemFailure("Проблема в ядре системы", null);
    }

    // Вызывает initiateSystemFailure и, при сбое, оборачивает его во второй уровень
    public static void triggerNavigationMalfunction() throws SecondSystemFailure  {
        try {
            initiateSystemFailure();
        } catch (FirstSystemFailure e) {
            throw new SecondSystemFailure("Навигационная система отказала", e);
        }
    }

    // Вызывает triggerNavigationMalfunction и, при сбое, оборачивает его в третий уровень
    public static void provokeLifeSupportCrisis() throws ThirdSystemFailure  {
        try {
            triggerNavigationMalfunction();
        } catch (SecondSystemFailure e) {
            throw new ThirdSystemFailure("Критический отказ системы жизнеобеспечения", e);
        }

    }

    public static void main(String[] args) {
        try {
            // Запускаем цепочку сбоев
            provokeLifeSupportCrisis();
        } catch (ThirdSystemFailure  e) {
            // Печатаем полный стек-трейс с цепочкой причин (chained exceptions)
            e.printStackTrace();
        }
    }
}

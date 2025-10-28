package JAVA25.Level24_Exception;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Создаем "первопричину" — уже существующее исключение
        Throwable rootCause = new NullPointerException("данные отсутствуют!");

        // Создаем наше исключение и "прикрепляем" к нему первопричину
        DataProcessingFailure failure = new DataProcessingFailure("Ошибка генерации отчёта", rootCause);



        // Выводим на экран первопричину через getCause()
        // Ожидаем увидеть NullPointerException с тем же сообщением
        System.out.println(failure.getCause());
    }

    static class DataProcessingFailure extends Exception {
        public DataProcessingFailure(String message) {
            super(message);
        }

        public DataProcessingFailure(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

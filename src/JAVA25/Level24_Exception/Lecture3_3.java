package JAVA25.Level24_Exception;

public class Lecture3_3 {
    static class InputValidationException extends Exception {

        public InputValidationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {

        IllegalArgumentException argumentException = new IllegalArgumentException("Передан некорректный формат данных");
        try {
            throw new InputValidationException("Внешняя ошибка обработки ввода", argumentException);

            // Симулируем "внешнюю ошибку" с конкретной причиной (цепочка исключений)


        } catch (InputValidationException e) {
            // 1) сообщение внешнего исключения
            System.out.println(e.getMessage());

            // 2) сообщение исключения-источника (корня)
            System.out.println(e.getCause().getMessage());

            // 3) имя класса исключения-источника
            System.out.println(e.getCause().getClass().getName());
        }
    }
}

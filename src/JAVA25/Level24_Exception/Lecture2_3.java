package JAVA25.Level24_Exception;

public class Lecture2_3 {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }

        public InvalidAgeException() {
        }
    }
    public static void main(String[] args) {
        int userAge = 14;
        int requiredAge = 16;

        try {
            // Пытаемся пройти возрастной контроль
            checkRideAge(userAge, requiredAge);
            System.out.println("Добро пожаловать на аттракцион!");
        } catch (InvalidAgeException e) {
            // Показываем осмысленное сообщение из нашего исключения
            System.out.println("Отказ: " + e.getMessage());
        }
    }

    // Метод, который проверяет возраст и может "выбросить" наше исключение
    static void checkRideAge(int age, int minAge) throws InvalidAgeException {
        if (age < minAge) {
            // Демонстрация выбрасывания исключения с осмысленным сообщением
            throw new InvalidAgeException(
                    "Вам должно быть не менее " + minAge + " лет для этого аттракциона (сейчас " + age + ")."
            );
        }
    }
}

package JAVA25.Level25_Git;

public class Lecture5_2 {
    static class SecurityBreachException extends Exception {
        public SecurityBreachException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class AuthenticationFailedException extends SecurityBreachException {
        public AuthenticationFailedException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class UserAccessService {
        public void authenticateUser(String name, String password) throws AuthenticationFailedException {
            if (!name.equalsIgnoreCase("User1") || !password.equals("P@ssw0rd")) {
                throw new AuthenticationFailedException("Неправильное имя пользователя или пароль", null);
            }
        }
    }
    public static void main(String[] args) {
        UserAccessService service = new UserAccessService();

        try {
            // Имитация неудачной попытки входа: неверный пароль
            service.authenticateUser("user 1", "P@ssw0rd");

            // Если исключения не было — доступ разрешен
            System.out.println("Доступ разрешён.");
        } catch (SecurityBreachException e) {
            // Перехватываем по базовому типу — демонстрация полиморфизма
            System.out.println("Произошёл сбой безопасности: " + e.getMessage());
        }
    }

}

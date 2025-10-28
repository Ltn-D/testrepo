package JAVA25.Level24_Exception;

public class Lecture2_2 {
    static class PasswordGuard {
        public void enforcePasswordStrength(String pass) throws WeakPasswordException {
            if (pass.length() < 6) {
                throw new WeakPasswordException("Пароль слишком короткий!");
            }
        }
    }
    static class WeakPasswordException extends Exception {
        // Конструктор, принимающий сообщение и передающий его в суперкласс
        public WeakPasswordException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        PasswordGuard passwordGuard = new PasswordGuard();
        try {
            // Симулируем установку слишком короткого пароля
            passwordGuard.enforcePasswordStrength("qwer");
        } catch (WeakPasswordException e) {
            // Перехватываем и выводим сообщение из исключения
            System.out.println(e.getMessage());
        }
    }
}

// Собственное проверяемое исключение, наследуется от Exception



package JAVA25.Level16_Inner_Nested;

public class Lecture4_2 {
    public static void main(String[] args) {
        // Демонстрация работы SecretKeeper
        SecretKeeper keeper = new SecretKeeper();
        keeper.revealSecret();
    }
}
// Класс-хранитель секрета
class SecretKeeper {
    // Приватное поле с секретом
    private String hiddenSecret = "Java — круто!";

    // Метод, внутри которого объявляется локальный класс
    public void revealSecret() {
        // Локальный класс, объявленный внутри метода
        class TruthRevealer {
            void printSecret() {
                System.out.println(hiddenSecret.toUpperCase());
            }
        }
        // Создаём объект локального класса и раскрываем секрет
        TruthRevealer secret = new TruthRevealer();
        secret.printSecret();
    }
}

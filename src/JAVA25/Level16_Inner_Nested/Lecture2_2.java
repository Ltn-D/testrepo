package JAVA25.Level16_Inner_Nested;

public class Lecture2_2 {
    private static int securityLevel = 100;

    public static class SecurityDisplayUnit {
        public void showSecurityLevel() {
            System.out.println(securityLevel);
        }
    }
    public static void main(String[] args) {
        // Создаем объект вложенного класса без создания объекта Vault
        SecurityDisplayUnit display = new SecurityDisplayUnit();
        // Показываем текущий уровень безопасности
        display.showSecurityLevel();
    }
}

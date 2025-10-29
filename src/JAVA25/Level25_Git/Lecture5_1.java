package JAVA25.Level25_Git;

public class Lecture5_1 {
    static class SystemCore {
        static {
            System.out.println("Система: глобальная инициализация завершена.");
            }
        {
            System.out.println("Компонент: индивидуальная настройка завершена.");
        }

    }

    static void main(String[] args) {
        SystemCore core1 = new SystemCore();
        SystemCore core2 = new SystemCore();
    }
}

package JAVA25.Level21_Lambda;

public class Lecture4_1 {
    static interface StringChecker {
        static boolean isEmpty(String field) {
            return field == null || field.isEmpty();
        }
    }
    public static void main(String[] args) {
        // Вызываем static-метод напрямую через имя интерфейса — без создания объектов
        System.out.println(StringChecker.isEmpty(""));     // true
        System.out.println(StringChecker.isEmpty("Java")); // false
    }
}

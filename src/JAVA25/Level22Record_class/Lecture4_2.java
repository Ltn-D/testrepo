package JAVA25.Level22Record_class;

public class Lecture4_2 {
    static record Email(String address) {
        public Email{
            if (address == null || address.isEmpty() || !address.contains("@")) {
                throw new IllegalArgumentException("Введенный адрес не корректен");
            }
        }
    }

    static void main(String[] args) {
        Email good = new Email("student@example.com");
        System.out.println("Создан корректный адрес: " + good.address());

        // 2) Некорректный email — без символа '@'
        // Эта строка выбросит IllegalArgumentException с сообщением из конструктора и завершит программу
        Email bad = new Email("student.example.com");

        // До этой строки выполнение не дойдет
        System.out.println(bad.address());
    }
}

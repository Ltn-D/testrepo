package JAVA25.Level22Record_class;

public class Lecture4_4 {
    static record Transaction(String o1, String o2, double summ) {
        public Transaction{
            if (summ <= 0 || o1 == null || o2 == null || o1.isEmpty() || o2.isEmpty()) {
                throw new IllegalArgumentException("Введены не корректные данные");
            }
        }

        public String describe() {
            return String.format("Перевод %.2f от %s к %s", summ,o1,o2);
        }
    }
    public static void main(String[] args) {
        // Создаем корректную транзакцию и выводим её описание
        Transaction ok = new Transaction("Иван Петров", "Мария Смирнова", 12500.75);
        System.out.println(ok.describe());

        // Пробуем создать транзакцию с отрицательной суммой.
        // Исключение намеренно не перехватываем, чтобы программа завершилась с ошибкой,
        // демонстрируя работу валидации.
        Transaction bad = new Transaction("Иван Петров", "Мария Смирнова", -100.0);

        // Этот код не выполнится из-за исключения выше:
        System.out.println(bad.describe());
    }
}

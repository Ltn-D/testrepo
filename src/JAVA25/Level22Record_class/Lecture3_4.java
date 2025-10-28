package JAVA25.Level22Record_class;

import java.util.Objects;

public class Lecture3_4 {
    static record Product(String name, double price) {
        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass()) return false;
            Product product = (Product) object;
            return Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }
    public static void main(String[] args) {
        // Создаем два товара с одинаковым названием и разной ценой
        Product p1 = new Product("Кружка", 199.99);
        Product p2 = new Product("Кружка", 149.49);

        // Проверяем эквивалентность по equals (ожидаем true)
        System.out.println(p1.equals(p2));

        // Проверяем совпадение хеш-кодов (ожидаем true)
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}

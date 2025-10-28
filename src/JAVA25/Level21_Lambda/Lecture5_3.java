package JAVA25.Level21_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecture5_3 {
    static class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Создаем список товаров с разными названиями и ценами
        List<Product> products = new ArrayList<>();
        products.add(new Product("Телевизор", 55000));
        products.add(new Product("Телефон", 35000));
        products.add(new Product("Ноутбук", 80000));

        // Временная сортировка по названию.
        //products.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); - лямбдой
        products.sort(new Comparator<Product>() {// to же самое через анонимный класс
            @Override
            public int compare(Product o1, Product o2) {
               return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });


        // Вывод отсортированного списка (по алфавиту названий)
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

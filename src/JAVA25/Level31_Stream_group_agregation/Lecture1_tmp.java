package JAVA25.Level31_Stream_group_agregation;

import java.util.*;
import java.util.stream.Collectors;

public class Lecture1_tmp {
    static class Product {
        private String productName;
        private int price;

        public Product(String productName, int price) {
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }
    }


    static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Молоко", 80),
                new Product("Мясо", 300),
                new Product("Сыр", 250),
                new Product("Сок", 90),
                new Product("Халва", 120),
                new Product("Хлеб", 40)
        );
        long productCount = products.stream().count();
        long expensiveCount = products.stream()
                .filter(product -> product.getPrice()>100)
                .count();
        System.out.println(productCount);
        System.out.println(expensiveCount);
        int sum = products.stream()
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(sum);
        OptionalDouble average = products.stream()
                .mapToDouble(Product::getPrice)
                .average();
        System.out.println(average.orElse(0.0));
        Map<Character,Double> avgPriceByLetter = products.stream()
                .collect(Collectors.groupingBy(
                        product -> product.getProductName().charAt(0),//группируем по первому символу
                        Collectors.averagingDouble(Product::getPrice)//рассчиываем среднее для каждой группы
                ));
        System.out.println(avgPriceByLetter);
        Map<Integer, Optional<Product>> maxPriceByLetter = products.stream()
                .collect(Collectors.groupingBy(
                        product -> product.getProductName().length(),
                        Collectors.maxBy(Comparator.comparing(Product::getPrice))
                ));
        System.out.println();
    }
}
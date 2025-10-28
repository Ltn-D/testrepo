package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture5_4 {
    static class Product {
        private static int totalProductCount;
        private String productName;

        public Product(String productName) {
            this.productName = productName;
            totalProductCount += 1;
        }

        public String getProductName() {
            return productName;
        }

    }
    public static void main(String[] args) {
        // Создаем один продукт и проверяем работу геттера
        Product banana = new Product("Банан");
        System.out.println(banana.getProductName());

    }

    public void print(String s) {
        System.out.println(s);
    }

    public String toString(String s) {
        String v = s;
        return v;
    }

}

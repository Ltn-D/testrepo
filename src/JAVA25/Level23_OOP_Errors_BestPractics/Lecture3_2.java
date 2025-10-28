package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture3_2 {
    public static void main(String[] args) {
        // "Выкладываем" товар на полку — создаем объект Product
        Product product = new Product();

        // Устанавливаем цену товара через публичный сеттер (прямого доступа к полю нет)
        product.setPrice(49.99);

        // Считываем цену через геттер и выводим на экран — контролируемый доступ к данным
        double currentPrice = product.getPrice();
        System.out.println(currentPrice);
    }

    static class Product {
        private double productPrice;

        public void setPrice(double productPrice) {
            this.productPrice = productPrice;
        }

        public double getPrice() {
            return productPrice;
        }
    }
}

package JAVA25.Level15_encapsulation;

public class Lecture3_1 {
    static void main(String[] args) {
        Product product = new Product("Старый товар");
        product.setProductName("Новый товар");
        System.out.println(product.getProductName());    }
}

class Product {
    private String productName;

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}

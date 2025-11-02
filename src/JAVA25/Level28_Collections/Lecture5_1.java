package JAVA25.Level28_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lecture5_1 {
    static void main(String[] args) {
        Map<String, Integer> products = new LinkedHashMap<>(16, .75f, true);
        products.put("a", 1);
        products.put("b", 2);
        products.put("c", 3);
        products.get("b");
        for (Map.Entry product : products.entrySet()){
            System.out.println(product.getKey());
        }

    }
}

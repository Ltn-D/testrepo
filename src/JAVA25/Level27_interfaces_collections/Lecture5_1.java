package JAVA25.Level27_interfaces_collections;

import java.util.List;

public class Lecture5_1 {
    static void main(String[] args) {
        List<Number> assets = List.of(1, 2.5, 3);
        double total = sumNumbers(assets);
        System.out.println(total);


    }

    public static double sumNumbers(List<?extends Number> list) {
        double sum = 0.0;
        for (Number elem : list) {
            sum = sum + elem.doubleValue();
        }
        return sum;
    }
}

package JAVA25.Level19_Abstract.Lecture1_3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bicycle());
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

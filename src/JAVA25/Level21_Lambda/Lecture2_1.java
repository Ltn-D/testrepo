package JAVA25.Level21_Lambda;

import java.util.Calendar;
import java.util.function.IntFunction;

public class Lecture2_1 {
    static void main(String[] args) {
        IntFunction converter = Integer::toHexString;
        System.out.println(converter.apply(255));
    }
}

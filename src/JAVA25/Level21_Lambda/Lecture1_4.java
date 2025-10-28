package JAVA25.Level21_Lambda;

import java.util.function.IntFunction;

public class Lecture1_4 {
    static void main(String[] args) {
        String prefix = "Результат: ";
        IntFunction<String> outString = a -> prefix + a*2;
        System.out.println(outString.apply(7));
    }

}

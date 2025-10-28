package JAVA25.Level20_interfaces;

public class Lecture4_4 {
    static void main() {
        StringTransformer transformer = str -> str.toLowerCase();
        transformer.printTransformed("JAVA ROCKS");
    }

    @FunctionalInterface
    interface StringTransformer {
        String transform(String s);
        default void printTransformed(String str) {
            System.out.println(transform(str));

        }
    }
}

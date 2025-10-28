package JAVA25.Level22Record_class;

public class Lecture2_4 {
    static record IntArrayRecord(int[] array) {
    }
    static void main(String[] args) {
        int[] readings = {10, 20, 30};
        IntArrayRecord container = new IntArrayRecord(readings);
        readings[0] = 99;
        System.out.println(container.array()[0]);

    }
}

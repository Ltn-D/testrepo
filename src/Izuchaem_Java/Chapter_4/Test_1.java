package Izuchaem_Java.Chapter_4;

public class Test_1 {
    static void main(String[] args) {
        long t =42;
        int f = calcArea((int) t, 17);
        byte h = (byte) calcArea(2, 2);
        short c = 7;
        int a = calcArea(c, 15);
        long q = calcArea(8, 56);


    }

    static int calcArea(int heigth, int width) {
        return heigth * width;
    }
}

package Izuchaem_Java.Chapter_1;

public class Message {
    public static void main(String[] args) {
        int x = 0, y = 0;
        while (x < 5) {
            if (y < 5) {
                x += 1;
                if (y < 3) {
                    x -= 1;
                }
            }
            y += 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

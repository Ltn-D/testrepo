package Old_Javarush.Core.Level6_Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture8_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //напишите тут ваш код
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds += 1;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}

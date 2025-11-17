package Old_Javarush.Core.Level6_Threads.Lecture9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Thread> threads = new ArrayList<>(5);

    static void main(String[] args) {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static class Thread1 extends Thread {
        public void run() {

            while (true) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static class Thread2 extends Thread {

        public void run() {
            try {
                throw new InterruptedException(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        static boolean isCanceled = false;

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!isCanceled) {
                try {
                    Thread.sleep(500);
                    System.out.println(current.getName());
                    Thread.sleep(1000);
                    showWarning();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        @Override
        public void showWarning() {
            isCanceled = true;
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

            while (true) {
                try {
                    String str = reader.readLine();
                    if (str.equalsIgnoreCase("N"))
                        break;
                    sum += Integer.parseInt(str);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(sum);
        }
    }
}



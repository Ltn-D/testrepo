package Old_Javarush.Core.Level6_Threads;

public class Lecture9_6 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread() {
            createdThreadCount += 1;
            super(Integer.toString(createdThreadCount));
            start();
        }

        @Override
        public void run() {
            while (createdThreadCount < count) {

                System.out.println(new GenerateThread());

            }
        }

        @Override
        public String toString() {
            return getName() + "created";
        }
    }
}

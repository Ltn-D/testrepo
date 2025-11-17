package Old_Javarush.Core.Level6_Threads;

public class Lecture8_3 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread test = new TestThread();
        test.start();
        Thread.sleep(1000);
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run() {
            Thread current = Thread.currentThread();

            try {
                while (!current.isInterrupted()) {
                    Thread.sleep(500);
                    System.out.println("Test");
                }
            } catch (InterruptedException e) {
                System.out.println("Canceled");
            }
        }
    }
}

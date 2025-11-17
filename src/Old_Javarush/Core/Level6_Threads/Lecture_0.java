package Old_Javarush.Core.Level6_Threads;

public class Lecture_0 {
    static class Printer implements Runnable {
        public void run() {
            System.out.println("I'm printer");
            System.out.println("Printer thread finished");
        }
    }
    static void main(String[] args) {
        Printer printer = new Printer();
        Thread childthread = new Thread(printer);
        childthread.start();
        System.out.println("Printer started");
        System.out.println("Main thread finished");
    }
}



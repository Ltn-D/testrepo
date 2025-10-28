package JAVA25.Level23_OOP_Errors_BestPractics;

public class Lecture4_4 {
    static abstract class Worker {
        protected String employeeName;

        public Worker(String employeeName) {
            this.employeeName = employeeName;
        }

        public abstract void work();
    }

    static interface Reportable {
        public void report();
    }

    static class Programmer extends Worker implements Reportable {
        public Programmer(String employeeName) {
            super(employeeName);
        }

        @Override
        public void work() {
            System.out.println("Программист пишет код");

        }

        @Override
        public void report() {
            System.out.println("Программист сдаёт отчёт");
        }
    }

    static void main(String[] args) {
        Programmer programmer = new Programmer("Алиса");
        programmer.work();
        programmer.report();
    }
}

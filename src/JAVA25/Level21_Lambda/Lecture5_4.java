package JAVA25.Level21_Lambda;

public class Lecture5_4 {
    static class DemoResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Ресурс закрыт");
        }
    }

    static void main(String[] args) throws Exception {
        try (DemoResource res = new DemoResource()){
            System.out.println("Работа с ресурсом");

        }
    }
}

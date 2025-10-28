package JAVA25.Level22Record_class;

public class Lecture5_3 {
    static interface Printable {
        public void print();
    }

    static record Document(String text) implements Printable{
        @Override
        public void print() {
            System.out.println("Документ: " + text);
        }
    }

    static void main(String[] args) {
        Printable doc = new Document("Привет из record-класса!");
        doc.print();
    }
}

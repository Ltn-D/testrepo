package JAVA25.Level25_Git;

public class Lecture2_1 {
    static class Library {
        static class Archive {
            static void readParchment() {
                System.out.println("Древний свиток разгадан!");
            }
        }
    }
    static void main(String[] args) {
        Library.Archive.readParchment();
    }
}

package JAVA25.Level16_Inner_Nested;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Небольшая демонстрация работы доски объявлений
        DisplayBoard board = new DisplayBoard();
        board.showTemporaryMessage();
    }
}

class DisplayBoard {
    void showTemporaryMessage() {
        class GreetingDisplay {
            void displayMessage() {
                System.out.println("Привет из локального класса!");
            }
        }
        GreetingDisplay greetingDisplay = new GreetingDisplay();
        greetingDisplay.displayMessage();
    }
}
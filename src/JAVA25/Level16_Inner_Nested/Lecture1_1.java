package JAVA25.Level16_Inner_Nested;

import javax.swing.*;

public class Lecture1_1 {
    static void main(String[] args) {
        Box box = new Box();
        Box.Label label = box.new Label();
        label.printLabel();
    }

    static class Box {
        class Label {
            public void printLabel() {
                System.out.println("Box label");
            }
        }
    }
}

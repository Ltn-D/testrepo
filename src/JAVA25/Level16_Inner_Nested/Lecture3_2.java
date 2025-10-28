package JAVA25.Level16_Inner_Nested;

interface Communicator {
    void gret();
}

public class Lecture3_2 {


    static void main(String[] args) {
        Communicator newCommunicator =  () -> System.out.println("Привет, мир!");
               newCommunicator.gret();
    }
}

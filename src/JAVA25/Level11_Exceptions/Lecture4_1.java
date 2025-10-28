package JAVA25.Level11_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lecture4_1 {
    public static void accessSecretDocument(String documentPath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(documentPath);
    }

    static void main(String[] args) throws FileNotFoundException{

    }
}

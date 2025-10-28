package JAVA25.Level24_Exception;

import java.io.IOException;

public class Lecture1_1 {
    static void main(String[] args) {
        IOException networkProblem = new IOException("отвалилась сеть");
        NullPointerException missingDataError = new NullPointerException("не инициализирован объект");
        String networkSuperClassName = networkProblem.getClass().getSuperclass().getSimpleName();
        String missingSuperClassName1 = missingDataError.getClass().getSuperclass().getSimpleName();
        System.out.println(networkSuperClassName);
        System.out.println(missingSuperClassName1);
    }
}

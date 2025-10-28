package JAVA25.Level24_Exception;

public class Lecture1_2 {
    static void main(String[] args) {
    Exception generalSystemIssue = new Exception("Это исключение");
    Error catastrophicFailure = new Error("Это глобальная ошибка");


    System.out.println(Throwable.class.isAssignableFrom(generalSystemIssue.getClass()));
    System.out.println(Throwable.class.isAssignableFrom(catastrophicFailure.getClass()));
    }
}

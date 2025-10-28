package Old_Javarush.Syntax.Level15_Exception;

public class Lecture6_2 {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement element : stackTrace) {
            String metodName = element.getMethodName();
            int lineNuber = element.getLineNumber();
            String className = element.getClassName();
            String fileName = element.getFileName();
            System.out.printf(OUTPUT_FORMAT,metodName,lineNuber,className,fileName);
        }//напишите тут ваш код
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

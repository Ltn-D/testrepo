package JAVA25.Level21_Lambda;

public class LEcture4_4 {
    static interface Logger {
        final String INFO = "[INFO] ";
        final String ERROR = "[ERROR] ";

        static void info(String message) {
            System.out.println(format(INFO,message));

        }
        static void error(String message) {
            System.out.println(format(ERROR,message));

        }
        private static String format(String level, String message) {
            return (level + message);
        }
    }

    static void main() {
        Logger.info("Start");
        Logger.error("Failure");
    }
}

package Old_Javarush.Syntax.String;

public class lecture5_3 {
    public static void main(String[] args) {
        String path = "usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int start = path.indexOf("jdk");
        String oldJdk = path.substring(start, path.indexOf('/', start));// второй старт обозначает, что поиск нужно начинать с индекса "start"
        return path.replace(oldJdk, jdk);
    }
}

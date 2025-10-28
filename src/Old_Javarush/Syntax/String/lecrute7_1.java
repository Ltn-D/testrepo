package Old_Javarush.Syntax.String;

public class lecrute7_1 {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }
    public static StringBuilder addTo (String string, String[] strings) {
        StringBuilder result = new StringBuilder(string);
        for (String temp : strings) {
            result.append(temp);
        }
        return result;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);
        return result;
    }
}

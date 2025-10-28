package Old_Javarush.Syntax.functios;

public class lecture3_2 {
    public static void main(String[] args) {
        System.out.println(cube(cube(2)));
    }
    static long cube(long digit){
        long cube = digit*digit*digit;
        return cube;
    }


}

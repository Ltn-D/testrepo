package Old_Javarush.Syntax.arrays;

public class lecture6_3 {


    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            System.out.print("{");
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    if (k < multiArray[i][j].length - 1) {
                        System.out.print(multiArray[i][j][k] + ", ");
                    } else {
                        System.out.print(multiArray[i][j][k] + "}, ");
                    }

                }
            }
            System.out.println("}, ");
        }
    }

}

package JAVA25.Level7;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Создаем зубчатый массив (каждая "строка" может иметь свою длину)
        int[][] playerAchievements = new  int[3][];

        // 1-й уровень: 2 достижения
        playerAchievements[0] = new int[2];
        // 2-й уровень: 4 достижения
        playerAchievements[1] = new int[4];
        // 3-й (бонусный) уровень: 1 достижение
        playerAchievements[2] = new int[1];
        int item = 100;
        for (int i = 0; i < playerAchievements.length ; i++) {
            for (int j = 0; j < playerAchievements[i].length; j++) {
                playerAchievements[i][j] = item;
                item += 1;
                if (j == 0) {
                    System.out.print(playerAchievements[i][j]);
                } else {
                    System.out.print(" " + playerAchievements[i][j]);
                }
            }
            System.out.println();
        }
    }
}

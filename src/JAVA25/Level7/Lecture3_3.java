package JAVA25.Level7;

public class Lecture3_3 {
    public static void main(String[] args) {
        int[][] warehouseInventory = new int[3][4];
        int item = 1;
        for (int i = 0; i < warehouseInventory.length; i++) {
            for (int j = 0; j < warehouseInventory[i].length; j++) {
                warehouseInventory[i][j] = item;
                item += 1;
            }
        }
        System.out.println(warehouseInventory[1][2]);
    }
}

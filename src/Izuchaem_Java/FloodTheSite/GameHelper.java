package Izuchaem_Java.FloodTheSite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphbet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.println(promt + " ");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = reader.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
        return inputLine;
    }

    public ArrayList<String> plaseDotCom(int comSize) {
        ArrayList<String> alhaCells = new ArrayList<>();
        String[] alphacoords = new String[comSize];
        String tmp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int iner = 1;
        if ((comCount % 2) == 1) {
            iner = gridLength;
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            System.out.println("Пробуем" + location);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += iner;
                    if (location >= gridSize) {
                        success = false;
                    }
                    if (x > 0 && (location % gridLength) == 0) {
                        success = false;
                    }
                } else {
                    System.out.println("Уже используется" + location);
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            tmp = String.valueOf(alphbet.charAt(column));
            alhaCells.add(tmp.concat(Integer.toString((row))));
            x++;
            System.out.println(" coord" + x + " = " + alhaCells.get(x-1));
        }
        return alhaCells;
    }
}

package Old_Javarush.Core.Level4_instanseof.Lecture8_1;

public class Solution {
    static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }
    public static void println(Bridge bridge) {
            System.out.println(bridge.getCarsCount());
        }
    }


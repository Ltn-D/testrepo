package Old_Javarush.Syntax.Level15_Exception.Lecture3_2;

public class Solution {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}

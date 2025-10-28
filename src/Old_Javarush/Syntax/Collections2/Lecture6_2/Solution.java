package Old_Javarush.Syntax.Collections2.Lecture6_2;

public class Solution {
    static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest quest : quests) {
            System.out.println(quest.ordinal());
        }

    }
}

package JAVA25.Level23_OOP_Errors_BestPractics.Lecture4_TMP;

public class Solution {
    static void main(String[] args) {
        LibraryItem[] items = {
                new Book("Чистый код", "Роберт Мартин"),
                new Magazine("Java World", 3)
        };
        for (LibraryItem item : items) {
            item.printInfo();
        }
    }
}

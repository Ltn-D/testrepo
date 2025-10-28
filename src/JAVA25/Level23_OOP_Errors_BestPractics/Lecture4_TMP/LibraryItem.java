package JAVA25.Level23_OOP_Errors_BestPractics.Lecture4_TMP;

public abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract void printInfo();
}

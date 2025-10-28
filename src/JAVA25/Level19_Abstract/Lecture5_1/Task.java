package JAVA25.Level19_Abstract.Lecture5_1;

public abstract class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void complete();
}

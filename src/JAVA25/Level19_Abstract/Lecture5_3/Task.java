package JAVA25.Level19_Abstract.Lecture5_3;

public class Task {
    private String title;
    private boolean complete = false;

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void complete() {
        this.complete = true;
    }
    public String toString() {
        return ("Задача: " + getTitle() + " статус: " + (isComplete()? "выполнена": "не выполнена"));
    }
}

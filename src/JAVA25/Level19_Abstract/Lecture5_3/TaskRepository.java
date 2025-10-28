package JAVA25.Level19_Abstract.Lecture5_3;

public interface TaskRepository {
    public void addTask(String title);

    public Task findByTitle(String title);

}

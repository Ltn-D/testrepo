package JAVA25.Level19_Abstract.Lecture5_2;

public interface TaskRepository {
    public void addTask(Task task);
    public Task findByTitle(String name);
}

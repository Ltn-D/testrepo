package JAVA25.Level19_Abstract.Lecture5_3;

public class TaskService {
    public TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(String title) {
        repository.addTask(title);
    }

    public void completeTask(String title) {
        if (repository.findByTitle(title) != null) {
            repository.findByTitle(title).complete();
        }
    }
}

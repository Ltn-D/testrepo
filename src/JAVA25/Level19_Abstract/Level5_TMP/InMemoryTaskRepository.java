package JAVA25.Level19_Abstract.Level5_TMP;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();
    @Override
    public void save(Task task) {
        tasks.add(task);
    }

    @Override
    public Task findByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }return null;
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }
}

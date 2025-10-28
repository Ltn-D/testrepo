package JAVA25.Level19_Abstract.Lecture5_2;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task findByTitle(String name) {
        for (Task t : tasks) {
            if (name.equals(t.getTitle())) {
                return t;
            }
        } return null;
    }
}

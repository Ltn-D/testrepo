package JAVA25.Level19_Abstract.Lecture5_3;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTaskRepository implements TaskRepository {
    HashMap<String, Task> repo =new HashMap<>();

    @Override
    public void addTask(String title) {
        repo.put(title, new Task(title));
    }

    @Override
    public Task findByTitle(String title) {
        if (repo.containsKey(title)) {
            return repo.get(title);
        }
        return null;
    }
}

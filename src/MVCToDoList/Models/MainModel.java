package MVCToDoList.Models;

import java.util.ArrayList;
import java.util.List;

public class MainModel extends BaseModel {
    private List<String> tasks;

    public MainModel() {
        tasks = new ArrayList<>();
    }

    @Override
    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(String task) {
        tasks.remove(task);
    }
}
package MVCToDoList.Models;

import java.util.List;

public abstract class BaseModel {
    public abstract List<String> getTasks();
    public abstract void addTask(String task);
    public abstract void removeTask(String task);
}
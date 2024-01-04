package MVCToDoList.Views;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

public abstract class BaseView extends JFrame {
    public abstract void updateTasks(List<String> tasks);
    public abstract void addActionListenerForAddButton(ActionListener listener);
    public abstract void addActionListenerForRemoveButton(ActionListener listener);
    public abstract String getNewTask();
    public abstract String getSelectedTask();
}
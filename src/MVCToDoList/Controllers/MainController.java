package MVCToDoList.Controllers;

import MVCToDoList.Models.BaseModel;
import MVCToDoList.Views.BaseView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController extends BaseController {
    private BaseModel model;
    private BaseView view;

    @Override
    public void setModel(BaseModel model) {
        this.model = model;
    }

    @Override
    public void setView(BaseView view) {
        this.view = view;
    }

    @Override
    public void initController() {
        view.addActionListenerForAddButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newTask = view.getNewTask();
                model.addTask(newTask);
                view.updateTasks(model.getTasks());
            }
        });

        view.addActionListenerForRemoveButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedTask = view.getSelectedTask();
                model.removeTask(selectedTask);
                view.updateTasks(model.getTasks());
            }
        });
    }
}

package MVCToDoList.Views;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;


public class MainView extends BaseView {
    private final JList<String> taskList;
    private final DefaultListModel<String> listModel;
    private final JTextField newTaskField;
    private final JButton addButton;
    private final JButton removeButton;

    public MainView() {
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane);

        newTaskField = new JTextField();
        add(newTaskField);

        addButton = new JButton("Add");
        add(addButton);

        removeButton = new JButton("Remove");
        add(removeButton);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    @Override
    public void updateTasks(List<String> tasks) {
        listModel.clear();
        for (String task : tasks) {
            listModel.addElement(task);
        }
    }

    @Override
    public void addActionListenerForAddButton(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    @Override
    public void addActionListenerForRemoveButton(ActionListener listener) {
        removeButton.addActionListener(listener);
    }

    @Override
    public String getNewTask() {
        return newTaskField.getText();
    }

    @Override
    public String getSelectedTask() {
        return taskList.getSelectedValue();
    }
}
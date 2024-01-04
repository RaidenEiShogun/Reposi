package MVCToDoList;

import MVCToDoList.Controllers.BaseController;
import MVCToDoList.Controllers.MainController;
import MVCToDoList.Models.BaseModel;
import MVCToDoList.Models.MainModel;
import MVCToDoList.Views.BaseView;
import MVCToDoList.Views.MainView;

import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                BaseModel model = new MainModel();
                BaseView view = new MainView();
                BaseController controller = new MainController();

                controller.setModel(model);
                controller.setView(view);

                controller.initController();

                view.setVisible(true);
            }
        });
    }
}

package MVCToDoList.Controllers;

import MVCToDoList.Models.BaseModel;
import MVCToDoList.Views.BaseView;

import java.awt.event.ActionListener;

public abstract class BaseController {
    public abstract void setModel(BaseModel model);
    public abstract void setView(BaseView view);
    public abstract void initController();
}
package KZ.MVC.mvc4;

import KZ.MVC.mvc4.controller.Controller;
import KZ.MVC.mvc4.model.Model;
import KZ.MVC.mvc4.view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        UserView userView = new UserView(controller);

        SwingUtilities.invokeLater(() -> {
            userView.init();
        });

    }
}

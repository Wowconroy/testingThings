package KZ.MVC.mvc4;

import KZ.MVC.mvc4.view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView();

        SwingUtilities.invokeLater(() -> {
            userView.init();
        });

    }
}

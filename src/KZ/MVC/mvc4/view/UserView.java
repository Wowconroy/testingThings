package KZ.MVC.mvc4.view;

import KZ.MVC.mvc4.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;
    private Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        setSize(400, 300);
        text = new JTextArea();
        sendButton = new JButton("Send");
        info = new JLabel("Info");

        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.PAGE_END);
        add(info, BorderLayout.NORTH);

        sendButton.addActionListener(e -> {
            int pin;
            String textPin = this.text.getText();
            text.setText("");

            try{
            pin = Integer.parseInt(textPin);
            info.setText("Yes it is. DONE: " + pin + "Waiting...");

            Thread thread = new Thread(() -> {
                sendButton.setEnabled(false);
                boolean result;
                result = controller.checkPin(pin);
                String resultMessage;
                if (result) {
                    resultMessage = "RIGHT!";
                } else {
                    resultMessage = "Fuck you!";
                }
                info.setText(resultMessage);
                sendButton.setEnabled(true);
            });
            thread.start();
            }
            catch (NumberFormatException ex){
                info.setText("Only number allowed...");
            }
        });
        setVisible(true);
    }
}

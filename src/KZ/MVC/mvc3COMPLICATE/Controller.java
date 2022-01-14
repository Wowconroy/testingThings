package KZ.MVC.mvc3COMPLICATE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;

        this.view.addCalculationListener(new CalculationListener());
    }

    class CalculationListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try{
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();

                model.addTwoNumbers(firstNumber, secondNumber);
                view.setCalcSolution(model.getCalculationValue());
            }catch (NumberFormatException ex){
                view.displayErrorMessage("You need to Enter 2 Integers");
            }
        }
    }
}

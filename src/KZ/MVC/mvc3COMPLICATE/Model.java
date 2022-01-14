package KZ.MVC.mvc3COMPLICATE;

public class Model {
    private int calculationValue;

    public void addTwoNumbers(int first, int second){
        calculationValue = first + second;
    }

    public int getCalculationValue(){
        return calculationValue;
    }

}

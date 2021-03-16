package mvc;

import view.CalculatorView;
import model.CalculatorModel;

public class MVCCalculator {
    
    public static void main(String[] args) {
    	
    	CalculatorView theView = new CalculatorView();
        
    	CalculatorModel theModel = new CalculatorModel();
        
        CalculatorView theController = new CalculatorView(theView,theModel);
        
        theView.setVisible(true);
        
    }
}
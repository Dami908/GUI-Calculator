package SimpleCalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class CalculatorController {
	
	float data= 0f;
	int operation=-1;

	@FXML
    private TextArea TextScreen;

    @FXML
    private Button ButtonNine;

    @FXML
    private Button ButtonEight;

    @FXML
    private Button EqualsTo;

    @FXML
    private Button AdditionButton;

    @FXML
    private Button ButtonSeven;

    @FXML
    private Button ButtonSix;

    @FXML
    private Button ButtonFive;

    @FXML
    private Button ButtonFour;

    @FXML
    private Button SubtractionButton;

    @FXML
    private Button ButtonThree;

    @FXML
    private Button ButtonTwo;

    @FXML
    private Button ButtonOne;

    @FXML
    private Button MultiplicationButton;

    @FXML
    private Button ButtonZero;

    @FXML
    private Button DivisionButton;

    @FXML
    private Button ButtonClear;

    @FXML
    void OnClick9(ActionEvent event) {
    	if(event.getSource()==ButtonNine) {
    		TextScreen.setText(TextScreen.getText()+"9");
    	}
    	else if(event.getSource()==ButtonEight) {
    		TextScreen.setText(TextScreen.getText()+"8");
    	}
    	else if(event.getSource()==ButtonSeven) {
    		TextScreen.setText(TextScreen.getText()+"7");
    	}
    	else if(event.getSource()==ButtonSix) {
    		TextScreen.setText(TextScreen.getText()+"6");
    	}
    	else if(event.getSource()==ButtonFive) {
    		TextScreen.setText(TextScreen.getText()+"5");
    	}
    	else if(event.getSource()==ButtonFour) {
    		TextScreen.setText(TextScreen.getText()+"4");
    	}
    	else if(event.getSource()==ButtonThree) {
    		TextScreen.setText(TextScreen.getText()+"3");
    	}
    	else if(event.getSource()==ButtonTwo) {
    		TextScreen.setText(TextScreen.getText()+"2");
    	}
    	else if(event.getSource()==ButtonOne) {
    		TextScreen.setText(TextScreen.getText()+"1");
    	}
    	else if(event.getSource()==ButtonZero) {
    		TextScreen.setText(TextScreen.getText()+"0");
    	}
    	else if(event.getSource()==AdditionButton) {
    		data=Float.parseFloat(TextScreen.getText());
    		operation=1;//Addition
    		TextScreen.setText("");
    		
    	}
    	else if(event.getSource()==SubtractionButton) {
    		data=Float.parseFloat(TextScreen.getText());
    		operation=2;
    		TextScreen.setText("");
    	}
    	else if (event.getSource()==MultiplicationButton) {
    		data=Float.parseFloat(TextScreen.getText());
    		operation=3;
    		TextScreen.setText("");
    	}
    	else if(event.getSource()==DivisionButton) {
    		data=Float.parseFloat(TextScreen.getText());
    		operation=4;
    		TextScreen.setText("");
    	}
    	else if(event.getSource()==ButtonClear) {
    		TextScreen.setText("");
    	}
    	else if(event.getSource()==EqualsTo) {
    		Float secondOperand=Float.parseFloat(TextScreen.getText());
    		switch(operation) 
    		{
    		case 1://Addition
    			Float ans=data+secondOperand;
    			TextScreen.setText(String.valueOf(ans));
    			break;
    		case 2://Subtraction
    			ans=data-secondOperand;
    			TextScreen.setText(String.valueOf(ans));
    			break;
    		case 3://Multiplication
    			ans=data*secondOperand;
    			TextScreen.setText(String.valueOf(ans));
    			break;
    		case 4://Division
    		    ans=0f;
    		    try {
    		    	ans=data/secondOperand;
    		    }catch(Exception e) {TextScreen.setText("Error");}
    		    TextScreen.setText(String.valueOf(ans));
    		
    		
    		
    		}
    	}

    }

}

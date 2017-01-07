package javaFXExample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	
	@FXML
    private Button Peter;
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
    
    public void handleButtonClick(){
    	System.out.println("Ich wurde gepresst und heiße Peter.");
    	Peter.setText("asdf");
    }
}

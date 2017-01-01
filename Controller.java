package verwaltungFX;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
    
    public void handleButtonClick(){
    	System.out.println("Ich wurde gepresst und heiﬂe Peter.");
    }
}
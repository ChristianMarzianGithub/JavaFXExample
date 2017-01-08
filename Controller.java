package verwaltungFX;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Vector;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import verwaltung.CalcVerwaltung;

public class Controller implements Initializable {
	
	@FXML
	private Label labelTitel;
	@FXML
	private Label labelJahr;
	@FXML
	private Label labelStory;
	
	@FXML
	private Label labelTitelInhalt;
	@FXML
	private Label labelJahrInhalt;
	@FXML
	private Label labelStoryInhalt;
	
	
	
	
	@SuppressWarnings("rawtypes")
	@FXML
	private ListView<String> filmListe;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Vector x = new Vector();
		
		labelTitel.setText("Titel:");
		labelJahr.setText("Erscheinungsjahrasdfasdfasdfsadfasdf:");
		labelStory.setText("Story:");		
		labelTitelInhalt.setText("test");
		labelJahrInhalt.setText("test");
		labelStoryInhalt.setText("test");
		labelStoryInhalt.setWrapText(true);
				
				
		
		
		
		
		try {
			CalcVerwaltung.connect();
			
			x = CalcVerwaltungFX.getData();
			filmListe.getItems().addAll(x);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("alles geladen");
	}
	
	public void beispielRoutineDieVerknuepftWerdenKann(){		
		int index = filmListe.getSelectionModel().getSelectedIndex();
		
		String[] eintraegeArray = new String[5];	 
		System.out.println(index);
		eintraegeArray = CalcVerwaltungFX.getEintragData(index);
		
		labelTitelInhalt.setText(eintraegeArray[0]);	
		labelJahrInhalt.setText(eintraegeArray[2]);
		labelStoryInhalt.setText(eintraegeArray[1]);
		
		
	}
}

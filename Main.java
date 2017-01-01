package verwaltungFX;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Scene scene;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {        
        Parent root = FXMLLoader.load(getClass().getResource("FensterLayout.fxml"));
        
        scene = new Scene(root, 300, 250);
        scene.getStylesheets().add("Viper.css");
        primaryStage.getIcons().add(new Image("verwaltungIcon.jpg"));
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}

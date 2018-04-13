package ges_Session_Groupe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestGroupeSession extends Application {
	
	public void start(Stage primaryStage)  {
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ges_Session_Groupe/PageSessionGroupe.fxml"));
			//AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene); 
			primaryStage.show();
		    //primaryStage.setResizable(false);;
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

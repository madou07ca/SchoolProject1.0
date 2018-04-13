package Ges_Matiere_module;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application {
	
	public void start(Stage primaryStage)  {
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Ges_Matiere_module/Page_Matiere_Module.fxml"));
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

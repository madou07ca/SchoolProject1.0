package Menu_School_Admin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestAdmin extends Application {
	public void start(Stage primaryStage)  {
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Menu_School_Admin/ViewAdmin.fxml"));
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

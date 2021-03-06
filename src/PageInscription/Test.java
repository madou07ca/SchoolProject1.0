package PageInscription;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test extends Application {
	
	public void start(Stage primaryStage)  {
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PageInscription/ViewInscription.fxml"));
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

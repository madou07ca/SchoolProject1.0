import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage)  {
		Parent root = null;
		try {
			 root = FXMLLoader.load(getClass().getResource("/PageInscription/ViewInscription.fxml"));
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root, 800 , 600);
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		    primaryStage.setResizable(false);;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(Main.class);
	}


}

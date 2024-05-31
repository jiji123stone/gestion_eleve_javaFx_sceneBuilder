package application;
	
import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
 


public class Main extends Application {
	@Override
	
	public void start(Stage primaryStage) {
		try {
	  //  Parent root = (  Parent)FXMLLoader.load(Main.class.getResource("/Vue/MEDIA.fxml"));
	 Parent root = (  Parent)FXMLLoader.load(Main.class.getResource("/Vue/Home1.fxml"));
			
			
			Scene scene = new Scene(root );
			primaryStage.setScene(scene); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setTitle( "home11111");
			primaryStage.setTitle( "media  salah");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

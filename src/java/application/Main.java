package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception  {
		Pane root = FXMLLoader.load(getClass().getResource("/Application.fxml"));
		Scene scene = new Scene(root);
		
		stage.setTitle("Visualizador de Valores Monetários");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

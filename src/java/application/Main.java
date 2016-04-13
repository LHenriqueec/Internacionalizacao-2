package application;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	private static Locale locale;
	private static ResourceBundle bundle;
	private static Language language;

	@Override
	public void start(Stage stage) throws IOException {
		language = Language.LANGUAGE_BR;
		locale = language.getLanguage();

		bundle = ResourceBundle.getBundle("language", locale);
		Pane root = FXMLLoader.load(getClass().getResource("/Application.fxml"), bundle);
		Scene scene = new Scene(root);
		
		
		stage.setTitle("Meses do Ano");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static Language getLanguage() {
		return Main.language;
	}
	
	public static void setLanguage(Language language) {
		Main.language = language;
	}
}

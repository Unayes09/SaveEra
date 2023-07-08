package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.nio.file.Paths;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	/*public Media media = new Media(getClass().getResource("An-Epic-Story.mp3").toExternalForm());
	public MediaPlayer playerr = new MediaPlayer(media);*/
	@Override
	public void start(Stage primaryStage) {
		try {
			//WebView webView = new WebView();
			//WebEngine engine;
			//music();
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Initial.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("SaveEra");
			primaryStage.setWidth(1400);
			primaryStage.setHeight(750);
			Image Icon = new Image("1-2-dinosaur-png-file.png");
			primaryStage.getIcons().add(Icon);
			primaryStage.setResizable(false);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

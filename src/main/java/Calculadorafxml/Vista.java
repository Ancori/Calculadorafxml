package Calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class Vista extends Application {
	public void start(Stage primaryStage) {
		try {

			// Final
			VBox root = new VBox();
			root.setSpacing(10);
			root.getChildren().addAll();

			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("Calculadora");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);
	}
}

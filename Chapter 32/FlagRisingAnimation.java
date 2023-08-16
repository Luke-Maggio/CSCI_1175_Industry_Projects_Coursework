package exercise32_3;

import javafx.animation.PathTransition; 
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.lang.Thread;
import javafx.scene.image.Image;


public class FlagRisingAnimation extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
			Pane pane = new Pane();

			Image flag = new Image("us.gif");
			ImageView imageView = new ImageView(flag);
			pane.getChildren().add(imageView);
			// Create a path transition
			PathTransition pt = new PathTransition(Duration.millis(10000),
								new Line(100, 200, 100, 0), imageView); pt.setCycleCount(5);
			pt.play(); // Start animation
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(pane, 250, 200); 
			primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
			new Thread (() -> {
			try {
				while (true) {
					Platform.runLater(() -> imageView.setY(imageView.getY() - 1));
					Thread.sleep(20);
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}).start();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

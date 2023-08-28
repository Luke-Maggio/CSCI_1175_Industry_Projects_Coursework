package finalProjectIndustry;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class WorkoutProgramApp extends Application {
	public static final String[] StrengthTrainingSplits = {
			"Upper-Lower Training Split: Monday and Wednesday: Upper Body, Tuesday and Friday: Lower Body",
			"Push/Pull/Legs Split: Monday and Thursday: Chest, Shoulders, Triceps. Tuesday and Friday: Back and Biceps. Wednesday and Saturday: legs",
			"The 5 day Split: Monday: shoulders, Tuesday: arms, Wednesday: legs, Thursday: back, and Friday: chest",
			"The Arnold Split: Monday: chest and back, Tuesday: Shoulders, biceps, triceps, and abs. Wednesday: Legs, Thursday: Chest, triceps, and shoulders. Friday: back and biceps, Saturday: Legs",
		};
		
		public static final String[] CardioPlan = {
			"Treadmill for 20-30 minutes",
			"Cycling for 20-30 minutes",
			"Elliptical for 20-30 minutes",
			"Jump rope for 20-30 minutes",
			"Stair climbers for 20-30 minutes",
		};
		
		public static final String[] WeightGain = {
			"Bench press: 3 sets of 10",
			"Cable Flys: 3 sets of 10",
			"Curls: 3 sets of 10",
			"Tricep Extensions: 3 sets of 10",
			"Lat pulldowns: 3 sets of 10",
			"Rows: 3 sets of 10",
			"Squats: 3 sets of 10",
			"Calf raises 3 sets of 12",
			"Hamstring curls 3 sets of 10",
		};
		
		@Override
		public void start(Stage primaryStage) {
			TabPane tabs = new TabPane();

			Tab StrengthTrainingTab = new Tab("Strength Training");
			StrengthTrainingTab.setContent(createStrengthTrainingContent());
			tabs.getTabs().add(StrengthTrainingTab);
			
			Tab WeightLossTab = new Tab("Weight Loss");
			WeightLossTab.setContent(createWeightLossContent());
			tabs.getTabs().add(WeightLossTab);
			
			Tab WeightGainTab = new Tab("Weight Gain");
			WeightGainTab.setContent(createWeightGainContent());
			tabs.getTabs().add(WeightGainTab);
			
			Tab logTab = new Tab("Log");
			logTab.setContent(createLogContent());
			tabs.getTabs().add(logTab);
			
			VBox root = new VBox(tabs);
			root.setPadding(new Insets(10));
			Scene scene = new Scene(root, 400, 300);
			primaryStage.setTitle("Workout Program");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		private VBox createStrengthTrainingContent() {
			Label label = new Label("Select a workout split: ");
			ComboBox<String> comboBox = new ComboBox<>();
			comboBox.getItems().addAll(StrengthTrainingSplits);
			Button startButton = new Button("Start Workout");
			
			VBox content = new VBox(10, label, comboBox, startButton);
			content.setAlignment(Pos.CENTER);
			return content;
		}
		private VBox createWeightLossContent() {
			Label label = new Label("Select a cardio plan: ");
			ComboBox<String> comboBox = new ComboBox<>();
			comboBox.getItems().addAll(CardioPlan);
			Button startButton = new Button("Start Cardio");
			
			VBox content = new VBox(10, label, comboBox, startButton);
			content.setAlignment(Pos.CENTER);
			return content;
		}
		private VBox createWeightGainContent() {
			Label label = new Label("Exercises for Weight Gain: ");
			ListView<String> listView = new ListView<>();
			listView.getItems().addAll(WeightGain);
			Button startButton = new Button("Start Workout");
			
			VBox content = new VBox(10, label, listView, startButton);
			content.setAlignment(Pos.CENTER);
			return content;
		}
		private VBox createLogContent() {
			TextArea logTxtArea = new TextArea();
			Button clearButton = new Button("Clear Log");
			HBox buttonLayout = new HBox(clearButton);
			buttonLayout.setAlignment(Pos.CENTER);
			
			VBox content = new VBox(10, logTxtArea, buttonLayout);
			content.setAlignment(Pos.CENTER);
			return content;
		}
	public static void main(String[] args) {
		launch(args);
		}

}

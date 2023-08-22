package exercise31_17;

import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.application.*;


public class Exercise31_17 extends Application {
	public TextField investmentAmountField = new TextField();
	public TextField interestRateField = new TextField();
	public TextField yearsField = new TextField();
	public TextField futureValueField = new TextField();

	public void start(Stage primaryStage) {
		
	primaryStage.setTitle("Investment Calculator");
	
	GridPane gridPane = new GridPane();
	gridPane.setPadding(new Insets(10));
	gridPane.setVgap(10);
	gridPane.setHgap(10);
	
	Label investmentAmountLabel = new Label("Investment Amount");
	gridPane.add(investmentAmountLabel, 0, 0);
	gridPane.add(investmentAmountField, 1, 0);
	
	Label interestRateLabel = new Label("Interest Rate");
	gridPane.add(interestRateLabel, 0, 1);
	gridPane.add(interestRateField, 1, 1);
	
	Label yearsLabel = new Label("Years");
	gridPane.add(yearsLabel, 0, 2);
	gridPane.add(yearsField, 1, 2);
	
	Button calculateButton = new Button("Calculate");
	calculateButton.setOnAction(e -> calculateFutureValue());
	gridPane.add(calculateButton, 0, 3);
	
	futureValueField.setEditable(false);
	gridPane.add(futureValueField, 1, 3);
	
	Scene scene = new Scene(gridPane, 150, 150);
	primaryStage.setScene(scene);
	primaryStage.show();

	}
	public void calculateFutureValue() {
		try {
			double investmentAmount = Double.parseDouble(investmentAmountField.getText());
			double interestRate = Double.parseDouble(interestRateField.getText());
			int years = Integer.parseInt(yearsField.getText());
			
			double monthlyInterestRate = interestRate / 100 / 12;
			double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
			
			futureValueField.setText(String.format("$%.2f", futureValue));
		} catch
		(NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid Input");
			alert.showAndWait();
		}
	}
	public static void main(String[] args){
		launch(args);
	}
}
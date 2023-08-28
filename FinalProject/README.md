# Workout Program App
## Synopsis: This application was created for users to scroll through different tabs containing workout information based on their personal fitness goal. It contains information for users who would like to gain strength, gain weight, lose weight, and log any important information associated with their fitness routine. 
## Motivation: I designed this app because I am passionate about fitness and wanted to combine a passion with my occupation.
# Only the main class is needed to run this program. 
[Workout App] ![Screen Shot 2023-08-28 at 9 21 38 AM](https://github.com/Luke-Maggio/CSCI_1175_Industry_Projects_Coursework/assets/128526709/9656132e-c129-4b03-aa1b-86ac9e1268d5)
## Code Example: Snippet of code for creating the different exercise tabs 
```
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
```

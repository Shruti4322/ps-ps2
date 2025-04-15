package mentalhealthassistant;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label moodLabel = new Label("How are you feeling today?");

        Button happyButton = new Button("Happy");
        Button sadButton = new Button("Sad");
        Button stressedButton = new Button("Stressed");
        Button quoteButton = new Button("Get Motivational Quote");
        Button tipButton = new Button("Relaxation Tip");

        MoodDatabase moodDB = new MoodDatabase();

        happyButton.setOnAction(e -> moodDB.saveMood("Happy"));
        sadButton.setOnAction(e -> moodDB.saveMood("Sad"));
        stressedButton.setOnAction(e -> moodDB.saveMood("Stressed"));

        quoteButton.setOnAction(e -> QuoteGenerator.showQuote());
        tipButton.setOnAction(e -> RelaxationTip.showTip());

        VBox layout = new VBox(10, moodLabel, happyButton, sadButton, stressedButton, quoteButton, tipButton);
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Mental Health & Wellbeing Assistant");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
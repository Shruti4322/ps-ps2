package mentalhealthassistant;

import javafx.scene.control.Alert;

public class QuoteGenerator {
    private static final String[] quotes = {
        "You are stronger than you think.",
        "Every day is a second chance.",
        "Take it one step at a time.",
        "Your mental health matters."
    };

    public static void showQuote() {
        int index = (int) (Math.random() * quotes.length);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Motivational Quote");
        alert.setHeaderText(null);
        alert.setContentText(quotes[index]);
        alert.showAndWait();
    }

    public static String[] getQuotes() {
        return quotes;
    }
}
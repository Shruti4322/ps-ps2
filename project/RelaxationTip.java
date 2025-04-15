package mentalhealthassistant;

import javafx.scene.control.Alert;

public class RelaxationTip {
    private static final String[] tips = {
        "Take deep breaths for 5 minutes.",
        "Go for a short walk.",
        "Listen to calming music.",
        "Disconnect from screens for 15 minutes."
    };

    public static void showTip() {
        int index = (int) (Math.random() * tips.length);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relaxation Tip");
        alert.setHeaderText(null);
        alert.setContentText(tips[index]);
        alert.showAndWait();
    }
}
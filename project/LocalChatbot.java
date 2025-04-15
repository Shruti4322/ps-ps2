package mentalhealthassistant;

import javafx.scene.control.Alert;

public class LocalChatbot {

    public static void startChat(String userMessage) {
        String botResponse = "It sounds like you're going through a tough time. I'm here for you.";
        showChatResponse(botResponse);
    }

    private static void showChatResponse(String response) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Local Chatbot Response");
        alert.setHeaderText(null);
        alert.setContentText(response);
        alert.showAndWait();
    }
}
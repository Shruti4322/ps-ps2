package mentalhealthassistant;

import javafx.scene.control.Alert;

public class AIChatbot {

    public static void startChat(String userMessage) {
        // Placeholder for AI response (integrate with OpenAI or another service)
        String botResponse = "I'm here to listen. Tell me more about your day.";
        showChatResponse(botResponse);
    }

    private static void showChatResponse(String response) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Chatbot Response");
        alert.setHeaderText(null);
        alert.setContentText(response);
        alert.showAndWait();
    }
}
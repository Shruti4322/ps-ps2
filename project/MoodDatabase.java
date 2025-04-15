package mentalhealthassistant;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MoodDatabase {

    public void saveMood(String mood, String username) {
        if (saveToDatabase(mood, username)) {
            System.out.println("Mood saved to database: " + mood);
        } else {
            saveToFile(mood, username);
            System.out.println("Database not reachable. Saved to local file: " + mood);
        }
    }

    private boolean saveToDatabase(String mood, String username) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mental_health", "root", "yourpassword");
            String sql = "INSERT INTO moods (mood, username) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, mood);
            stmt.setString(2, username);
            stmt.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void saveToFile(String mood, String username) {
        try (FileWriter writer = new FileWriter("offline_moods.txt", true)) {
            writer.write(username + ": " + mood + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to local file.");
        }
    }
}
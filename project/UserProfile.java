package mentalhealthassistant;

import java.util.HashMap;
import java.util.Map;

public class UserProfile {
    private Map<String, String> users = new HashMap<>();
    private String currentUser;

    public UserProfile() {
        // Sample users (username, password)
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public boolean login(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            currentUser = username;
            return true;
        }
        return false;
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
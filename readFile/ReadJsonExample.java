import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ReadJsonExample {
    public static void main(String[] args) {
        try {
            // Create Jackson ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Read and map JSON file to User object
            File file = new File("data.json"); // Make sure path is correct
            User user = mapper.readValue(file, User.class);

            // Print user data
            System.out.println("User Data:");
            System.out.println("Name  : " + user.name);
            System.out.println("Age   : " + user.age);
            System.out.println("Email : " + user.email);
        } catch (IOException e) {
            System.out.println("Failed to read JSON file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

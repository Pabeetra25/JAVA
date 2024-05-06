package np.edu.practical;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "abc.txt";

        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(fileName);

            // Write "Hello, World!" to the file
            writer.write("Hello, World!");

            // Close the writer to release resources
            writer.close();

            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


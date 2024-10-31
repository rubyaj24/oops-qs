
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        String filePath = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Java I/O Streams");
            writer.newLine(); // Adds a newline character
            writer.write("Character streams simplify text processing.");
            System.out.println("Data written successfully to " + filePath);
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}

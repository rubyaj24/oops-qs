import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Ensure this file exists with some text
        String outputFilePath = "output.txt";

        // Try-with-resources to ensure the reader and writer are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line
            }
            System.out.println("File has been copied successfully.");

        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            System.err.print(e.getMessage());
        }
    }
}
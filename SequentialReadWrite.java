import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class SequentialReadWrite {
    public static void main(String[] args) {
        // Writing to a file sequentially
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sequential_rw_output.txt"))) {
            writer.write("This is a test of sequential read and write.\n");
            writer.write("This is the second line.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Reading from a file sequentially
        try (BufferedReader reader = new BufferedReader(new FileReader("sequential_rw_output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}

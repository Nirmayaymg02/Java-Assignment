import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SequentialWrite {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sequential_output.txt"))) {
            writer.write("Hello, this is a sequential file write operation.\n");
            writer.write("This is the second line of the file.");
            System.out.println("File written sequentially.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

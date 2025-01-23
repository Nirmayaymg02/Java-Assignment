import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SequentialRead {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sequential_output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

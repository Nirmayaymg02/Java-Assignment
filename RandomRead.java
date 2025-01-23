import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomRead {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("random_output.txt", "r")) {
            file.seek(0); // Move to the start of the file
            String line = file.readLine();
            System.out.println("Read from random position: " + line);
            file.seek(10); // Move the pointer to a specific byte
            line = file.readLine();
            System.out.println("Read from another position: " + line);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

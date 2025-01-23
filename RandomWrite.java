import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomWrite {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("random_output.txt", "rw")) {
            file.writeBytes("This is the first line.\n");
            file.seek(0); // Move to the beginning of the file
            file.writeBytes("This is overwritten at the start.\n");
            System.out.println("Random write operation complete.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ExceptionHandlingExample2ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        }
        catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println(reader.readLine());
        reader.close();

    }
}

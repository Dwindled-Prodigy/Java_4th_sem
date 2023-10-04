import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\BE\\4 sem\\Example.txt");
            writer.write("A named location used to store related information is referred to as a File.");
            writer.close();
            System.out.println("Content is successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}

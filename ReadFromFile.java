import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\BE\\4 sem\\Example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String fileData = scanner.nextLine();
                System.out.println(fileData);
            }
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected error occurred!");
            exception.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\BE\\4 sem\\Example.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File already exists in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();
        }
    }
}

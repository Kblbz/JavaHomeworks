import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ReadWriteDeleteDemo {
   public static void main(String[] args) throws IOException {

        try {
            Files.copy((Paths.get("Homework_9/src/main/java/ReadFrom")), (Paths.get("Homework_9/src/main/java/WriteTo")),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            System.err.format("I/O Error during copying file");
        }
        System.out.println("File content was copied");


        try {
            Files.deleteIfExists(Paths.get("Homework_9/src/main/java/ReadFrom"));
        } catch (IOException ex) {
            System.err.format("I/O Error during copying file");
        }
        System.out.println("File was deleted successfully");
    }
}
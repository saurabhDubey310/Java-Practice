import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyExample {
  public static void main(String[] args) {
    String sourceFile = "source.txt";
    String destinationFile = "destination.txt";

    try (FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destinationFile)) {

      int data;
      System.out.println("Copying data from " + sourceFile + " to " + destinationFile);
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }

      System.out.println("File copied successfully.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

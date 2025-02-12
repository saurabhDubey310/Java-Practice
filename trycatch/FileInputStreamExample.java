import java.io.FileInputStream;

public class FileInputStreamExample {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("input.txt")) {
      int data;
      System.out.println("Reading data from file:");
      while ((data = fis.read()) != -1) {
        System.out.print((char) data);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

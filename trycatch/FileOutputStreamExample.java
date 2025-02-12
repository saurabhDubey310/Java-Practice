import java.io.FileOutputStream;

public class FileOutputStreamExample {
  public static void main(String[] args) {
    String data = "You are not brave, men are brave(batman)";

    try (FileOutputStream fos = new FileOutputStream("output.txt")) {
      fos.write(data.getBytes());
      System.out.println("Data written to file successfully.");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
package filereaderwriter;
import java.io.FileWriter;

public class filewriter{
  public static void main(String[] args) {
    try(FileWriter writer = new FileWriter("output.txt")) {
      writer.write("man are brave");  
      System.out.println("File writer created");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
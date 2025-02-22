package filereaderwriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class filereader {
  public static void main(String[] args) {
    String filepath = "output.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
      int data = reader.read();
      while(data != -1){
        System.out.print((char)data);
        data = reader.read();
      }
      }catch(Exception e){
        System.out.println(e);
     
  }
}
} 
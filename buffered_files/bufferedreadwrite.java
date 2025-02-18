package buffered_files;
// package buffered_files;

import java.io.*;

public class bufferedreadwrite {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
       
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
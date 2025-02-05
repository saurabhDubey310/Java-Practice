import sports.Cricket; // Importing the Cricket class from the sports package
import games.Football; // Importing the Football class from the games package

public class Main2 {
    public static void main(String[] args) {
        // Creating objects of the classes from different packages
        Cricket cricket = new Cricket();
        Football football = new Football();

        // Calling methods from both classes
        cricket.play();
        football.play();
    }
}

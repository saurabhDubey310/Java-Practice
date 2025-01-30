import java.util.*;

public class FACT {
    public static void main(String[] args) {
        int facto = 1;
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = num.nextInt();


        for(int i=1; i<= number; i++){
            facto = facto*i;

        }
        System.out.print("The factorial of the number is : " + facto);
    }
}

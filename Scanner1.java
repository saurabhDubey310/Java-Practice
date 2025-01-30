import java.util.*;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = number1.nextInt();
        System.out.print("Enter number2: ");
        int num2 = number2.nextInt();

        int mul = num1*num2;

        System.out.print("multiplication of number1 and number2 : " + mul);
    }
}
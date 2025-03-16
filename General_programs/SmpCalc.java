import java.util.Scanner;

public class SmpCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers and operation
        System.out.println("Please enter the numbers for the operation:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // Perform the operation
        switch (op) {
            case '+':
                System.out.println("Addition of numbers: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of numbers: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of numbers: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division of numbers: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter one of +, -, *, /.");
                break;
        }

        sc.close(); // Close Scanner
    }
}

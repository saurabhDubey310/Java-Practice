import java.util.Scanner;
public class SmpCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers for operation : - ");
        System.out.print("a :- ");
        double a = sc.nextDouble();
        System.out.print("b : - ");
        double b = sc.nextDouble();
        System.out.print("operation : -  ");
        char op = sc.next().charAt(0);
        if(op == '+'||op == '-'||op == '*'||op == '/'){
            switch(op){
                case '+':
                    double sum = a + b;
                    System.out.println("Addition of numbers : "+ sum);
                    break;
                case '-':
                    double sub = a - b;
                    System.out.println("Subtraction of numbers : "+ sub);
                    break;
                case '*':
                    double mul = a * b;
                    System.out.println("Multiplication of numbers : "+ mul);
                    break;
                case '/':
                    if(b>0){
                        double div = a/b;
                        System.out.println("Division of numbers : "+ div);
                    }
                    else{
                        System.out.println("b cannot be zero.");
                    }
                    break;
                default:
                    System.out.println("Nothing");
                    break;
            }
        }
        else{
            System.out.println("Please enter a valid operations");
        }
    }
}
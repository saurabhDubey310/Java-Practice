public class Calculator {
    public static double add (double num1, double num2){
        return num1+num2;
    }
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    public static double mul(double num1, double num2){
        return  num1 * num2;
    }
    public static void main(String [] args){
        double Add = add(5,55);
        System.out.println("Addition of numbers: " + Add);
        double Mul = mul(5,55);
        System.out.println("Multiplication of numbers: " + Mul);
        double Sub = sub(5,55);
        System.out.println("Subtraction of numbers: " + Sub);
    }
}

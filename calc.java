public class calc {
  public static double add(double a, double b){
    return a + b;
}
public static double sub(double a, double b){
    return a - b;
}
public static double mul(double a, double b){
    return a*b;
}
public static double div(double a, double b){
    return a / b;
}
public static void main(String [] args){
    double Add = add(5,10);
    System.out.println("Addition:" + Add);
    double Sub = sub(55,10);
    System.out.println("Substraction:" + Sub);
    double Mul = mul(5,6);
    System.out.println("Multiplication:" + Mul);
    double Div = div(5,30);
    System.out.println("Division:" + Div);
  }
}

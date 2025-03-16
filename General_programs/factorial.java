import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int facto = 1;
        System.out.print("Please enter the number : ");
        int number = num.nextInt();
        while(number>=1){
           facto = facto*number;
           if(number == 2){
               System.out.print(number + " = " );
               break;
           }
            System.out.print(number + "*");
           number --;
        }
        System.out.println(facto);
        num.close();
    }
}



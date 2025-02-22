package datastructure;
public class palindrome {

    public static void main(String[] args) {

        int a=122,b,i;
        int j = String.valueOf(a).length();
        int c=0;
        for(i=1;i<=j;i++){
            b=a%10;
            a=a/10;

            c= (10*c) + b;
        }
        System.out.println(c);

    }
}

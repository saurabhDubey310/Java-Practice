package arraylistlinkedlist;
import java.util.ArrayList;
import java.util.*;

class testcases {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter index number between 0 to 4: ");
    int number = sc.nextInt();
    ArrayList<String> array = new ArrayList<>();
    array.add("LoginTest");
    array.add("SignupTest");
    array.add("Registrationtest");
    array.add("Logouttest");
    array.add("passwordtest");
    System.out.println("ArrayList: " + array);
    array.remove(number);
    System.out.println("ArrayList after removal of index " + number + ":" + array);
    sc.close();
  }
}
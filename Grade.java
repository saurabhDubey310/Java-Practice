public class Grade {
    public static void main(String [] args){

        int marks = 99;

                if((marks <= 100) && (marks > 90)){
                    System.out.println("Congratulations you got Distinction class");
                }else if ((marks <= 90) && (marks >= 70)) {
                    System.out.println("Congratulations you got First class");
                }else if ((marks <= 70) && (marks >= 50)){
                    System.out.println("You got Second Class. Work Hard! ");
                }else if ((marks <= 50) && (marks >= 33)) {
                    System.out.println("You just got Passed");
                }else if((marks < 33)){
                    System.out.println("You are fail");
                }else {
                    System.out.println("Invalid Marks");
                }
    }
}

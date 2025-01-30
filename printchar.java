public class printchar {
    public static void main(String [] args){
        String greetings = "saurabh";
        int greetlength = greetings.length();

        for(int i=0; i<greetlength; i++){
            System.out.println(greetings.charAt(i));
        }
    }
}

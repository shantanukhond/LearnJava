

public class LearnString {
    public static void main(String[] args) {
        String greeting = "Hello world!";


        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);


        //System.out.println("HELLO WORLD\nHELLO WORLD ");
        //System.out.println("HELLO WORLD\tHELLO WORLD ");
        // System.out.println("HELLO WORLD\bHELLO WORLD ");
        // System.out.println("HELLO WORLD\"HELLO WORLD ");
        // System.out.println("HELLO WORLD\'HELLO WORLD ");
        // System.out.println("HELLO WORLD\\HELLO WORLD ");
        System.out.println("HELLO WORLD\fHELLO WORLD ");
       
    }

}

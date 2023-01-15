package operators;

public class Ternary {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;


        String ans = num1>num2 ? "num1 is greater" : "num2 is greater";
        String ans1 = num1<num2 ? "num2 is greater" : "num1 is greater";
        
        System.out.println(ans); 
        System.out.println(ans1); 
        

    }
}

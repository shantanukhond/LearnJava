package operators;

public class Unary {
    public static void main(String[] args) {
        
        System.out.println("----------------------");
        int num1 = 30;
        System.out.println(" ++ num1  = " + (++num1));
        num1 = 30;


        System.out.println("----------------------");
        System.out.println(" -- num1  = " + (--num1));
        num1 = 30;

        
        System.out.println("----------------------");
        System.out.println(" num1 ++  = " + (num1 ++));
        System.out.println(" num1 PF+ = " + (num1));
        num1 = 30;
        
        System.out.println("----------------------");
        System.out.println(" num1 --  = " + (num1 --));
        System.out.println(" num1 PF- = " + (num1));
        num1 = 30;
        
        System.out.println("----------------------");
        

    }
}

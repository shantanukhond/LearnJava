package operators;

public class Logical {
    public static void main(String[] args) {
        boolean b1= true;

        System.out.println(" true &  false = " + ( true & false ) );
        System.out.println(" true |  false = " + ( true | false ) );
        System.out.println(" true ^  false = " + ( true ^ false ) );
        

        System.out.println(" true && false = " + ( true && false ) );
        System.out.println(" true || false = " + ( true || false ) );
        System.out.println("       ! false = " + ( ! false ) );
        

        System.out.println("   b1 &= false = " + ( b1 &= false ) );
        System.out.println("   b1 != false = " + ( b1 |= true ) );
        System.out.println("   b1 ^= false = " + ( b1 ^= false ) );
        
    }
}

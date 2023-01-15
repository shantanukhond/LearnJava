package operators;

public class Bitwise {
    public static void main(String[] args) {
        
        System.out.println(" 3 &  5 = " + ( 3 & 5 ) );
        /*
            0011
            0101
           ------
            0001   =   1
        */  

        System.out.println(" 3 |  5 = " + ( 3 | 5 ) );
        /*
            0011
            0101
           ------
            0111  =   7
        */  


        System.out.println(" 3 ^  5 = " + ( 3 ^ 5 ) );
        /*
            0011
            0101
           ------
            0110  =   6
        */  


        int num1 = 3;
        System.out.println(" 3 <<= 1 = " + ( num1 <<= 1 ) );
        /*
            0011 <<=1  = 0110
            
         */
        
    }
}

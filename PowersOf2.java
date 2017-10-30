// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;
 
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        //How many powers of 2 to compute
            int nextPowerOf2 = 1;        //Current power of  2
            int exponent;                //Exponent for current power of 2 -- this
                                         //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed?");
            numPowersOf2 = scan.nextInt();
                    
            System.out.println("Here are the first " + numPowersOf2 + " powers of 2");
            exponent = 0;
            
            int value;
            for(exponent = 0; exponent <= numPowersOf2; exponent++)
            {
                value = 2 ^ exponent;
                System.out.println("2^" + exponent + " = " + value);
            }
        }
}
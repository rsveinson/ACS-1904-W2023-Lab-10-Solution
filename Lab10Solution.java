import java.util.Scanner;
/** 
 * ACS-1904 Lab 10 Solution
 * @author: Sveinson
*/

public class Lab10Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digits = numberOfDigits(23498765);
        System.out.println("Number of digits: " + digits);
        
        // int x = 366;
        // int y = 60;
        int x = 3933;
        int y = 63;
        System.out.println(x + " % " + y + " = " + (x % y));
        System.out.print("the gcd of " + x + " and " + y + " is ");
        System.out.println(gcd(x, y));
        
        System.out.println("end of program");
    }
    
    public static int numberOfDigits(int n){
        if(n < 10)
            return 1;
        else
            return 1 + numberOfDigits(n / 10);
    }
    
    public static int gcd(int x, int y){
        if(x % y == 0)
            return y;
        else
            return gcd(y, x % y);
    }// end gcd
}

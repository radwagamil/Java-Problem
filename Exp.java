
package exp;

import java.util.Scanner;

public class Exp {


    public static void main(String[] args) {
        
        System.out.println("enter the number and exponentian");
        Scanner s = new Scanner (System.in);
        double a = s.nextDouble();
        double n = s.nextDouble();
        
        System.out.println(Exp(a,n));
       
    }
    
    public static double Exp (double x, double n){
        
        double result = 1;
        for (int i = 0 ; i < n ; i++){
            
            result = result * x; 
            
        }
        return result;
    }
    
}

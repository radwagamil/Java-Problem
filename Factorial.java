
package factorial;

public class Factorial {

    public static void main(String[] args) {
       
         System.out.println(factorial(5));
        
    }
    
    public static double factorial (double number) {
        double result = 1;
        for (int i =1; i <= number; i++) {
            result = result * i;
            
        }
        return result;
    }
    
}


package myexp;

public class Myexp {

    public static void main(String[] args) {
        
        System.out.println(myExp(1,10));

        
    }
    
    public static double factorial (double number) {
        double result = 1;
        for (int i =1; i <= number; i++) {
            result = result * i;
            
        }
        return result;
    }

        public static double Exp (double x, double n){
        
        double result = 1;
        for (int i = 0 ; i < n ; i++){
            
            result = result * x; 
            
        }
        return result;
    }
        
       public static double myExp(double x, double n) {
        double result = 1;
        for (int i =1; i <= n; i++)
        {
            result = result + (Exp(x, i)/ factorial(i));
        }
        return result;
        
 
    
}
}

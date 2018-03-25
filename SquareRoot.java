
package squareroot;

public class SquareRoot {

    public static void main(String[] args) {
     
        System.out.println(squareRoot(9));
    }
    
    public static double squareRoot(double a) {
        
        double guess = a/2;
    double improve = (guess + (a/guess))/2;

    while (Math.abs((guess - improve)) > 0.0001){
        guess = improve;
        improve = (guess + (a/guess))/2;
    }
    return improve;
 }
 
}
    


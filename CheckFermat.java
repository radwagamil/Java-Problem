
package checkfermat;

public class CheckFermat {

    public static void main(String[] args) {
        
        checkFermat(2,9,3,7);
       
    }
    
        public static void checkFermat(double a, double b, double c, int n) {
        if (n > 2 && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
            System.out.println("Holy smokes, Fermat was wrong!");
        }else {
            System.out.println("No, that doesn't work.");
        }
    }
}

    


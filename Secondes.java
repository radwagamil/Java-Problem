package secondes;
import java.util.Scanner;
public class Secondes {

    public static void main(String[] args) {
        
        System.out.print("enter seconds: ");
        
        Scanner in = new Scanner(System.in); 
        int seconds = in.nextInt(); 
        int a = seconds % 60;
        int b = seconds / 60;
        int c = b % 60;
            b = b /60 ;
        
        System.out.println(seconds+ " second = " +b+ " hours, " +c+ " minutes, " +a+ " seconds ");
            
    }
    
}

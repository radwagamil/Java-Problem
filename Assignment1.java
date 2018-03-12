
package assignment1;

import java.util.Scanner;

public class Assignment1 {

    
    public static void main(String[] args) {
        
        int a, b, c;
       
        
        System.out.println(" Please enter 2 different numbers\n");
        
        Scanner s = new Scanner (System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        
        System.out.println("addition result is: " + (a+b+c));
        System.out.println("multiplication result is: " + (a*b*c));
        
        
        
        
        
    }
    
}

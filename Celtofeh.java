
package celtofeh;

import java.util.Scanner;


public class Celtofeh {

    
    public static void main(String[] args) {
        
        double c, f;
        
        System.out.println("enter the Celsius degree\n");
        
        Scanner s = new Scanner (System.in);
        c = s.nextDouble();
        
        f = c * 9/5 +32;
        
        System.out.println(c+ "c = " +f+"f");

    }
    }
    
}

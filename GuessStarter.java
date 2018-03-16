
package guessstarter;

import java.util.Scanner;
import java.util.Random;

public class GuessStarter {

 
    public static void main(String[] args) {
        
        int x;
        
        System.out.println("I'm thinking of a number between 1 and 100\n" +
                           "(including both). Can you guess what it is? \n");
        
         System.out.println("Type a number: ");
        
         
         Scanner s = new Scanner (System.in);
          int num = s.nextInt();
          
          System.out.println("Your guess is: " +num);
         
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " +number);
        
        if (num > number){
            
            x = num - number;
        }
        else{
            
            x = number - num;
        }
        
        System.out.println("You were off by: " +x);
        
    }
    
}

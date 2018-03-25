
package guessstarter;

import java.util.Scanner;
import java.util.Random;

public class GuessStarter {

 
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
          
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " +number);
        
        int flag = 0;
        while (flag == 0){
            
             System.out.println("Your guess is: " );
             int num = s.nextInt();
             
             if (num == number){
                 flag = 1;
             }
             else if (num > number){
                 
                System.out.println("Your guess is bigger, try again : " );
                 
             } else {
                 System.out.println("Your guess is smaller, try again : " );
             }
        }
        
        
        
        System.out.println("you got it right");
        
    }
    
}

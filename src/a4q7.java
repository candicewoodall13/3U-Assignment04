
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input= new Scanner(System.in);
        //get computer to ask user what the cost of food for prom is
        System.out.println("Enter the speed limit:");
        //let user answer 
        int limit = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int speed = input.nextInt();
        //calculate fine
        int excess = speed-limit;
        //if statement to determie fine
        if(excess<0)
        {
          System.out.println("Congratulations, you are within the speed limit!");
        } 
        else if(excess<21)
          {
                  System.out.println("You are speeding and your fine is $100");
          }
          else if(excess<31)
                  {
                   System.out.println("You are speeding and your fine is $270");
                  }
                   else
                      {
                      System.out.println("You are speeding and your fine is $500");
                      }
                      
                  
        
        
        

              
        
        
        
    }
}

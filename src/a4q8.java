
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input= new Scanner(System.in);
        //create variables for square and roll
        int square = 1;
        int roll= 0;
        
        
        //loop forever
        while(square<100)
        {
            
        //ask user for sum of dice
        System.out.println("Enter sum of dice ");
        //get input from user
        roll = input.nextInt();
        //move to the right square
        square= square+roll;

            switch(square)
            {
                case 9: 
                    square=34;
                    break;
                case 40: 
                    square=64;
                    break;
                case 54: 
                    square=19;
                    break;
                case 67: 
                    square=86;
                    break;
                case 90: 
                    square=48;
                    break;
                case 99:
                    square=77;
                    break;
            }
            System.out.println("You are now on square " +square);
        }
        //when square=100 print you win 
        System.out.println("You Win!");
    }
}

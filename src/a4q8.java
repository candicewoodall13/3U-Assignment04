
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
        while(square<101)
        {
            
        //ask user for sum of dice
        System.out.println("Enter sum of dice ");
        //get input from user
        roll = input.nextInt();
        //move to the right square
        square= square+roll;

            
            /*switch(square){
                case: 29;
                    square=34
                            */
            System.out.println("You are now on square " +square);
        }
    }
}

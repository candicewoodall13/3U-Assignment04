
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input= new Scanner(System.in);
        //get computer to ask user what the cost of food for prom is
        System.out.println("How much does the food for prom cost?");
        //let user answer
        double food = input.nextDouble();
        //get computer to ask user what the cost of the DJ for prom is
        System.out.println("How much does the DJ for prom cost?");
        //let user answer
        double dj = input.nextDouble();
        //get computer to ask user what the cost of the hall for prom is
        System.out.println("How much does it cost to rent the hall?");
        //let user answer
        double hall = input.nextDouble();
        //get computer to ask user what the cost of the decorations for prom is
        System.out.println("How much do the decorations cost?");
        //let user answer
        double decorations = input.nextDouble();
        //get computer to ask user what the cost of staff for prom is
        System.out.println("How much does it cost for staff?");
        //let user answer
        double staff = input.nextDouble();
        //get computer to ask user what the cost of the decorations for prom is
        System.out.println("How much for miscellaneous costs?");
        //let user answer
        double misc = input.nextDouble();
        //add up all the cots of doubles o find total expenses.
        double total = misc + staff + decorations + hall + dj + food;
        //double total= math.ceil(total);
        double tickets = (Math.ceil(total/35));
        System.out.println("The total cost is $" + total + ". You will need to sell " + tickets + " tickets.");
        
        
        
        
    }
}

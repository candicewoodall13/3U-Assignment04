
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for the measurement in inches they would like to convert
        System.out.println("please enter the measurement in inches you wish to convert to cm.");
        //let the user answer
        int inches = input.nextInt();
        //make the answer they put in multiply by 2.54 and then supply them with the answer
        System.out.println( inches+ "inches is the same as" + inches*2.54 + "cm" );
    }
}

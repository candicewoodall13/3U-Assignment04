
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for the measurement in inches they would like to convert
        System.out.println("please enter 4 numbers on seperate lines");
        //let the user answer
        double Firstnumber = input.nextDouble();
        double Secondnumber = input.nextDouble();
        double Thirdnumber = input.nextDouble();
        double Fourthnumber = input.nextDouble();
        //
        System.out.println("Your numbers were " + Firstnumber +", " + Secondnumber +", " + Thirdnumber + ", and " + Fourthnumber );
        
    }
}

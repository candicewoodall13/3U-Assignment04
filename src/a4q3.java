
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
        int Firstnumber = input.nextInt();
        int Secondnumber = input.nextInt();
        int Thirdnumber = input.nextInt();
        int Fourthnumber = input.nextInt();
        //
        System.out.println(Firstnumber +", " + Secondnumber +", " + Thirdnumber + ", " + Fourthnumber );
    }
}

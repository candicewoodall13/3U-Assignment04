
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input= new Scanner(System.in);
        //ask user for their name
        System.out.println("Please enter your name");
        //get the name from the user
        String name = input.nextLine();
        //answer and greet user
        System.out.println("Hello " + name + ". How are you today?");
    }
}

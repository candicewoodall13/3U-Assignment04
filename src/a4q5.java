
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q5 {

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
        //ask user what first test mark was out of
        System.out.println("What was the first test mark out of?");
        //let user answer
        double firstoutof = input.nextDouble();
        //ask user what his first test mark was
        System.out.println("What mark did you get on your first test?");
        //let user answer
        double firstmark = input.nextDouble();
        //
        //ask user what second test mark was out of
        System.out.println("What was the second test mark out of?");
        //let user answer
        double secondoutof = input.nextDouble();
        //ask user what his first test mark was
        System.out.println("What mark did you get on your second test?");
        //let user answer
        double secondmark = input.nextDouble();
        //
        //ask user what third test mark was out of
        System.out.println("What was the third test mark out of?");
        //let user answer
        double thirdoutof = input.nextDouble();
        //ask user what his third test mark was
        System.out.println("What mark did you get on your third test?");
        //let user answer
        double thirdmark = input.nextDouble();
        //
        //ask user what fourth test mark was out of
        System.out.println("What was the fourth test mark out of?");
        //let user answer
        double fourthoutof = input.nextDouble();
        //ask user what his fourth test mark was
        System.out.println("What mark did you get on your fourth test?");
        //let user answer
        double fourthmark = input.nextDouble();
        //
        //ask user what fifth test mark was out of
        System.out.println("What was the fifth test mark out of?");
        //let user answer
        double fifthoutof = input.nextDouble();
        //ask user what his first test mark was
        System.out.println("What mark did you get on your fifth test?");
        //let user answer
        double fifthmark = input.nextDouble();
        //
        //print test scores for user
        System.out.println("Test scores for" +name);
        //create variable of first test percentage
        double firsttest = ((firstmark/firstoutof)*100);
        System.out.println("Test 1: " + firsttest + "%" );
        
        
    }
}

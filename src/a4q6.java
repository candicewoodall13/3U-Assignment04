
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a4q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for the measurement in inches they would like to convert
        System.out.println("number of daytime minutes? ");
        //let the user answer
        int dmins = input.nextInt();
        System.out.println("number of evening minutes? ");
        int emins = input.nextInt();
        System.out.println("number of weekend minutes? ");
        int wmins = input.nextInt();
        int daytimeA = (dmins-100);
        if(daytimeA<0)
        {
            daytimeA=0;
        }
        double A = (daytimeA*0.25)+ (emins*0.15)+(wmins*0.2);
        int daytimeB = (dmins-250);
        if(daytimeB<0)
        {
            daytimeB=0;
        }
        double B = (daytimeB*0.45)+(emins*0.35)+(wmins*0.25);
        //print price of plan A
        System.out.println("Plan A is "+A+"$");
        //print price of plan B
        System.out.println("Plan B is "+B+"$");
        if(A<B)
        {
            System.out.println("Plan A is the cheapest.");
            
        }
        else
        {
            if(B<A)
            {
                System.out.println("Plan B is the cheapest.");
            }
            else
            {
                System.out.println("Plaan A and Plan B are the same.");
            }
        }
    }
}

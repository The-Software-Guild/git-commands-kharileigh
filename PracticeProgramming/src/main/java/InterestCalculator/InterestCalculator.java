/**
 *
 * @author kharileigh
 * Interest Calculator
 * Instructions :
 * write an interest calculator that works as described below
 * John has %500 to invest. Sue knows of a mutual fund plan that pays 10% interest annually, compounded quarterly.
 * That is, every 3 months, the principal is multiplied by 2.5% (10% annual rate divided by 4)
 * Result is added to principal
 */

package InterestCalculator;

// IMPORT SCANNER TO RECEIVE USER INPUTS
import java.util.Scanner;

public class InterestCalculator {
    
    public static void main(String[] args) {
        
        // DECLARE VARIABLES
        int initialPrincipal;
        int numOfYears;
        int annualInterestRate;
        double quarterlyInterestRate = 2.5;
        double interest;
        double year1Return = 0.0;
        double year2Return = 0.0;
        double year3Return = 0.0;
        
        
        // INITIALISE SCANNER
        Scanner input = new Scanner(System.in);
        
        // GET INPUTS FOR CALCULATIONS
        System.out.print("How much do you want to invest? \n");
        initialPrincipal = Integer.parseInt(input.next());
        
        System.out.print("How many years are you investing? \n");
        numOfYears = Integer.parseInt(input.next());
        
        System.out.print("What is the annual interest rate % growth? \n");
        annualInterestRate = Integer.parseInt(input.next());
        
        
        // CALCULATE QUARTERLY INTEREST
        interest = initialPrincipal * (1 + quarterlyInterestRate / 100);
        
        
        // PRINT RESULTS TO USER
        for(int i = 1; i <= numOfYears; i++) {
            year1Return = initialPrincipal + (interest * 4);
            year2Return = year1Return + (interest * 4);
            year3Return = year2Return + (interest * 4);
        }
        
        System.out.println("\n Calculating...");
        System.out.println("Year 1: ");
        System.out.println("Began with " + "$" + initialPrincipal);
        System.out.println("Earned " + "$" + (year1Return - initialPrincipal));
        System.out.println("Ended with " + "$" + year1Return);
        
        System.out.println("\n Year 2: ");
        System.out.println("Began with " + "$" + year1Return);
        System.out.println("Earned " + "$" + (year2Return - year1Return));
        System.out.println("Ended with " + "$" + year2Return);
        
        System.out.println("\n Year 3: ");
        System.out.println("Began with " + "$" + year2Return);
        System.out.println("Earned " + "$" + (year3Return - year2Return));
        System.out.println("Ended with " + "$" + year3Return);
    }
    
}

/**
 *
 * @author kharileigh
 * Factorizer
 * Program that receives an integer value from a user and then calculates & prints out a list that includes all of the factors of that number.
 * - whether or not the number is perfect, and whether or not the number is prime
 * - perfect number : where all the factors of the number, excluding the number itself add up to that number
 * - prime number : number greater than 1 that has only itself and 1 as factors
 */

package Factorizer;

// IMPORT SCANNER
import java.util.Scanner;

public class Factorizer {
    
    public static void main(String[] args) {
        
        // DELCARE VARIABLES 
        int userNum;
        
        // INITIALISE SCANNER 
        Scanner input = new Scanner(System.in);
        
        // ASK USER FOR A NUMBER 
        System.out.print("What number would you like to factor? ");
        userNum = Integer.parseInt(input.next());
        
        
        getFactors(userNum);
        checkPerfectNum(userNum);
        checkPrimeNum(userNum);
       
    }
    
     // METHOD TO GET FACTORS 
    public static void getFactors(int num) {
        // counter to keep track of number of factors
        int factors = 0;
        System.out.println("The factors of " + num + " are: ");
        
        for(int i = 1; i <= num; ++i) {
            if(num % i == 0) {
                factors += 1;
                System.out.print(i + " ");
            }            
        }
        System.out.println("\n" + num + " has " + factors + " factors.");

    }
    
     // METHOD TO CALCULATE PERFECT NUMBER
    public static void checkPerfectNum(int num) {
        
        int divisorSum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorSum += 1;
            }
        }
        
        if (divisorSum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is NOT a perfect number.");
        }
    }
    

    // METHOD TO CALCULATE PRIME NUMBER - only divisible by 2 number : 1 and itself
    public static void checkPrimeNum(int num) {
        
        boolean isNumPrime = false;
        for(int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isNumPrime = true;
                break;
            }
            ++i;
        }
        if(!isNumPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    
    }

    
}
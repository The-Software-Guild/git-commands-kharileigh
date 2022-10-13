/**
 *
 * @author kharileigh
 * Game of Lucky Sevens where a virtual pair of dice is rolled.
 * If sum of two dice is equal to 7, players wins $4 otherwise loses $1
 *
 */

package LuckySevens;

// IMPORT SCANNER & RANDOM
import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main (String[] args) {
        
        // DICE VARIABLES
        int die1;
        int die2;
        
        // PLAYER'S INITIAL MONEY & INPUT
        String inputDollars;
        int playerDollars;
        
        // PLAYER'S MAX MONEY & WINS
        int playerMaxDollars;
        int playerMaxWins; 
        
        // COUNTER TO KEEP TRACK OF AMOUNT OF TIME DICE ROLLED 
        int count = 0; 
        int countAtMax = 0;
        
        // INITIALISE RANDOM & SCANNER
        Random diceRoll = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        // ASK USER HOW MUCH MONEY TO BET
        System.out.println("How much money do you have to bet?");
        inputDollars = myScanner.nextLine();
        playerDollars = Integer.parseInt(inputDollars);
        playerMaxDollars = playerDollars;
        
        // DICE ROLLS REPEATEDLY UNTIL MONEY IS GONE
        while (playerDollars > 0) {
            
            // KEEPING TRACK OF HOW MANY ROLLS
            count++;
            
            // ROLL DICE CALLING RANDOM METHOD (numbers : 1-6)
            //die1 = diceRoll.nextInt(7) + 1; 
            //die2 = diceRoll.nextInt(7) + 1;
            for (int i = 1; i <= 6; i++) {
                die1 = diceRoll.nextInt(7);
                die2 = diceRoll.nextInt(7);
                System.out.print(die1 + "" + die2);
            
                // PLAYERS WINS & LOSSES
                if (die1 + die2 == 7) {
                    playerDollars += 4;
                } else {
                    playerDollars -= 1;
                }
                
                // IF PLAYER IS WINNING, NEW MAX AMOUNT & COUNT
                if (playerDollars > playerMaxDollars) {
                    playerMaxDollars = playerDollars;
                    countAtMax = count;
                }
            }
            
        System.out.println("You are broke after " + count + " rolls");
        System.err.println("You should have quit after " + countAtMax + " when you had "  + "$" + playerDollars);
        }
         
    }
}

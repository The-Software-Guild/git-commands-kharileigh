/**
 *
 * @author kharileigh
 * Rock, Paper, Scissors game
 * Each player chooses Rock, Paper or Scissors
 * If both players chooses same thing, round is a tie
 * Otherwise: Paper wraps Rock to win, Scissors cut Paper to win, Rock breaks Scissors to win
 */

package Assessment;

// IMPORT SCANNER & RANDOM
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    
    public static void main(String[] args) {
    
        // TO ALLOW PLAYER TO RESTART GAME
        boolean game = true;

        // INDENTIFY PLAYER, COMPUTER AND THEIR RESPECTIVE MOVES
        String playerMove = "";
        String computerMove = "";
        String rock = "ROCK";
        String paper = "PAPER";
        String scissors = "SCISSORS";
        String playerAnswer;
        String no = "NO";

        // COUNTER - TRACKING WINS, TIES, NUMBER OF ROUNDS PLAYED
        int counter = 0;
        int computerNum;
        String playerRounds;
        int numOfRounds = 0;
        int numOfPlayerRounds;
        int numOfTies = 0;
        int numOfPlayerWins = 0;
        int numOfComputerWins = 0;

        // INITIALISE RANDOM & SCANNER
        Random randomNum = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        // ASK USER HOW MANY ROUNDS THEY WANT TO PLAY (max 10, min 1)
        System.out.println("How many rounds do you want to play?");
        playerRounds = myScanner.nextLine();
        numOfPlayerRounds = Integer.parseInt(playerRounds);
        
        // ENSURING 
        if(numOfPlayerRounds < 1 || numOfPlayerRounds > 10) {
            System.out.println("Please select a number between 1-10");
        }

        // ROCK, PAPER, SCISSORS GAME 
        // run as long as game is true and count is equal to or less than 10
        while(game && counter <= 10) {
            
            counter++;
            
            // ASK USER TO CHOOSE THEIR MOVE
            System.out.println("Please choose your first move: ");
            System.out.println(rock);
            System.out.println(paper);
            System.out.println(scissors);
            playerMove = myScanner.nextLine();
            
            // COMPUTER MOVE RANDOMNLY GENERATED - converts integer to string
            for (int i = 1; i <= 3; i++) {
                computerNum = randomNum.nextInt(4);
                computerMove = String.valueOf(computerNum);
                
                switch (computerMove) {
                    case "1":
                        System.out.println(rock);
                        break;
                    case "2":
                        System.out.println(paper);
                        break;
                    default:
                        System.out.println(scissors);
                        break;
                }
            }
            
            // DETERMINE WINS, LOSSES, TIE
            if(playerMove.equals(computerMove)){
                numOfTies++;
                System.out.println("TIE");
            } else if (playerMove.equals(paper) && computerMove.equals(rock)) {
                numOfPlayerWins++;
                System.out.println("PLAYER WINS ROUND");
            } else if (computerMove.equals(paper) && playerMove.equals(rock)) {
                numOfComputerWins++;
                System.out.println("COMPUTER WINS ROUND");
            } else if (playerMove.equals(scissors) && computerMove.equals(paper)) {
                numOfPlayerWins++;
                System.out.println("PLAYER WINS ROUND"); 
            } else if (computerMove.equals(scissors) && playerMove.equals(paper)) {
                numOfComputerWins++;
                System.out.println("COMPUTER WINS ROUND");
            } else if (playerMove.equals(rock) && computerMove.equals(scissors)) {
                numOfPlayerWins++;
                System.out.println("PLAYER WINS ROUND");
            } else if (computerMove.equals(rock) && playerMove.equals(scissors)) {
                numOfComputerWins++;
                System.out.println("COMPUTER WINS ROUND");
            }

        }
        
        // CALCULATE OVERAL WINS, LOSSES, TIES
        if(numOfPlayerWins > numOfComputerWins) {
            System.out.println("Well done! You beat the computer with " + numOfPlayerWins + numOfRounds + " rounds");
        } else if (numOfComputerWins > numOfPlayerWins) {
            System.out.println("BOO-HOO! You lost to a silly computer! It won by " + numOfComputerWins + " by" + numOfRounds + " rounds");
        } else {
            System.out.println("IT's A TIE!");
        }
        
        // ASK PLAYER IF THEY WOULD LIKE TO PLAY AGAIN
        System.out.println("Wanna play another game?");
        playerAnswer = myScanner.nextLine();
    
        if (playerAnswer.equals(no)) {
            game = false;
            System.out.println("Thanks for playing! See you next time!");
        } else {
            System.out.println("Game will start over now....");
        }
    }
    
}

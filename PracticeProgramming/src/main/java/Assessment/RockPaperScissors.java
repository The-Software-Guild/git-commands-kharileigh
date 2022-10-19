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
        
        // DECLARE ALL VARIABLES - counter for rounds, user wins & computer wins
        
        boolean game;
        int userWins = 0;
        int compWins = 0;
        int tiesWins = 0;
        
        // INTIALISE SCANNER (for user's choice of play) & RANDOM (computer's random choice of play)
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        
        
        // WHILE LOOP - break down of game
        do {
            
            // INTRODUCE USER TO GAME 
            System.out.println("\n LET'S PLAY ROCK, PAPER, SCISSORS!");
            System.out.println("How many rounds would you like to play?");
            
            int rounds = userInput.nextInt();
            
            if (rounds < 1 || rounds > 10) {
                System.out.println("\n Please enter a number between 1-10.");
                break;
            }
         
            // BREAKDOWN OF GAME
            // start count
            for (int i = 1; i <= rounds; i++) {
            
                System.out.println("\n Round " + i + ": " + "1 for ROCK, 2 for PAPER, 3 for SCISSORS");
                
                // USER'S PLAY - use switch statement for user to select
                int userPlay = userInput.nextInt();
                switch(userPlay) {
                    
                    case 1:
                        userPlay = 1;
                        System.out.println("Your play: ROCK");
                        break;
                    case 2:
                        userPlay = 2;
                        System.out.println("Your play: PAPER");
                        break;
                    case 3:
                        userPlay = 3;
                        System.out.println("Your play: SCISSORS");
                        break;
                }
                
                // TO CHECK USER ENTERS ONLY CHOICES AVAILABLE
                if(userPlay == 1 || userPlay == 2 || userPlay == 3) {
                } else {
                    System.out.println("\n PLEASE ENTER A NUMBER BETWEEN 1-3!");
                }
                
                // COMPUTER'S PLAY - use switch statement to assign randomnly selected number between 1-3 to a play
                int compPlay = rand.nextInt(3) + 1;
                switch (compPlay) {
                
                    case 1:
                        compPlay = 1;
                        System.out.println("Computer's play: ROCK");
                        break;
                    case 2:
                        compPlay = 2;
                        System.out.println("Computer's play: PAPER");
                        break;
                    case 3:
                        System.out.println("Computer's play: SCISSORS");
                        break;
                }
                
                // RULES OF THE GAME - wins, ties
                // ties :
                if (userPlay == 1 && compPlay == 1) {
                    System.out.println("\n IT'S A TIE!");
                    tiesWins++;
                }
                if (userPlay == 2 && compPlay == 2) {
                    System.out.println("\n IT'S A TIE!");
                    tiesWins++;
                }
                if (userPlay == 3 && compPlay == 3) {
                    System.out.println("\n IT'S A TIE!");
                    tiesWins++;
                }
                
                // user wins:
                if(userPlay == 2 && compPlay == 1) {
                    System.out.println("\n YOU WON THE ROUND!");
                    userWins++;
                }
                if (userPlay == 3 && compPlay == 2) {
                    System.out.println("\n YOU WON THE ROUND!");
                    userWins++;
                }
                if (userPlay == 1 && compPlay == 3) {
                    System.out.println("\n YOU WON THE ROUND!");
                    userWins++;
                }
                
                // computer wins: 
                if (compPlay == 2 && userPlay == 1) {
                    System.out.println("\n BOOHOO! COMPUTER WON!");
                    compWins++;
                }
                if (compPlay == 3 && userPlay == 2) {
                    System.out.println("\nUNLUCKY! COMPUTER WON!");
                    compWins++;
                }
                if (compPlay == 1 && userPlay == 3) {
                    System.out.println("\n YOU LOSE! COMPUTER WON!");
                    compWins++;
                }
            
            }
            
            // PRINT STATS TO USER
            System.out.println("\n HERE ARE THE FINAL SCORES: ");
            System.out.println("\n Your won " + userWins + " rounds.");
            System.out.println("\n Computer won " + compWins + " rounds.");
            System.out.println("\n There was " + tiesWins + " ties in total.");
            
            if (userWins > compWins) {
                System.out.println("\n CONGRATS YOU WON THE GAME!");
            }
            if (compWins > userWins) {
                System.out.println("\n BETTER LUCK NEXT TIME! COMPUTER WON THE GAME!");
            }
            if (userWins == compWins) {
                System.out.println("\n NO WINNER! IT'S A TIE!");
            }
            
            // ASK USER IF THEY WANT TO PLAY ANOTHER GAME
            System.out.println("\n Would you like to play another game?");
            System.out.println("'YES' or 'NO'?");
            Scanner userAnswer = new Scanner(System.in);
            String userReplay = userAnswer.nextLine();

            if ("NO".equals(userReplay)) {
                game = false;
                System.out.println("\n THANKS FOR PLAYING!");
            } else {
                game = true;
            }
        
           
        } while(game = true);
        
        

        
    }
    
}

/**
 *
 * @author kharileigh
 * Create a new program with the code that follows :
 */

package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        while (timeNow < bedTime) {
            
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiittle longer....");
            
            timeNow++; // TIME PASSES
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed... ");
    }
    
}

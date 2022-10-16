/**
 *
 * @author kharileigh
 * For And Twenty Blackbirds
 * Use code below, making sure it works as expected then answer questions that follow
 * - change so loop counts to more traditional 24 birds
 * update bird number printouts so count is from 1- 24
 */

package com.sg.foundations.fors;


public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        
        int birdsInPie = 0;
        
        // CHANGED INITIALISATION & TERMINATION VALUE
        for (int i = 1; i < 25; i ++) {
        
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
    
}

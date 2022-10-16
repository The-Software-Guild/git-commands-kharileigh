/**
 *
 * @author kharileigh
 * Hidden Nuts
 * Instructions : use code snippet as base, iterate through and print to screen
 */

package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

public class HiddenNuts {
    
    public static void main(String[] args) {
      
        
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Numbers";
        
        System.out.println("The nut has been hidden...");
        
        // TO BE FIXED SO INTEGER 42 PRINTS IN CONSOLE
        System.out.println("Found it! It's in spot #" + hidingSpots[41]);
    }
}

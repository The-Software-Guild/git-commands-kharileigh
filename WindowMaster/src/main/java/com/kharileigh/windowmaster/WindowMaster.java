
/**
 * @author kharileigh
 * Code-Along Exercise : WindowMaster
 */

package com.kharileigh.windowmaster;

// IMPORT SCANNER 
import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        
        // DECLARE & INITALIZE ALL NECESSARY VARIABLES :
        // Declare variables for height and width
        float height;
        float width;
        
        // Declare String variables to hold the user's height & width input
        String stringHeight;
        String stringWidth;
        
        // Declare final variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // ACCEPT USER INPUT :
        // Declare & initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Get input from user for height & width
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        // CONVERTING STRING VALUES OF HEIGHT & WIDTH TO FLOAT VALUES USING parse
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // CALCULATING THE AREA & PERIMETER OF WINDOW AREA
        // Formula to calculatea are of window
        areaOfWindow = height * width;
        
        // Formula for trim is twice the height plus twice the width
        perimeterOfWindow = 2 * (height + width);
        
        // CALCULATE THE TOTAL COST - USE A HARD-CODED VALUE
        // For material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        // DISPLAY THE RESULTS TO THE USER
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}

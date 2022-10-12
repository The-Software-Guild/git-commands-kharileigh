
/**
 *
 * @author kharileigh
 * Practice if/else structure
 */

package com.sg.foundations.flowcontrol.ifs;


public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships) {
            System.out.println("Vroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
          // Prints if cows are equal to spaceships
        if(cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
         
          // Prints if cows are not equal to spaceships, but actually MORE than it
        } else if(cows > spaceships) {
            System.out.println("Dang it! I don't know how we're going to fit all these cows in here!");
        
          // Prints if aliens are more than cows
        } else if (aliens > cows) {
            System.out.println("Hamburger party on Alpha Centauri!");
        
          // If this last else block were removed, it doesn't handle other potential conditions
          // e.g. if cows were less than spaceships
        } else {
            System.out.println("Too many ships! Not enough cows");
        }
    }
}

/**
 *
 * @author kharileigh
 * Fruit Salad
 * Instructions :
 * as much berry as possible
 * NO MORE THAN 3 kinds of apples
 * NO MORE THAN 2 kinds of orange
 * NO TOMATOES
 * NO MORE THAN 12 KINDS OF FRUITS
 */

package com.sg.foundations.flowcontrol.arrays;

//IMPORT 
import java.util.*;

public class FruitSalad {
    
    public static void main(String[] args) {
        
        /* NEED TO FIX AS PRINTING INCORRECT OUTPUT
        
        int apples = 0;
        int oranges = 0;
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        // NEW ARRAY CONTAINING MAX 12 FRUITS
        String[] fruitSalad = new String[12];
        
        // 1ST : FOR LOOP - iterating through fruitSalad array
        for (int i = 0; i < fruitSalad.length; i++) {
        
            // 2nd : DO WHILE LOOP - do the following for fruit salad 
            do {
            
                // 3rd : IF BLOCK - setting constraints for each fruit
                // IF CURRENT ITERATION IS A BERRY, ADD TO FRUIT SALAD
                if (fruit [i].contains("berry")) {
                    fruitSalad[i] = fruit[i];
                    
                 // IF CURRENT ITERATION IS APPLE, ADD UP TO 3
                } else if (fruit[i].contains("Apple")) {
                    if (apples < 3) {
                        fruitSalad[i] = fruit[i];
                        apples += 2;
                    }
               
                  // IF CURRENT ITERATION IS ORANGE, ADD UP TO 2
                } else if (fruit[i].contains("Orange")) {
                    if (oranges < 2) {
                        fruitSalad[i] = fruit[i];
                        oranges += 1;
                    }
                  
                  // DO NOT ADD TOMATO TO FRUIT SALAD
                } else if (!fruit[i].contains("Tomato")) {
                    fruitSalad[i] = fruit[i];
                }
            
            } while (fruitSalad.length < 12); 
        
        }
        
        System.out.println("Here are all the lovely fruit in my scrumption fruit salad " + Arrays.toString(fruitSalad));
    }
    
}

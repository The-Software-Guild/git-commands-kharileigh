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
        
        int apples = 0;
        int oranges = 0;
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        // NEW ARRAY CONTAINING MAX 12 FRUITS
        String[] fruitSalad = new String[12];
        
        // 1ST : FOR LOOP - iterating through fruitSalad array
        for (int i = 0; i < fruitSalad.length; i++) {
        
            // 2nd : DO WHILE LOOP - do the following for fruit salad 
            do {
               
                
            } while (fruitSalad.length < 12); 
        
        }
        
        System.out.println("Here are all the lovely fruit in my scrumption fruit salad " + Arrays.toString(fruitSalad));
    }
    
}


/**
 *
 * @author kharileigh
 * Lookup application - Users enters one value then a specific value is returned from a list based on the input.
 * [Ask user for a month number, return corresponding month and birthstone.
 */

package com.sg.foundations.flowcontrol.ifs;

// IMPORT SCANNER
import java.util.Scanner;

public class BirthStones {
    
    public static void main(String[] args) {
        
        // Declare all numbers in variables both integer and string data types
        int birthMonth;
        int january, february, march, april, may, june, july, august, september, october, november, december;
        String janBirthstone, febBirthstone, marBirthstone, aprBirthstone, mayBirthstone, junBirthstone, julBirthstone, augBirthstone, sepBirthstone, octBirthstone, novBirthstone, decBirthstone;
        
        // Give integer values
        january = 1;
        february = 2;
        march = 3;
        april = 4;
        may = 5;
        june = 6;
        july = 7;
        august = 8;
        september = 9;
        october = 10;
        november = 11;
        december = 12;
            
        // Give string values
        janBirthstone = "Garnet";
        febBirthstone = "Amethyst";
        marBirthstone = "Aquamarine";
        aprBirthstone = "Diamond";
        mayBirthstone = "Emerald";
        junBirthstone = "Pearl";
        julBirthstone = "Ruby";
        augBirthstone = "Peridot";
        sepBirthstone = "Sapphire";
        octBirthstone = "Opal";
        novBirthstone = "Topaz";
        decBirthstone = "Turquoise";
       
        // Declare variable to hold user's input
        String stringUserBirthMonth;
        
        // Declare & initialise Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask for user to input a number
        System.out.println("Please enter a number to find out your birthstone:");
        stringUserBirthMonth = myScanner.nextLine();
        
        // Parse user input to integer
        birthMonth = Integer.parseInt(stringUserBirthMonth);
        
        // If-Else Statement to match month with corresponding birthstone.
        if(birthMonth == 1) {
            System.out.println("January's birthstone is " + janBirthstone);
        } 
        
        if(birthMonth == 2) {
            System.out.println("February's birthstone is " + febBirthstone);
        } 
        
        if(birthMonth == 3) {
            System.out.println("March's birthstone is " + marBirthstone);
        } 
        
        if(birthMonth == 4) {
            System.out.println("April's birthstone is " + aprBirthstone);
        } 
        
        if(birthMonth == 5) {
            System.out.println("May's birthstone is " + mayBirthstone);
        } 
        
        if(birthMonth == 6) {
            System.out.println("June's birthstone is " + junBirthstone);
        } 
        
        if(birthMonth == 7) {
            System.out.println("July's birthstone is " + julBirthstone);
        } 
        
        if(birthMonth == 8) {
            System.out.println("August's birthstone is " + augBirthstone);
        } 
        
        if(birthMonth == 9) {
            System.out.println("September's birthstone is " + sepBirthstone);
        } 
        
        if(birthMonth == 10) {
            System.out.println("October's birthstone is " + octBirthstone);
        } 
        
        if(birthMonth == 11) {
            System.out.println("November's birthstone is " + novBirthstone);
        } 
        
        if(birthMonth == 12) {
            System.out.println("December's birthstone is " + decBirthstone);
        } 
        
        if(birthMonth > 12 || birthMonth < 1) {
            System.out.println("Please enter a number between 1-12");
        }
    }
    
}

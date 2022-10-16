/**
 *
 * @author kharileigh
 * A Rainbow
 * use code below, fix code to print out colors in true ROYGBIV order
 */

package com.sg.foundations.flowcontrol.arrays;


public class ARainbow {
    
    public static void main(String[] args) {
        
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        
        /*
        
        OLD CODE :
        
        System.out.println(colors[5]);
        System.out.println(colors[3]);
        System.out.println(colors[2]);
        System.out.println(colors[1]);
        System.out.println(colors[4]);
        System.out.println(colors[0]);
        System.out.println(colors[6]);

        PRINTS :
        Indigo
        Green
        Yellow
        Orange
        Blue
        Red
        Violet
        
        */
        
        // NEW CODE :
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        System.out.println(colors[5]);
        System.out.println(colors[6]);
    }
}

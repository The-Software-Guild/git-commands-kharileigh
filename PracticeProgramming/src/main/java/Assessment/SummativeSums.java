/**
 *
 * @author kharileigh
 * Summative Sums 
 * Instructions : write a method that takes an array of integers, adds them together and returns the result
 * Call your new method inside a main method and print out the result for the following three arrays
 * { 1, 90, -33, -55, 67, -16, 28, -55, 15 }
{ 999, -60, -77, 14, 160, 301 }
{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 } 
 */

package Assessment;

import java.util.stream.*;
// import java.io.*;
import java.util.*;

public class SummativeSums {
    
    public static void main(String[] args) {
        
        // INITIALISED ARRAYS WITH VALUES
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        
        // CALCULATE SUM OF INTEGERS IN ARRAY USING STREAM METHOD FROM JAVA UTIL CLASSES
        int sum = IntStream.of(arr1).sum();
        int sum2 = IntStream.of(arr2).sum();
        int sum3 = IntStream.of(arr3).sum();
        
        // PRINT SUM TO CONSOLE
        System.out.println("The sum of: " + Arrays.toString(arr1) + " " + "is: ");
        System.out.println(sum);
        System.out.println("The sum of: " + Arrays.toString(arr2) + " " +"is: ");
        System.out.println(sum2);
        System.out.println("The sum of: " + Arrays.toString(arr3) + " " +"is: ");
        System.out.println(sum3);
       
        
    }
    
}

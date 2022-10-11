/**
 *@author Khari - Leigh Miller
 *email: kharileighmiller@gmail.com
 *date: 11.Oct.2022
 *purpose: My first Hello World program in an IDE
 */

package com.kharileigh.helloworld;

/**
 *
 * @author kharileigh
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Elizabeth!");
        
        // Declare variables
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // Initialize variables
        result = 0;
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
        // Addition, equals 12
        result = operand1 + operand2;
        
        // Subtraction, equals 3
        result = 15 - operand1;
        
        // Multiplication, equals 35
        result = operand1 * operand2;
        
        // Division, equals 4
        result = 28 / 7;
        
        // Modulo, equals 2 remainder
        result = operand2 % operand1;
        
        System.out.println("The program runs succcessfull!");

    }
}

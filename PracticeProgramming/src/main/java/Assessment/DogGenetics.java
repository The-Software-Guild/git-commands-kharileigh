/**
 *
 * @author kharileigh
 * Dog Genetics
 * Instructions : ask user for name of their dog, generates a fake DNA background report on the pet dog
 * should assign a random percentage to 5 dog breeds (that should add up to 100%)
 */

package Assessment;

import java.util.Scanner;


public class DogGenetics {
    
    public static void main(String[] args) {
        
        String userDog;
        int max = 100;
        int sum = 0;
       
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        
        int randomNum = num(1, 100);
        
        System.out.print("What is your dog's name? ");
        Scanner input = new Scanner(System.in);
        userDog = input.next();
        
        do {
            
            System.out.println(userDog + " is: ");
            
            if (randomNum < max) {
                System.out.println(num1 + "% " + "St.Bernard");
                break;
            }
            if (randomNum < (max - num1)) {
                System.out.println(num2 + "% " + "Chihuahua");
                break;
            }
            if (randomNum < (max - (num1 + num2))) {
                System.out.println(num3 + "% " + "Dramatic RedNosed Asian Pug");
                break;
            }
            if (randomNum < (max - (num1 + num2 + num3))) {
                System.out.println(num4 + "% " + "Common Cur");
                break;
            }
            if (randomNum < (max - (num1 + num2 + num3 + num4))) {
                System.out.println(num5 + "% " + "King Doberman");
                break;
            }
        
        } while (sum == max);
        
        System.out.println("Wow, that's QUITE the dog!");
    
     }

    public static int num(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}

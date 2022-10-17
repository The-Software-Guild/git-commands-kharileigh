/**
 *
 * @author kharileigh
 * Health Hearts
 * Instructions : simple calculator asking user for their age
 * calculate the healthy heart rate range for that age and display it
 * maximum heart rate = 220 - their age
 * target heart rate zone is the 50-80% of the maximum
 */

package Assessment;

import java.util.Scanner;

public class HealthyHearts {
    
    public static void main(String[] args) {
        
        String userAge;
        
        // GET USER AGE
        System.out.println("What is your age?");
        Scanner userInput = new Scanner(System.in);
        userAge = userInput.nextLine();
        int age = Integer.valueOf(userAge);
        
        System.out.println("Your maximum heart rate should be " + getMaxHeartRate(age) + "beats per minute.");
        
        // METHOD MAXIMUM HEART RATE
        public int getMaxHeartRate(int ageInput) {
            return 220 - ageInput;
        }
        
        // METHOD TO GET TARGET HEART RATE
        public String getTargetHeartRate(int age) {
            String range;
            int maxHeartRate = getMaxHeartRate(age),
                    lowRange = (int) (maxHeartRate * 0.50),
                    highRange = (int) (maxHeartRate * 0.80);
            
            range = "Your target HR Zone is " + lowRange + " - " + highRange + ".";
            
            return range;
        }
}

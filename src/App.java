import java.util.*;

/**
 *  Task: Write code that will take input and output different messages. 
 *  
 *  Description: Our code should take in inputs then print a message based on divisibility tests.
 * 
 *  Basic task (up to B+ level): Take input from the user. Output if the number is even or odd.
 *  
 *  Moderate task (up to A level): Do all of the above AND check to see if the number is divisible 
 *  by 3 and/or 5:
 *  If the number is divisible by 3, print "The number is divisible by 3."
 *  If the number is divisible by 5, print "The number is divisible by 5."
 *  If divisible by both 3 and 5, print "The number is divisible by both 3 and 5."
 * 
 *  Challenge task (up to A+ level): Complete both of the above AND check to see if the number 
 *  is greater than 0 and less than 100. If the number is less than 0 or above 100, say "Wrong number!".
 *  If the number is between 0 and 100, check to see if it is a prime number. A prime number less than
 *  100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 *  
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number%2 == 0) {
            System.out.println("The number is even.");
        } if (number%2 != 0) {
            System.out.println("The number is odd.");
        }

        if (number%3 == 0 && number%5 != 0) {
            System.out.println("The number is divisible by 3.");
        }  if (number%5 == 0 && number%3 != 0) {
            System.out.println("The number is divisible by 5.");
        }  else if (number%3 == 0 && number%5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        }

        if (number < 0 || number > 100) {
            System.out.println("Wrong number!");
        } 
        
        if (number == 7 || number == 5 || number == 3 || number == 2) {
            System.out.println("The number is prime.");
        } else if (number%number == 0 && number%1 == 0 && number%2 != 0 && number%3 != 0 && number%5 != 0 && number%7 != 0) {
            System.out.println("The number is prime.");
        } 
        
    }
}

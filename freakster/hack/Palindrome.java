package freakster.hack;
/**
 * Code to check if string is palindrome or if number is palindrome
 */

import java.util.Scanner;

/**
 * Created by freakster on 1/21/2015.
 */
public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     String input = scanner.next();

     boolean isPalin = ifPalindrome(input);
        //System.out.println("Palindrome.main"+isPalin);
        System.out.println("isPalin = " + isPalin);

    }

    private static boolean ifPalindrome(String input) {
        if(input.equals(reverseString(input))){
            return true;
        }
        return false;
    }

    private static String reverseString(String input) {
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            reverse.append(input.charAt(input.length()-1-i));

        }
        return reverse.toString();
    }


}

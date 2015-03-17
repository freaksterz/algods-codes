package freakster.hack;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by freakster on 3/17/2015.
 * Problem Statement

 Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly because it is a pangram. ( pangrams are sentences constructed by using every letter of the alphabet at least once. )

 After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

 Given a sentence s, tell Roy if it is a pangram or not.

 Input Format

 Input consists of a line containing s.

 Constraints
 Length of s can be atmost 103 (1≤|s|≤103) and it may contain spaces, lowercase and uppercase letters. Lowercase and uppercase instances of a letter are considered same.

 Output Format

 Output a line containing pangram if s is a pangram, otherwise output not pangram.

 Sample Input #1

 We promptly judged antique ivory buckles for the next prize

 Sample Output #1

 pangram

 Sample Input #2

 We promptly judged antique ivory buckles for the prize

 Sample Output #2

 not pangram

 *
 */
public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {*/
            String s  =  sc.nextLine();
            if(checkPangram(s)){
                System.out.println("pangram");
            }else{
                System.out.println("not pangram");
            }
    }


    private static boolean checkPangram(String s) {

        HashSet allCharacter = new HashSet();
        for (char i ='a' ; i <'z' ; i++) {
            allCharacter.add(i);
        }
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(" ".equals(s.charAt(i))){

            }else{
                //System.out.println(s.charAt(i));
                allCharacter.remove(s.charAt(i));

            }

        }

        if(allCharacter.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}

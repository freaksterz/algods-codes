package freakster.hack;
/**
 * Problem Statement

 * Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

 Your task is to find the minimum number of required deletions.

 Input Format
 The first line contains an integer T i.e. the number of test cases.
 Next T lines contain a string each.

 Output Format
 For each test case, print the minimum number of deletions required.

 Constraints

 1≤T≤10
 1≤lengthofString≤105

 Sample Input

 5
 AAAA
 BBBBB
 ABABABAB
 BABABA
 AAABBB

 Sample Output

 3
 4
 0
 0
 4

 */

import java.util.Scanner;

public class AlternateCharacter {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int testCases = sc.nextInt();
      
      for (int i = 0; i < testCases; i++) {
		
    	  String word = sc.next();
    	  int number = checkString(word);
    	  System.out.println(number);
	   }
      sc.close();
	}

	private static int checkString(String word) {
		int del_count = 0;
		for (int i = 0; i < word.length()-1; i++) {
			if( word.charAt(i) == word.charAt(i+1)){
				del_count ++;	
			}
		}
		
		
		return del_count;
	}

}

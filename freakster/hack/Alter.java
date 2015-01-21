package freakster.hack;


import java.util.Scanner;

public class Alter {

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

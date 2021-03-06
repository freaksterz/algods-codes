package freakster.hack;
/**
 * Problem Statement

 Sherlock Holmes is getting paranoid about Professor Moriarty, his archenemy. All his efforts to subdue Moriarty have been in vain. These days Sherlock is working on a problem with Dr. Watson. Watson mentioned that the CIA has been facing weird problems with their supercomputer, 'The Beast', recently.

 This afternoon, Sherlock received a note from Moriarty, saying that he has infected 'The Beast' with a virus. Moreover, the note had the number N printed on it. After doing some calculations, Sherlock figured out that the key to remove the virus is the largest 'Decent' Number having N digits.

 A 'Decent' Number has -

 3 or 5 or both as its digits. No other digit is allowed.
 Number of times 3 appears is divisible by 5.
 Number of times 5 appears is divisible by 3.
 Meanwhile, the counter to destruction of 'The Beast' is running very fast. Can you save 'The Beast', and find the key before Sherlock?

 Input Format
 The 1st line will contain an integer T, the number of test cases. This is followed by T lines, each containing an integer N i.e. the number of digits in the number

 Output Format
 Largest Decent number having N digits. If no such number exists, tell Sherlock that he is wrong and print '-1'

 Constraints
 1<=T<=20
 1<=N<=100000


 Sample Input

 4
 1
 3
 5
 11
 Sample Output

 -1
 555
 33333
 55555533333
 Explanation
 For N=1, there is no such number.
 For N=3, 555 is only possible number.
 For N=5, 33333 is only possible number.
 For N=11, 55555533333 and all of permutations of digits are valid numbers, among them, the given number is the largest one.
 */

import java.util.Scanner;

/**
 * Created by AGA2 on 1/28/2015.
 */
public class SherlockandTheBeast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {

             getDecentNumber(scanner.nextInt());
            //System.out.println(decentNumber);
        }

    }

    private static void getDecentNumber(int number) {
            int decentNumber=-1;
            int five =0, three =0;
            int first; int second;

                for (int i = 0; i <number ; i++) {
                    first = number-i;
                    second =i;
                    if (second!=0){
                        if(first%3==0 && (second%5==0)){
                          five=first;
                            three=second;
                             break;
                         }
                    }
                }

            if(five==0 && three==0){
                        if (number%3==0 && number!=0){
                            five=number;
                            three=0;
                        }
                        if (number%5==0 && number!=0){
                            five=0;
                            three=number;
                        }
                    }
            if(five==0 && three==0) {
                System.out.println(-1);
            }else {
                for (int i = 0; i <five ; i++) {
                    System.out.print(5);
                }
                for (int i = 0; i < three ; i++) {
                    System.out.print(3);
                }
                System.out.println();
            }




            }



}

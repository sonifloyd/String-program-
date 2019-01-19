

/* Anagram

Given two strings, check whether two given strings are anagram 
of each other or not. An anagram of a string is another string that 
contains same characters, only the order of characters can be different. 
For example, “act” and “tac” are anagram of each other.

Input: 
The first line of input contains an integer T denoting the number 
of test cases. Each test case consist of two strings in 'lowercase'
 only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 30
1 ≤ |s| ≤ 1016

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

*/
import java.util.*;
public class GFG2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int input = sc.nextInt();
        String str1 = sc.next();
        String s1 =str1.toLowerCase();//convert into lower case
        //char[] ch1=s1.toCharArray();//convert string into array
        String str2 = sc.next();
        String s2 =str2.toLowerCase();// convert into lower case
        //char[] ch2 =s2.toCharArray();// convert string into array
        boolean isAnagram =  isAnagram(s1, s2);
        if(isAnagram==true)
        System.out.println("Yes");
        else
        System.out.println("No");
    }

        static boolean isAnagram( String str1,String str2){
            char[] str1Char = str1.toCharArray();//convert into array
            char[] str2Char = str2.toCharArray();

            // check length

            if(str1Char.length != str2Char.length) {
                return false;
            }
            System.out.println(" length is equal");

            // then loop anc check each character

        
    
    //sort array
       Arrays.sort(str1Char);
    Arrays.sort(str2Char);
    //compare two char array
    return Arrays.equals(str1Char,str2Char);
    
}
//return Arrays.equals(str1Char,str2Char);

}

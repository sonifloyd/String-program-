/* You have been given an alphanumeric string S, extract maximum numeric value from that string. Alphabets will only be in lower case.

Input:
The first line contains a single integer T i.e. the number of test cases. T testcases follow. The first and only line consists of a String S.

Output: 
For each testcase, in a new line, print the Maximum number extracted from the string S.

Constraints:
1 <= T <= 100
2 <= |S| <= 200

Example:
Input:
3
100klh564abc365bg
abvhd9sdnkjdfs
abchsd0sdhs
Output:
564
9
0 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG10 {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();//no.of test cases
		
	    for(int i=1;i<=n;i++){
	    String st=sc.next();
		// int max=extractmaximum(st);
		// System.out.println(max);
		extractmaximum(st);
		}
		
		
	}
	static void extractmaximum(String str){
	    
	    int num=0,res=0;
	    str=str.toLowerCase();
	    for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				int ascii = str.charAt(i);
			System.out.println(str.charAt(i) + "=>"+ ascii);
			num=num*10+(str.charAt(i)-'0');
			}
	        
	        else
	        {
	            res=Math.max(res,num);
	            num=0;
	    }
	}
	System.out.println( Math.max(res,num))
	;
}
}
/*Given a string S, check if it is palindrome or not.*/
/*Input:
The first line contains 'T' denoting the number of test cases. T testcases follow.
 Each testcase contains two lines of input. The first line
  contains the length of the string and the second line contains the string S.

Output:
For each testcase, in a new line, print "Yes" if it is 
a palindrome else "No". (Without the double quotes)*/
import java.util.Scanner;
public class GeeksofGeeks1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter no. of input");
        int input = sc.nextInt();
        System.out.println(" Enter the length of String");
        int len =sc.nextInt();
        System.out.println(" Enter your String");
        String str=sc.next();
        char ch[]=str.toCharArray();//convert string into array
        String rev="";
        for(int i=0;i<ch.length;i++)
        {
            rev=ch[i]+"";
        } 
        if(rev.equals(input)){
            System.out.println("Yes")

        }
        else{
        System.out.println("No")
        }


    }

}
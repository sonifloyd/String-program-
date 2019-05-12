// Reverse the word in sentance 
ex i love india
india love i

import java.util.Scanner;
public class GFG11{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the sentance");
        String s= sc.nextLine();
        // call the method
        reverseWord(s);
        
    }
    public static void reverseWord( String str){
        String [] arr =str.split(" ");
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}

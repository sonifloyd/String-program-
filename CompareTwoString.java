
/* WAJP TO COMPARE TWO STRING */
import java.util.Scanner;
public class CompareTwoString{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("Enter 1st String");
    String str1=sc.nextLine();
    System.out.println("Enter 2nd string ");
    String str2=sc.nextLine();
    boolean b=compare(str1,str2);
    if(b)
    System.out.println("Equal");
    else
    System.out.println("not equal");
    }
    static boolean compare(String str1,String str2){
    if(str1.length()!=str2.length())
    return false;   
       else 
      { 
        char ch1[] =str1.toCharArray();
        //convert string int array
       char ch2[]=str2.toCharArray();
       for(int i=0;i<ch1.length;i++){
           for(int j=0;j<ch2.length;j++){
               if(ch1[i]!=ch2[j]){
                   return false;
               }
               
           }
       }
         return true; 
      } 
    }
}

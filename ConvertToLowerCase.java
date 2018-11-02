
/* WAJP TO CONVERT STRING INTO LOWER CASE USER INPUT*/
import java.util.Scanner;
public class ConvertToLowerCase{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();//convert in char array
        String nstr="";//empty string
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                nstr=nstr+((char)ch[i]+32);
            }/* if any alphabet in upper case convert into Lower case*/
            else{
                nstr=nstr+ch[i];//if it is in lower case no need to convert
            }

            
            
        }
        System.out.println("our string is in lowercase"+ nstr);
    }
}
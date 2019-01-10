
/* WAJP TO remove space b/w string FROM USER*/
import java.util.Scanner;
public class RemoveSpace{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any String");
    String str=sc.nextLine();
    char ch[] =str.toCharArray();// convert string int array
    String nstr="";// create empty string
    for(int i=0;i<ch.length;i++){
        if(ch[i]!= '')
        nstr=nstr+ch[i];/* if the charcter at ith index 
        is not equal to space the add that chacter to
         new empty string*/
    }
    System.out.println(nstr);

}
}
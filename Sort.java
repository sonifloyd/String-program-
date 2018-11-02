
/* WAJP TO SORT A STRING IN ALPHABETICAL ORDER*/
import java.util.Scanner;
public class Sort{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();//convert in char array
        //String sorted="";//empty string
        for( int i=0;i<ch.length-1;i++)
        {
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=t;
            }
        }
    }
            String sorted =new String(ch);
    System.out.println("our sorted string is" +  sorted);
    }
}
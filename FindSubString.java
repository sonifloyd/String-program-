
/* WAJP TO FIND A SUB-STRING WITHOUT USING INBUILT FUNCTION*/
import java.util.Scanner;
public class FindSubString{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter main string");
        String st1=sc.next();
        System.out.println("Enter sub string");
        String st2=sc.next();

    
    //static String findSubString(String s1,String s2){
        char ch1[]=st1.toCharArray();//convert string into array
        char ch2[]=st2.toCharArray();
        int find=0;
        for(int i=0;i<ch1.length;i++){
            int k=i,j=0;
            while(k<ch1.length && j<ch2.length && ch1[k]==ch2[j] ){
                j++;
                k++;
            }
        
        if(j==ch2.length){

            find++;
            System.out.println(find+" times "  + st2+"present b/w"+i +k+"index");
        }
    }
        
        
    
}
}
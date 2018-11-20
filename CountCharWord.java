

/* WAJP FOR NO. OF CHARACTER IN EACH WORD & COUNT THEM*/
import java.util.Scanner;
public class CountCharWord{
    static void countChar( String str){
        char ch[]=str.toCharArray();//convert string into arrray
        String nstr="";//create empty string
        int nc=0;
        for(int i=0;i<ch.length;i++ ){
            if( i<ch.length && ch[i]!=0 ){
                nc++;
                nstr=nstr+ch[i];
                i++;
            }
            else{
                nstr=nstr +nc ;
                nc=0;
            }

            
           nstr=nstr+nc;     
        
            
            
        System.out.println(nstr +" ->"+ nstr.length());
        }
        
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter a String");
        String s = sc.nextLine();
        
        countChar(s);

    }
}
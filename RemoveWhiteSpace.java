
import java.util.Scanner;
public class RemoveWhiteSpace{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char ch[] =s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < ch.length; i++) {  
            if ((ch[i] != ' ') && (ch[i] != '\t'))//  /t means one tab space 
            {  
                stringBuffer.append(ch[i]);  
            }  
        }  
        String noSpaceStr = stringBuffer.toString();  
        System.out.println(noSpaceStr);  
    }  
}  
    

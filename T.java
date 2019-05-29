import java.util.*;
public class  T{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string");
        String str = sc. nextLine();
        nonRepeat(str);



    }
    public static void nonRepeat( String st){
        HashMap<Character,Integer> charCount = new HashMap<>();
        Character ch;
        for( int i=0;i<st.length();i++){
            ch=st.charAt(i);
            if(charCount.containsKey(ch))
            {
                charCount.put(ch,charCount.get(ch)+1);
            }
            else{
            charCount.put(ch,1);
            }
        }
        for( int j=0;j<st.length();j++){
            ch=st.charAt(j);
            if(charCount.get(ch) == 1)
            {
                System.out.println(ch);
                break;
            }
        }
    }

}
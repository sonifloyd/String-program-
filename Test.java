//
public class Test{
    public static void main(String[] args) {
        
        String str = "I came from bihar";
        //int len = str.length();
       // System.out.println(len);
        String [] st=str.split(" ");
        int len = st.length;
        System.out.println(len);
        for(int i= 0;i<st.length;i++){
            System.out.println(st[i]);
        }
        System.out.println(".........");
         java.util.Arrays.sort(st);
        for(int j=0;j<st.length;j++){
            //System.out.println(st[0]);
            //System.out.println("......");
            System.out.println(st[0]);
        }
        
        //}
    }
}
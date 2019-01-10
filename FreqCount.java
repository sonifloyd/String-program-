/* Write a Program to display OCCURENCES of each character in a STRING? */
public class FreqCount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  string");
        String st=sc.next();
        char ch[]=st.toCharArray(); int count=0;
        for(int i=0; i<ch.length;i++){
             count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[j]==ch[i]){
                    count++;
                }
            }
        }
                System.out.println(ch[i]+ count + "times");

            }
        }

    
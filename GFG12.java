/*Your task is to implement the function strstr. 
The function takes two strings as arguments (s,x) and 
 locates the occurrence of the string x in the string s.
  The function returns and integer denoting the first occurrence
   of the string x in s.*/
   /*  For each test case, in a new line, output will be an integer
    denoting the first occurrence of the x in the string s. Return -1 if no match 
    found.*/
    import java.util.Scanner;
    public class GFG12{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter first string");
            String s= sc.next();
            System.out.println(" Enter 2nd String");
            String x = sc.next();
            matchSubString(s,x);

        }
        static void  matchSubString (String str1, String str2){
            String s=" ";

            for(int i=0;i<str1.length()-1;i++){
                for(int j=0;j<str2.length()-1;j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        s =s+str2.charAt(j);
                        if(s.equals(str2)){
                            System.out.println(" subString is :"+ s);
                        }

                    }
                   // if(s.equals(str2)){
                      //  System.out.println(" subString is :"+ s);
                   // }
                }
            }

        }
    }


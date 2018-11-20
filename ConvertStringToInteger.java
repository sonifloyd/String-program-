
/* WAJP TO CONVERT INTEGER OF STRING TYPE TO 
INTEGER TYPE WITHOUT USING PAESE INT */
import java.util.Scanner;
public class ConvertStringToInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.next();
        System.out.println("After converting  integer string to integer");
        int d=check(st);
        System.out.println(d+" is a integer type");

}

public static int check(String s){
    int number=0;
    for(int i=0;i<s.length();i++){
        number=number*10;
        number=number+(s.charAt(i)-'0');

    }
    return number;
}
}

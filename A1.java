import java.util.*;
public class A1{
    public static void findPair(int A[],int sum){
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==sum){
                    
        System.out.println(" pair found at index  "  + i  + " and "+j);
                    //return;
                }
            }
        }
       // System.out.println("pair not found");

    }
    public static void main(String[] args) {
        int A[]={8,7,2,5,3};
        int sum=10;
        findPair(A,sum);
    }
}
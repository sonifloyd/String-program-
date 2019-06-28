import java.util.*;
public class S{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of  Array");
        int n=sc.nextInt();
        System.out.println(" enter array");
        
        // declare array
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //int[] arr ={3,4,-7,3,1,3,1,-4,-2,-2};
        if(zeroSumSubArray(a)){
            System.out.println(" subArray exist");
        }
        else{
            System.out.println("subArray not exits");
        }
        
        
        
    }
    public static Boolean  zeroSumSubArray(int a[])
    {
        Set<Integer> set=new HashSet<>();
        set.add(0);
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            System.out.println(a[i]);
            if(set.contains(sum))
            {
                return true;
            }
            set.add(sum);
        }
        return false;

    }
}
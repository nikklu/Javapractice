import java.util.Arrays;
import java.util.Scanner;

public class MinimumSum {
   public static int MinimumSum(int[] arr1,int[] arr2,int n)
   {
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       int b=n;
       int[] Array=new int[n];
       for (int i=0;i<n;i++)
       {
           Array[i]=arr2[n-1-i];
       }
       int sum=0;
       for (int i=0;i<b;i++)
       {
           sum+=Array[i]*arr1[i];
       }
       return sum;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for (int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int sum=MinimumSum(arr1,arr2,n);
        System.out.println("Minimum sum:"+sum);
    }

}

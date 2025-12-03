import java.util.*;
public class LargeNum {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter First Num:");
     int a=sc.nextInt();
     System.out.print("Enter Second Num:");
     int b=sc.nextInt();
     int c=a>b?a:b;
     System.out.println("Largest Number:"+c);
    }
}

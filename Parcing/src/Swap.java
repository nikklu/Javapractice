import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Num:");
        int a=sc.nextInt();
        System.out.println("Enter Sec Num :");
        int b=sc.nextInt();
        int c=0;
        System.out.println("Numbers before swap "+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Numbers after swap "+a+" "+b);
    }
}

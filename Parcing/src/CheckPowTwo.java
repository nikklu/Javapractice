import java.util.Scanner;

public class CheckPowTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0&&(a&(a-1))==0)
        {
            System.out.println("Yes "+a+" is power of two");
        }
        else {
            System.out.println("No "+a+" is not power of two");
        }
    sc.close();
    }
}

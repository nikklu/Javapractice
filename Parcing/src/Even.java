import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NUmber:");
        int a=sc.nextInt();
        boolean b=a%2==0?true:false;
        if(b)
        {
            System.out.println("Yes "+a+" it is even");
        }
        else
        {
            System.out.println("No "+a+" it is not even");
        }
    }
}

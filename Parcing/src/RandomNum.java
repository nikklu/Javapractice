import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        //With range;
       // int a=(int)(Math.random()*100)+1;
        //without Range
        Scanner s=new Scanner(System.in);
       Random r=new Random();
//        System.out.print("Enter upper bond:");
//        int a=s.nextInt();
//        System.out.print("Enter lower bond:");
//        int b=s.nextInt();
//        int c=r.nextInt(a-b+1)+b;
//        System.out.println(c);
        char a=s.next().charAt(0);
        char d=(char) (r.nextInt(26)+'A');
        System.out.println(d);
    }
}

import java.util.Scanner;

public class PrimeDigitsInNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            if(isPrime(rem))
            {
                sum+=rem;
                count++;
            }

            n/=10;
        }
        System.out.println("sum="+sum+ "count="+count);
    }
    public static boolean isPrime(int n)
    {
        if(n<=0)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}


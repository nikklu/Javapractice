import java.util.Scanner;

public class AreaOfTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        double a=sc.nextDouble();
        System.out.print("Enter Second Number");
        double b=sc.nextDouble();
        double c=0.5*a*b;
        System.out.printf("Area of triangle: %.2f\n",c);
        sc.close();
    }
}

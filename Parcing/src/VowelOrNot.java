import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char:");
        char a=sc.next().charAt(0);
        char b=Character.toLowerCase(a);
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
        {
            System.out.println(a+" It is a vowel");
        }
        else
        {
            System.out.println(a+" It is not a vowel");
        }
        sc.close();
    }
}

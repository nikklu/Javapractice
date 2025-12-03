import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RepetedChar {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      LinkedHashMap<Character,Integer>nik=new LinkedHashMap<>();
      for(char c:a.toCharArray())
      {
          if(c!=' ')
          {
              nik.put(c,nik.getOrDefault(c,0)+1);
          }
      }
      for(char c:nik.keySet())
      {
          System.out.println(c+" "+nik.get(c));
      }
    }
}

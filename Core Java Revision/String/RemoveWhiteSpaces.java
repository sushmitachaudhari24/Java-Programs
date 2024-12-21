import java.util.*;
public class RemoveWhiteSpaces
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a string");
   String str=sc.nextLine();
   String s=str.trim();
   System.out.println(s);
  }
}
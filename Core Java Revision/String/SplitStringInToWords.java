import java.util.*;
public class SplitStringInToWords
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String");
   String str=sc.nextLine();
   String s[]=str.split(" ");
   for(int i=0;i<s.length;i++)
   {
    System.out.println(i+1+".  "+s[i]);
   }
  }
}
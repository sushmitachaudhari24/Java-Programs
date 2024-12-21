import java.util.*;
public class CheckStringEndsWithstr
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String str=sc.nextLine();
    System.out.println("Enter a string to check/Search");
    String st=sc.nextLine();
    if(str.endsWith(st))
    {
      System.out.println("Found");
    }
    else
    {
     System.out.println("Not Found");
    }
  }
}
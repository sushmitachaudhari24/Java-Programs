import java.util.*;
public class CheckChar
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charector : ");
    char ch=sc.next().charAt(0);
      String result=(ch>='0' && ch<='9')?"Digit":((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))?"Alphabet":"Special Symbol";
      System.out.println(result);
  }
}
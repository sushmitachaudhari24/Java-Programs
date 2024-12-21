import java.util.*;
public class CheckCharector
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charector");
    char ch=sc.next().charAt(0);
    if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
    {
     System.out.println("Charector is Alphabet");
    }
    else if(ch>='0' && ch<='9')
    {
     System.out.println("Charector is DIGIT");
    }
    else
      System.out.println("Special Symbol");
  }
}
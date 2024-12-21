import java.util.*;
public class CheckASD
{
  public static void main(String []args)
  {
      char ch;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a charector");
	  ch=sc.next().charAt(0);
	  String result=(ch>='A' && ch<='Z' || ch>='a' && ch<='z')?"Alphabet":(ch>='0' &&ch<='9')?"Digit":"Special Symbol";
	  System.out.println(result);
  }
}
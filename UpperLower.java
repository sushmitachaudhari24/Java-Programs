import java.util.*;
public class UpperLower
{
  public static void main(String []args)
  {
    char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a charector");
	ch=sc.next().charAt(0);
	String result=(ch>='a' && ch<='z')?"Lower Case Charector":"Upper Case Charector";
	System.out.println(result);
  }
}

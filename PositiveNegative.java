import java.util.*;
public class PositiveNegative
{
  public static void main(String []args)
  {
    int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	String result=(num>0)?"positive":"Negative";
	System.out.println(result);
  }
} 
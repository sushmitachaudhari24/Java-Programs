import java.util.*;
public class FactApp
{
  public static void main(String []args)
  {
     int f,num,i;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 num=sc.nextInt();
	 f=1;
	 for(i=1;i<=num;i++)
	 {
	   f=f*i;   
	 }
	 System.out.println("Factorial of "+num+"\tis"+f);
  }
}
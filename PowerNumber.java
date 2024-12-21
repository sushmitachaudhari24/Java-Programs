import java.util.*;
public class PowerNumber
{
  public static void main(String []args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number and power");

   int n=sc.nextInt();
   int p=sc.nextInt();
   int result=1;
   while(p!=0)
   {
   result=result*n;
   p--;
   }
   System.out.println("Power of "+n+" is "+result);
  }
}
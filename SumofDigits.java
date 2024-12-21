import java.util.*;
public class SumofDigits
{
   public static void main(String [] args)
   {
      int sum=0,rem,num,product=1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Number");
	  num=sc.nextInt();
	  while(num!=0)
	  {
	    rem=num%10;
		num=num/10;
		sum=sum+rem;
		product=product*rem;
	  }
	  System.out.println("Sum of Digits is "+sum);
	  System.out.println("Product of Digits is "+product);
   }
}
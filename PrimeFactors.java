import java.util.*;
public class PrimeFactors
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  int number,count,temp=0,fact;
  System.out.println("Enter a number");
  number=sc.nextInt();
  System.out.println("Prime Factors are");
 int i=2;
 System.out.println("Prime Factors:");
  while(i<=number)
  {
	  while(number%i==0)
	  {
		 System.out.println(i);
		 number/=i;
  	  }
	 i++;
  }

 }
}
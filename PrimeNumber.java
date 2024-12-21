import java.util.*;
public class PrimeNumber
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       int i,count=0;
       for(i=1;i<=num;i++)
       {
        if(num%i==0)
        {
         count++;
        }
       }
       if(count==2)
       {
        System.out.println("Number is prime number");
       }
       else
       {
		   System.out.println("Number is not Prime number");
	   }

   }
}
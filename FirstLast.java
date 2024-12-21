import java.util.*;
public class FirstLast
{
  public static void main(String []args)
 {
   int f=0,l=0,num;
   Scanner sc=new Scanner(System.in);
   System.out.println("\nEnter the Number");
   num=sc.nextInt();
   l=num%10;
   while(num!=0)
   {
    f=num%10;    
	num=num/10;

   }
  int sum=0;
  sum=f+l;
  
  System.out.println("Sum of First and Last Digit is"+sum);
 }

} 
import java.util.*;
public class PalindromeNum
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter A number");
   int num=sc.nextInt();
   int temp,rem,rev=0;
   temp=num;
   while(num!=0)
   {
	   rem=num%10;
	   num=num/10;
	   rev=rev*10+rem;
   }
   if(rev==temp)
   {
      System.out.println(" Number is Palindrome");
   }
   else
      System.out.println("Number is not palindrome");
  }
}
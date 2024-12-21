import java.util.*;
public class palindrome
{
  public static void main(String [] args)
  {
    int num,rev=0,temp,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	temp=num;
	while(num!=0)
	{
	  rem=num%10;
	  num=num/10;
	  rev=rev*10+rem;
	}
	if(rev==temp)
	{
	  System.out.println("Given Number is Palindrome");
	}
	else
	{
		System.out.println("Given Number is not Palindrome");
	}
  }
}
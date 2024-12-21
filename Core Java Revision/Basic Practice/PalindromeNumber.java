import java.util.*;
public class PalindromeNumber
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int rev=0,temp=num;
    while(temp!=0)
    {
     int rem=temp%10;
     rev=rev*10+rem;
     temp=temp/10;
    }
    if(rev==num)
    {
     System.out.println("Number is Palindrome");
    }
    else
    {
    System.out.println("Number is not palindrome");
    }
  }
}
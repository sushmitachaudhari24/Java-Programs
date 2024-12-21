import java.util.*;
public class Reversenumber
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int rev=0;
    while(num!=0)
    {
     int rem=num%10;
     num=num/10;
     rev=rev*10+rem;
    }
    System.out.println("Reverse number is "+rev);
  }
}
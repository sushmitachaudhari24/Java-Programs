import java.util.*;
public class HappyNumber
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int num=sc.nextInt();
    int sum=0;
     while(num!=1 && num!=4)
     { sum=0;
      while(num!=0)
      {
       int rem=num%10;
       sum=sum+rem*rem;
       num=num/10;
      }
     num=sum;
    }
    if(sum==1)
    {
     System.out.println("Number is Happy Number");
    }
    else
    {
     System.out.println("Number is not Happy Number");
    }
  }
}
import java.util.*;
public class Armstrong
{
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number");
      int num=sc.nextInt();
      int temp=0,count=0,rem=0,pow=1,sum=0;
      temp=num;
      while(temp!=0)
      {
         temp=temp/10;
         count++;
      }
      temp=num;
      while(temp!=0)
      {
         rem=temp%10;
         pow=1;
         for(int i=1;i<=count;i++)
         {
         pow=pow*rem;
         }
         temp=temp/10;
         sum=sum+pow;
      }
      if(num==sum)
      {
      System.out.println("Number is Armstrong Number");
      }
      else
      {
      System.out.println("Number is not Armstrong");
      }

  }
}
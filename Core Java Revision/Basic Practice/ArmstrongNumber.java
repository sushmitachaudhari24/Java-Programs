import java.util.*;
public class ArmstrongNumber
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int sum=0,p=1,rem=0,temp=num,count=0;
   while(temp!=0)
   {
     temp=temp/10;
     count++;
   }
   temp=num;
   while(temp!=0)
   {
    rem=temp%10;
    p=1;
    for(int i=1;i<=count;i++)
    {
     p=p*rem;
    }
    sum=sum+p;
    temp=temp/10;
   }
   if(sum==num)
   {
     System.out.println("Number is ArmStrong");
   }
   else
    System.out.println("Number is not Armstrong");
  }
}
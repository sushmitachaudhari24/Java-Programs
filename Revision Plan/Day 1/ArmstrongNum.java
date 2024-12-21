import java.util.*;
public class ArmstrongNum
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int count=0,rem,temp,p=1;
     System.out.println("Enter a number to check number is Armstrong or not");
     int num=sc.nextInt();

     temp=num;
     while(temp!=0)
     {
      temp=temp/10;
      count++;
     }
    // System.out.println(count);
     temp=num;
     int sum=0;
     while(temp!=0)
     {
      rem=temp%10;
      p=1;
       temp=temp/10;
        for(int i=1;i<=count;i++)
        {
         p=p*rem;
        }
        sum=sum+p;

     }
     if(sum==num)
     {
      System.out.println("number is Armstrong ");
     }
     else
     {
	  System.out.println("number is not Armstrong");
	 }
  }
}

import java.util.*;
public class StrongNumUptoN
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int temp=0,rem=0,fact=1,sum=0;

      System.out.println("Strong Numbers are");

      for(int i=1;i<=num;i++)
      {
       temp=i;
       sum=0;
         while(temp!=0)
         {
            rem=temp%10;
            temp=temp/10;
            fact=1;
            for(int j=1;j<=rem;j++)
            {
              fact=fact*j;
            }
            sum=sum+fact;
         }
         if(sum==i)
         {
         System.out.println(i);
         }
      }
    }
}
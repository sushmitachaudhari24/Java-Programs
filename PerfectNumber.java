import java.util.*;
public class PerfectNumber
{
  public static void main(String []args)
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       int rem=0,temp=0,fact=0,sum=0;
         System.out.println("Perfect  numbers");
       for(int i=1;i<=num;i++)
       {
          temp=i;
          fact=0;

                for(int j=1;j<=temp/2;j++)
                {
                  if(temp%j==0)
                  {
                   fact=fact+j;
                  }
                }

           if(fact==temp)
           {
           System.out.println(temp);
           }
       }
  }
}
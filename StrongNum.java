import java.util.*;
public class StrongNum
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a limit");
      int limit=sc.nextInt();//upto limit loop will execute
      int temp,rem,fact=1,sum=0;

      System.out.println("Strong Numbers are");
      for(int i=1;i<=limit;i++)
      {
        temp=i;
        sum=0;
           while(temp!=0)
           {
              rem=temp%10;
              fact=1;
               for(int j=1;j<=rem;j++)  //calculate factorial of digit
               {
                fact=fact*j;
               }
               sum=sum+fact;
               temp=temp/10;
           }
           temp=i;
           if(temp==sum)
           {
             System.out.println(temp);
           }
      }
   }
}
import java.util.*;
public class PrimeNumNextPrev
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=sc.nextInt();
     int c=0,nn=0;
     for(int i=1;i<=num;i++)
     {
       if(num%i==0)
       {
        c++;
        System.out.println(i);
       }

     }
     if(c==2)
     {
      System.out.println("Number is prime");
     }
     else
     {
			int  count=0;
			          for(int i=num-1;i>=1;i--)
			          {count=0;
			            for(int j=1;j<=num;j++)
			            {
			              if(i%j==0)
			              {
			               count++;
			              }
			            }
			            if(count==2)
			            {
			             System.out.println(" Previous prime number is "+i);
			             break;
			            }
			          }

			         for(int i=num+1;i<=num+10;i++)
			         { count=0;
			           for(int j=1;j<=i;j++)
			           {
			             if(i%j==0)
				          {
				          count++;
			              }
			           }
			            if(count==2)
				        {
				         System.out.println(" Next prime number is "+i);
				         break;
			            }
			         }


     }
   }
}
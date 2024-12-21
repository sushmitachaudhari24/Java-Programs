import java.util.*;
public class MaxProduct
{
   public static void main(String []args)
   {
      //Scanner sc=new Scanner(System.in);
      int a[]=new int[]{ 2, 3, 5, 7, -7, 5, 8, -5 };
      int prod=1,prod1=1;
      for(int i=0;i<a.length;i++)
      {
         for(int j=i+1;j<a.length;j++)
         {
           prod1=a[i]*a[j];
           if(prod<prod1)
            {
             prod=prod1;
            }
	     }
      }
      System.out.println("Max Product is "+prod);
   }
}

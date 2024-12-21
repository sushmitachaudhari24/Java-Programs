import java.util.*;
public class SubArray1
{
   public static void main(String [] args)
   {               // 0 1 2  3 4 5 6  7
    int a[]=new int[]{3,4,-7,1,3,3,1,-4};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Sum");
    int sum=sc.nextInt();
    int sum1=0;

    for(int i=0;i<a.length;i++)
    {sum1=a[i];
      for(int j=i+1;j<a.length;j++)
      {
       sum1=sum1+a[j];
       if(sum==sum1)
       {
         System.out.print("\n["+i+"-"+j+"]\t{");
         for(int k=i;k<=j;k++)
         {
           System.out.print(a[k]+",");
         }
         System.out.print("}");
       }

      }
    }
     System.out.println();
   }
}
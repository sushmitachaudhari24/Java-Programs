import java.util.*;
public class SubArr1
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter Array Elements");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    int max=0,k=4,m=0;
    for(int i=0;i<a.length;i++)
    {
      m=i;
      max=a[i];
      if(i<=a.length-4)
      {
         for(int j=m;j<k;j++)
         {
           System.out.print(" "+a[j]);
           if(max<a[j])
           {
             max=a[j];
           }
         }
         System.out.print("-----"+max);
         k++;
         System.out.println();
      }
    }

    }
}
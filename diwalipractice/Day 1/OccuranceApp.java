import java.util.*;
public class OccuranceApp
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter Array Elements");
   for(int i=0;i<a.length;i++)
   {
     a[i]=sc.nextInt();
   }
   for(int i=0;i<a.length;i++)
   {
     for(int j=0;j<a.length;j++)
     {
      if(a[i]<a[j])
      {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
     }
   }
   int count=1;
   for(int i=0;i<a.length;i++)
   {
     if(i==a.length-1)
     {
     System.out.println(a[i]+"-------"+count);
     }
     else if(a[i]==a[i+1])
     {
       count++;
     }
     else
     {
        System.out.println(a[i]+"-------"+count);
        count=1;
     }
   }

  }
}
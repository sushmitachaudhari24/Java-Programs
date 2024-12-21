import java.util.*;
public class AscSortingArray
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter  elements of array");
   for(int i=0;i<a.length;i++)
   {
    a[i]=sc.nextInt();
   }
   System.out.println("Before Sorting Array Elements");
   for(int i=0;i<a.length;i++)
   {
    System.out.print("\t"+a[i]);
   }
   for(int i=0;i<a.length;i++)
   {
    for(int j=i+1;j<a.length;j++)
    {
      if(a[i]>a[j])
      {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
      }
    }
   }
    System.out.println("\nAfter Sorting Array Elements");
      for(int i=0;i<a.length;i++)
      {
       System.out.print("\t"+a[i]);
   }
  }
}
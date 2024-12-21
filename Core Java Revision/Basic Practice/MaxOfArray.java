import java.util.*;
public class MaxOfArray
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
   System.out.println("Array Elements");
   int max=a[0];
   for(int i=0;i<a.length;i++)
   {
     if(a[i]>max)
     {
      max=a[i];
     }
    System.out.print("\t"+a[i]);
   }
   System.out.println("\nMax of Array is "+max);
  }
}
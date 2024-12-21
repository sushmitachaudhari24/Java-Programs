import java.util.*;
public class ReverseArray
{
  public static void main(String []args)
  {
     int a[]=new int[]{10,20,30,40,50};
     System.out.println("Array Before reverse\n");
     for(int i=0;i<a.length;i++)
     {
      System.out.print("\t"+a[i]);
     }

     for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
     {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
     }

      System.out.println("Array after reverse\n");
          for(int i=0;i<a.length;i++)
          {
           System.out.print("\t"+a[i]);
     }
  }
}
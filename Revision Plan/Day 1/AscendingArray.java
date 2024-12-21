import java.util.*;
public class AscendingArray
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Array Elements");
   int a[]=new int[5];
   for(int i=0;i<a.length;i++)
   {
      a[i]=sc.nextInt();
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
     System.out.println("Array in Ascending Order");
     for(int i=0;i<a.length;i++)
     {
       System.out.print("\t"+a[i]);
     }
  }
}
import java.util.*;
class ArraySort
{
  int a[];
 void setArray(int a[])
 {
   this.a=a;
 }
 int [] getArray()
 {
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
   return a;
   /* System.out.println("Array Elements are \n");
        for(int i=0;i<a.length;i++)
        {
          System.out.print("\t"+a[i]);
     }*/
 }
}
public class SortArrayApp
{
   public static void main(String []args)
   {
     ArraySort as = new ArraySort();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Array elemnts");
     int a[]=new int[6];
     for(int i=0;i<a.length;i++)
     {
      a[i]=sc.nextInt();
     }
     as.setArray(a);
    a=as.getArray();
     System.out.println("Array Elements are \n");
	         for(int i=0;i<a.length;i++)
	         {
	           System.out.print("\t"+a[i]);
     }
   }
}
import java.util.*;
public class ReverseArray
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

     for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
     {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

     }
     System.out.println("Array in Reverse Order");
     for(int i=0;i<a.length;i++)
     {
       System.out.print("\t"+a[i]);
     }
  }
}
import java.util.*;
public class CreateArray
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
   for(int i=0;i<a.length;i++)
   {
    System.out.print("\t"+a[i]);
   }
  }
}
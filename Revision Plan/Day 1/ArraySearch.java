import java.util.*;
public class ArraySearch
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Array Elements");
   int a[]=new int[6];
   for(int i=0;i<a.length;i++)
   {
     a[i]=sc.nextInt();
   }
   System.out.println("Array Elements are...\n   ");
   for(int i=0;i<a.length;i++)
   {
    System.out.print(a[i]+"\t");
   }
   System.out.println("\nEnter a Element to Search ");
   int snum=sc.nextInt();

   boolean b=false;
   int index=-1;
   for(int i=0;i<a.length;i++)
   {
    if(snum==a[i])
    {
      b=true;
      index=i;
      break;
    }
   }
   if(b==true)
   {
     System.out.println("...Element is Found... at index "+index);
   }
   else
     System.out.println("**Element is not Found** "+index);
 }
}
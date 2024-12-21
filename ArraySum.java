import java.util.*;
public class ArraySum
{
   public static void main(String []args)
   {
      int a[]=new int[5];
	  int sum=0,i;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 5 Elements of array");
	  for(i=0;i<a.length;i++)
	  {
	    a[i]=sc.nextInt();
	  }
	  
	  System.out.println("Display of Array Elements\n");
	  for(i=0;i<a.length;i++)
	  {
	   System.out.print("\t"+a[i]);
	   sum=sum+a[i];
	  }
	  System.out.print("\nSum of Array Elements is"+sum);
	  
   }
}
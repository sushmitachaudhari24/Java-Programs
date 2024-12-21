import java.util.*;
public class ArrayMinMax
{
   public static void main(String []args)
   {
    int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Elements of Array");
	for(int i=0;i<5;i++)
	{
	 a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	for(int i=0;i<5;i++)
	{
	  if(a[i]>max)
	  {
	   max=a[i];
	  }
	  else{
	    min=a[i];
	      }
	}
	System.out.println("Min is "+min+"\nMax is "+max);
   }
}
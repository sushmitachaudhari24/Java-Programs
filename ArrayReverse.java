import java.util.*;
public class ArrayReverse
{
  public static void main(String [] args)
  {
    int a[]=new int[5];
	int temp,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Elements of Array");
	for(i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	}
	for(i=0,j=a.length-1;i<a.length/2;i++,j--)
	{
	  temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	}
	
	System.out.println("Array after Reverse");
	for(i=0;i<a.length;i++)
	{
	  System.out.printf("\t"+a[i]);
	}
  }
}
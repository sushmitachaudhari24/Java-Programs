import java.util.*;
public class OccuranceArray
{
  public static void main(String []args)
  {
    int a[]=new int [10];
	Scanner sc=new Scanner(System .in);
	System.out.println("Enter 10 array Elements\n");
	for(int i=0;i<a.length;i++)
	{
	   a[i]=sc.nextInt();
	}
	System.out.println("Display of Array Elements\n");
	for(int i=0;i<a.length;i++)
	{
	  System.out.print("\t"+a[i]);
	}
	//Swapping
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.print("\nDisplay of Sorted Array Elements\n");
	for(int i=0;i<a.length;i++)
	{
	  System.out.print("\t"+a[i]);
	}
	System.out.println();
	int count=1;
	for(int i=0;i<a.length;i++)
	{
		if(i==a.length-1)
			  System.out.println("\n "+a[i]+" "+count+" times");
		else if(a[i]==a[i+1])
		{
			count++;
		}
         else{
		      System.out.println(" "+a[i]+" "+count+" times");
			  count=1;
		 }			 
	}
  }
}
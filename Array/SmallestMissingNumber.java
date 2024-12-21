import java.util.*;
public class SmallestMissingNumber
{
	public static void main(String []args)
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				}
			}
		}
		System.out.println("\nElements of Array after Sorting are\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
	    }
	    for(int i=0;i<a.length;i++)
	    {
			for(int j=i;j<j+1;j++)
			{

			}
		}
	}
}
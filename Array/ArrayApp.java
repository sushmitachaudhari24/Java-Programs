import java.util.*;
public class ArrayApp
{
	public static void main(String []args)
	{
		int a[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements is"+sum);
	}
}
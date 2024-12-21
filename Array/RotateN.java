import java.util.*;
public class RotateN
{
  public static void main(String []args)
  {
    int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Elements of an Array");
	for(int i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	int temp=0,k=0;
	System.out.println("Enter position From Rotate Array");
	int position=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		for(int r=position; ;r--)
		{
	       temp=a[i];
           for(int j=0 ;j<a.length-1;i++)
		   {k=j+1;
		     a[j]=a[k];
		   }
		   a[a.length-1]=temp;

		}
	}
	System.out.println("Array After Rotation\n");
	for(int i=0;i<a.length;i++)
	{
	  System.out.print("\t"+a[i]);
	}
  }
}
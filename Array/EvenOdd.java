import java.util.*;
public class EvenOdd
{
	public static void main(String []args)
	{
		 int a[]=new int[5];
		 int e[]=new int[5];
		 int o[]=new int[5];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 5 Elements of Array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int j=0,k=0;
		 for(int i=0;i<5;i++)
		 {
			 if(a[i]%2==0)
			 {
				 e[j]=a[i];
				 j++;
			 }
			 else{
				 o[k]=a[i];
				 k++;
			 }
		 }
		 System.out.print("\nEven Array Elements\n");
          for(int i=0;i<j;i++)
		  {
			System.out.print("\t"+e[i]);
		  }
		  System.out.print("\nOdd Array Elements\n");
         for(int i=0;i<k;i++)
		  {
			System.out.print("\t"+o[i]);
		  }
	}
}
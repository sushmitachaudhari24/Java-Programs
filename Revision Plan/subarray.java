import java.util.*;
public class subarray
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter A Array");
     int a[]=new int [7];
     for(int i=0;i<a.length;i++)
     {
      a[i]=sc.nextInt();
     }
     System.out.println("Enter a Sum:");
     int sum=sc.nextInt();
     int sum1=0;
     for(int i=0;i<a.length;i++)
     {    sum1=a[i];
		 for(int j=i+1;j<a.length;j++)
		 {
			 sum1=sum1+a[j];
			 if(sum==sum1)
			 {
				 System.out.println("\n["+i+"...."+j+"]\t{");
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.print("}");
			 }

		 }
	 }
   }
}
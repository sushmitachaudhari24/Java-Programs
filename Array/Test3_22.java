import java.util.*;
public class Test3_22
{
    public static void main(String []args)
    {
       int a[]=new int[]{1,3,6,21,4,9,12,3,16,10};
       Scanner sc=new Scanner(System.in);
       //System.out.println("Enter Array Elements");
       //for(int i=0;i<a.length;i++)
      // {
      //   a[i]=sc.nextInt();
      // }

     for(int i=0;i<a.length;i++)
     {
		if(i<a.length-4)
		{
	     int l=i+4;
		 		int max=a[i];
		 		for(int j=i;j<l;j++)
		 		{
		            if(a[j]>max)
		            {
		               max=a[j];
		 		   }
		 		}
		 		System.out.println();
		 		 for(int k=i;k<l;k++)
		 		 {
		 			 System.out.print(a[k]+" ");
		 		 }

		 System.out.print("--->"+max);
	    }

	 }
    }
}
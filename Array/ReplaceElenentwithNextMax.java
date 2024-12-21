import java.util.*;
public class ReplaceElenentwithNextMax
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[]{45, 20, 100, 23, -5, 2, -6};
    // System.out.println("Enter array Elements");
    // for(int i=0;i<a.length;i++)
    // {
    //        a[i]=sc.nextInt();
	// }
	 for(int i=0;i<a.length;i++)
	 {
        for(int j=i+1;j<a.length;j++)
        {
           if(a[j]>a[i] && a[i]!=a[j])
           {
			   a[i]=a[j];
		   }
		   if(i==(a.length-1))
		   {
			   a[i]=-1;
		   }

		}

	 }
	 for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+"\t");
	  }
  }
}
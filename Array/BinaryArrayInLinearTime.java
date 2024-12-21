import java.util.*;
public class BinaryArrayInLinearTime
{
  public static void main(String []args)
  {
     int a[]=new int[8];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter binary (0,1) Array Elements");
     for(int i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++)
     {
       for(int j=i+1;j<a.length;j++)
       {
        if(a[i]>a[j])
        {
			 int temp=a[i];
			          a[i]=a[j];
          a[j]=temp;
		}
       }
     }

      for(int i=0;i<a.length;i++)
          {
           System.out.println(a[i]+"\t");
     }
  }
}
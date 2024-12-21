import java.util.*;
public class LargestGapBtwArrEmt
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array Elements");
     int a[]=new int[8];
     for(int i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }

     for(int i=0;i<a.length;i++)
     {
        for(int j=0;j<a.length;j++)
        {
           if(a[i]<a[j])
           {
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
        }
     }
     System.out.println("Array Elements are");
      for(int i=0;i<a.length;i++)
	      {
	      System.out.print(" "+a[i]);
	      }
    System.out.println();
      int gap=a[1]-a[0];
      for(int i=0;i<a.length-1;i++)
      {
		  if((a[i+1]-a[i])>gap)
		  {
			  gap=a[i+1]-a[i];
		  }
	  }
       System.out.println("Largest Gap is "+gap);
  }
}
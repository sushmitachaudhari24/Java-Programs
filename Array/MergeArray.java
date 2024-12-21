import java.util.*;
public class MergeArray
{
  public static void main(String []args)
  {
      int a[]=new int[5];
	  int b[]=new int[5];
	  int temp=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 5 Elements of First Array");
	  for(int i=0;i<a.length;i++)
	  {
	    a[i]=sc.nextInt();
	  }
	  
	  System.out.println("Enter 5 Elements of Second Array");
	  for(int i=0;i<b.length;i++)
	  {
	    b[i]=sc.nextInt();
	  }
	  
	  //merge
	  int c[]=new int[10];
	   int k=0;
	  for(int i=0;i<a.length;i++)
	  {
	     c[k]=a[i];
           k++;
	  }
	  for(int i=0;i<b.length;i++)
	  {
	   c[k]=b[i];
	   k++;
	  }
	  //sorting array
	  for(int i=0;i<c.length;i++)
	  {
	   for(int j=i+1;j<c.length;j++)
	   {
	     if(c[i]<c[j])
		 {
		    temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		 }
	   }
	  }
	   System.out.println("Array after Merge and Sorting\n");
	   for(int i=0;i<c.length;i++)
	   {
	      System.out.print("\t"+c[i]);
	   }
	   
  }
}
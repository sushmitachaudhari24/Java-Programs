import java.util.*;
public class ArrayOrder
{
 
    public static void main(String []args)
	{
	 int a[]=new int[5];
	 int temp,i,j;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 5 Elements of Array");
	  for(i=0;i<a.length;i++)
	  {
	     a[i]=sc.nextInt();
	  }
	   System.out.println("Display of Array\n");
	   for(i=0;i<a.length;i++)
	   {
	     System.out.print("\t"+a[i]);
	   }
	   //Ascending logic
	   
	   for(i=0;i<a.length;i++)
	   {
	      for(j=i+1;j<a.length;j++)
		  {
		     if(a[i]>a[j])
			 {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			 }
		  }
	   }	
       System.out.print("\nDisplay Ascending Array\n");
	   for(i=0;i<a.length;i++)
	   {
	     System.out.print("\t"+a[i]);
	   }	

 //Descending logic
	   
	   for(i=0;i<a.length;i++)
	   {
	      for(j=i+1;j<a.length;j++)
		  {
		     if(a[i]<a[j])
			 {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
			 }
		  }
	   }	
       System.out.print("\nDisplay Descending Array\n");
	   for(i=0;i<a.length;i++)
	   {
	     System.out.print("\t"+a[i]);
	   }		   
	   
	}
}
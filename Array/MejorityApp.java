import java.util.*;
public class MejorityApp
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[6];
   int temp=0;
   System.out.println("Enter 6 Elements of Array");
   for(int i=0;i<a.length;i++)
   {
    a[i]=sc.nextInt();
   }
   //Sorting
    
	//System.out.println("Sorted Array is\n");
	for(int i=0;i<a.length;i++)
	{
	   for(int j=i+1;j<a.length;j++)
	   {
	      if(a[i]>a[j])
		  {
		     temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		  }
	   }
	}
	int count=0,number=0;
	for(int i=0;i<a.length;i++)
	{ count=1;
	  for(int j=i+1;j<a.length;j++)
	  {
		  if(a[i]==a[j])
		  {
			  count++;
		  }
		  else{
			  break;
		  }
	  }
	  if(count>((a.length)/2))
	  { number=a[i];
         System.out.println("Mejority Element is "+number+"---->"+count);
		  break;
	  }
	  
	}
	
	if(count<((a.length)/2))
	{
		   System.out.println("Not Element is Mejority");
	}		   
  }
}
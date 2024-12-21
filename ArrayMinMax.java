import java.util.*;
public class ArrayMinMax
{
   public static void main(String []args)
   {
    int a[],min,max;
	a=new int[]{10,20,40,2,5,56};
	System.out.print("\n Array Elements are\n");
	for(int i=0;i<a.length;i++)
	{
	  System.out.print("\t"+a[i]);
    }
	min=a[0];
	max=a[0];
	for(int i=0;i<5;i++)
	{
	  if(a[i]>max)
	  {
        max=a[i];
	  }
       else{
		    min=a[i];
	   }		   
	}
	System.out.println("Max is"+max+"\n Min is "+min);
	
   }
}
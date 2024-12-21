import java.util.*;
public class RotateClockwiseArray
{
  public static void main(String [] args)
  {
	   int a[]=new int[5];
	     Scanner sc=new Scanner(System.in);
	     System.out.print("Enter Array Elements:");
	     for(int i=0;i<a.length;i++)
	     {
	       a[i]=sc.nextInt();
	     }
	     System.out.println("Enter How many  clackwise Rotation Do you want");
	     int r=sc.nextInt();
	     int temp,i=0;
	     while(r!=0)
	     {
	      for(i=0;i<a.length-1;i++)//12345//21345
	      {
	  		temp=a[i];//1//2
	  		a[i]=a[i+1];//2//1
	  		a[i+1]=temp;//2=1
	  	  }
	  	   for( i=0;i<a.length;i++)
		  	 {
		  	          System.out.print(r+"--> "+a[i]+"\t");
            }
             System.out.println();
	       r--;
	     }

  }
}
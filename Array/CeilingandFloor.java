import java.util.*;
public class CeilingandFloor
{
   public static void main(String []args)
   {
     int a[]=new int[5];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 5 Elemnts of an Array");
     for(int i=0;i<a.length;i++)
     {
        a[i]=sc.nextInt();
     }
     int temp=0;
     //Display of Array Elements After Sorting

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
        System.out.println(" Sorted Array Elements are\n");
     for(int i=0;i<a.length;i++)
     {
         System.out.print("\t"+a[i]);
     }
//  System.out.println("\nEnter a number");
//     int number=sc.nextInt();
   int ceiling=0 , floor=0;
  for(int number=0;number<10;number++)
  {
	        for(int i=0;i<a.length;i++)
	        {
	  		  if(a[0]>number)
	  		  {
	  			  ceiling = a[0];
	  			  floor = -1;
	  			  break;
	  		  }
	  		else  if(a[a.length-1]<number)
	  		  {
	  			  ceiling=-1;
	  			  floor=a[a.length-1];
	  			  break;
	  		  }
	  		  else if(a[i]==number)
	                   {
	                       ceiling=a[i];
	                       floor=a[i];
	                        break;
	                   }
	  		  else if(a[i]<number && a[i+1]>number)
	  		  {
	  			  ceiling=a[i+1];
	  			  floor=a[i];
	  			  break;
	  		  }
	  }
	   System.out.println("\nNumber is "+number+"\nCeiling is "+ceiling+"\nFloor is "+floor);
  }

   }
}

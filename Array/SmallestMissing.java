import java.util.*;
public class SmallestMissing
{
   public static void main(String []args)
   {
     int a[]=new int[6];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 6 elements of Array");
     for(int i=0;i<a.length;i++)
     {
        a[i]=sc.nextInt();
     }

     //sortArray

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

      System.out.println("Elements of Arrays are\n");
      for(int i=0;i<a.length;i++)
      {
        System.out.print("\t"+a[i]);
      }
      int min=0,flag=0;
      for(int i=0,j=i+1;i<a.length-1;i++,j++)
      {
		   //for(int j=i+1;;j++)
          //{

		  if((a[j]-a[i])>1)
		  {
			  System.out.print("\n Smallest Missing Element\n"+(a[i]+1));
			  flag=0;
			  break;
		   }
		   if((a[j]-a[i])==0 || (a[j]-a[i])==1)
		   	 {
		   		flag=1;
		   }

	  }
	  if(flag==1)
	  {


		System.out.println("Sorry not found");

	  }


      System.out.println();
   }
}
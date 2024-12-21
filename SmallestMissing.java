import java.util.*;
public class SmallestMissing
{
  public static void main(String []args)
  {
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[8];
	   System.out.println("Enter Array Elements");
	   for(int i=0;i<a.length;i++)//  input Array Elements
	   {
           a[i]=sc.nextInt();
	   }
	   //Sort Array
	    for(int i=0;i<a.length;i++)    //0 1 3 4 5 6 7 9
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
		//print Sorted Array
	    System.out.println("Array is\n");
	    for(int i=0;i<a.length;i++)
	    {
           System.out.print(a[i]+" ");
		}

       boolean f=false;
		for(int i=0,j=1+i;i<a.length-1;i++,j++)
		{

			if((a[j]-a[i])>1)
			{f=true;
				System.out.println("\nSmallest Missing Number is :"+(a[i]+1))   ;
				break;
			}
		}
       if(f==false)
       {
         System.out.println("Not missing Element");
	   }



  }
}
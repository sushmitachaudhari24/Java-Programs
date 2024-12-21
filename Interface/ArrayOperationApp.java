import java.util.*;
interface ArrayOperation
{
     void setvalue(int a[]);
     void Perform();
}

class AscSorting implements ArrayOperation
{

	int a[];  // 12345
	int i,j,temp;
    public void setvalue(int a[])
     {
		 this.a=a;
     }
   public void Perform()
     {
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
		  System.out.println("Array Elements are");
		  for(i=0;i<a.length;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
	 }
}

class DscSorting implements ArrayOperation
{

	int a[];  // 12345
	int i,j,temp;
    public void setvalue(int a[])
     {
		 this.a=a;
     }
   public void Perform()
     {
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
		  System.out.println("Array Elements are");
		  for(i=0;i<a.length;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
	 }
}

class Reverse implements ArrayOperation
{
   int a[];
	public void setvalue(int a[])
	{
		this.a=a;
	}

	public void Perform()
	{
		for(int i=0,j=a.length-1;i<(a.length/2);i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Reverse Array is \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
class Rotation implements ArrayOperation
{
	 int a[],ind,no;
	 public void setvalue(int a[])
	 {
		 this.a=a;
	 }
	 public void Perform()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter How many rotation do you want? ");
		 ind=sc.nextInt();
		 int temp;
		 for(int k=0;k<ind;k++)
		 {temp=a[0];
         	for(int i=0;i<a.length-1;i++)
         	{
				 a[i]=a[i+1];
			}
		    a[a.length-1]=temp;
		 }
		 System.out.println("Rotate Array is \n");
		 		for(int i=0;i<a.length;i++)
		 		{
		 			System.out.print(a[i]+" ");
		}
	 }
}
public class ArrayOperationApp
{
	public static void main(String []args)
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	    }
	System.out.println("-------------\n1.Ascending Sorting \n2.Descending Sorting\n3.Reverse\n4.Rotation\n-----------------\nEnter Your Choice");
	int ch=sc.nextInt();
	switch(ch)
	{
		case 1: ArrayOperation a1=new AscSorting();
             a1.setvalue(a);
             a1.Perform();
             break;
        case 2:  ArrayOperation a2=new DscSorting();
			     a2.setvalue(a);
                 a2.Perform();
                 break;
        case 3: ArrayOperation a3=new Reverse();

       		 a3.setvalue(a);
       		 a3.Perform();
              break;
        case 4: ArrayOperation a4=new Rotation();
               a4.setvalue(a);
       		   a4.Perform();
              break;
        default:System.out.println("Invalid Choice");
	}


	}
}
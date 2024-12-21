import java.util.*;
interface class ArrayOperation
{
   void PerformOperation(int x[]);
}
class Sorting implements ArrayOperation
{
	int x[];
 void PerformOperation(int a[])
 {
	 x=a;
	 for(int i=0;i<x.length;i++)
     {
		 for(int j=i+1;j<x.length;j++)
		 {
             if(x[i]>x[j])
             {
				 int temp=x[i];
				 x[i]=x[j];
				 x[j]=temp;
		     }
		 }
     }
     System.out.println("Elements are in Sorted Order");
     for(int i=0;i<x.length;i++)
     {
         System.out.print(x[i]+"  ");
	 }

 }
}
class Insertion implements ArrayOperation
{
	int no,ind;
	void setValue(int Value,int index)
	{
		no=Value;
		ind=index;
	}
 void PerformOperation(int x[])
 {
 }
}
class Deletion implements ArrayOperation
{
	int ind;
		void setValue(int index)
		{
			ind=index;
	}
 void PerformOperation(int x[])
 {
 }
}
class Reverse implements ArrayOperation
{
 void PerformOperation(int x[])
 {
 }
}
public class ArrayOperationApp
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("How Many Element Do You Want To Insert In Array");
     int size=sc.nextInt();
     int a[]=new int[size];
     int no,ind;
     System.out.println("Enter Array Elements");
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
	 }
     System.out.println("Enter Your Choice According To Below Menu\n==================================\n1.Sorting\n2.Insertion\n3.Deletion\n4.Reverse\n==================================\nEnter Here: ");
     int ch=sc.nextInt();
     switch(ch)
     {
       case 1:Sorting s=new Sorting();
              s.PerformOperation(a);
              break;
       case 2:Insertion i=new Insertion();
              System.out.println("Enter  Element and Index Where to insert");
              i.setValue(no,ind);
              i.PerformOperation(a);
              break;
       case 3:Deletion d=new Deletion();
              d.setValue(ind);
              d.PerformOperation(a);
              break;
       case 4:Reverse r=new Reverse();
              r.PerformOperation(a);
              break;
       default: System.out.println("SORRY!!! You Have Entered Wrong Choice.");
     }
  }
}
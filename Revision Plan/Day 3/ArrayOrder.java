import java.util.*;
class ArrParent
{ int a[];
  void setValue(int arr[])
  {
    a=arr;
  }
  void arrangeSequence()
  {
	  System.out.println("Array Elements are");
  }
}
class ArangeAscOrder extends ArrParent
{
 public void arrangeSequence()
 {  // super.arrangeSequence();
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
	 System.out.println(" Ascending Array Elements are");
	 for(int i=0;i<a.length;i++)
	 {
       System.out.print(a[i]+"\t");
	 }
 }
}
class ReverseArray extends ArrParent
{
 public void arrangeSequence()
 {
	 for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
	 {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
	 }
	 System.out.println(" Reverse Array Elements are");
	 	 for(int i=0;i<a.length;i++)
	 	 {
	        System.out.print(a[i]+"\t");
	 }
 }
}
public class ArrayOrder
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter Array Elements");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }

    ArangeAscOrder aa=new ArangeAscOrder();
    aa.setValue(a);
    aa.arrangeSequence();
    ReverseArray ra=new ReverseArray();
    ra.setValue(a);
    ra.arrangeSequence();
  }
}
import java.util.*;
class ArrParent
{int a[];
  void setValue(int arr[])
  {
   a=arr;
  }
  void arrangeSeq()
  {
  }
}
class AscOrder extends ArrParent
{
  void arrangeSeq()
  {
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
	  System.out.println("Array Elements in Ascending Order");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print("\t"+a[i]);
	  }
  }
}
class DescOrder extends ArrParent
{
  void arrangeSeq()
  {

	  	  for(int i=0;i<a.length;i++)
	  	  {
	  		  for(int j=i+1;j<a.length;j++)
	  		  {
	  			  if(a[i]<a[j])
	  			  {
	                  int temp=a[i];
	                  a[i]=a[j];
	                  a[j]=temp;
	  			  }
	  		  }
	  	  }
	  	  System.out.println("Array Elements in Descending Order");
	  	  for(int i=0;i<a.length;i++)
	  	  {
	  		  System.out.print("\t"+a[i]);
	  	  }

  }
}
public class ArrOrder
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter order \n1.Ascending \n2.Descending\n");
    int c=sc.nextInt();
    switch(c)
    {
      case 1:AscOrder ar=new AscOrder();
               ar.setValue(a);
               ar.arrangeSeq();
               break;
      case 2: DescOrder d=new DescOrder();
               d.setValue(a);
               d.arrangeSeq();
               break;
    }
  }
}

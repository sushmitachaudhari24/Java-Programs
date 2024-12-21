import java.util.*;
class USumOfElement
{
	public static void main(String []args)
	{

  int a[]=new int[6];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 5 Elements of Array");
  for(int i=0;i<a.length;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("Enter sum to find Pair");
  int sum=sc.nextInt();
  int nsum=0,x=0,y=0,flag=0;
  for(int i=0;i<a.length;i++)
  {
     for(int j=i+1;j<a.length;j++)
	 {
	    nsum=a[i]+a[j];
		if(sum==nsum)
		{
		  x=a[i];
		  y=a[j];
		 System.out.println("Pair is "+x+" and "+y);

		}
	 }
  }

}
}
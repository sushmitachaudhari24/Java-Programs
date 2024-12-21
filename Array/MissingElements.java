import java.util.*;
public class MissingElements
{
   public static void main(String []args)
   {
      int a[]=new int[5];
	  int f=0,l=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter 5 Elements of Array");
	  for(int i=0;i<a.length;i++)
	  {
	   a[i]=sc.nextInt();
	  }
	  int ni=0;
	  System.out.println("\n");
	  for(int i=0;i<a.length-1;i++)
	  { // f=a[i]+1;

	   // ni=i+1;
	   // l=a[ni];
	    for(int j=a[i];j<a[i+1]-1;)
		{
		 System.out.print("\t"+(++j));
		}

	  }
   }
}

import java.util.*;
public class DeleteApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 int count=0,i=0,index;
	 System.out.println("Enter 5 Array Elements");
	 for(i=0;i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	 }
	 System.out.println("Enter number from to delete element");
     index=sc.nextInt();
	 for(i=index;i<=a.length-1;i++)
	 {

	 }

	   System.out.println(" Array Elements\n");
	 for(i=0;i<a.length-1;i++)
	 {
	   System.out.print("\t"+a[i]);
	 }
   }
}
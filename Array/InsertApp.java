import java.util.*;
public class InsertApp
{
  public static void main(String []args)
  {
     int a[]=new int[6];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 5 Elements of Array");
	 for(int i=0;i<a.length-1;i++)
	 {
	    a[i]=sc.nextInt();
	 }
	 System.out.println("Enter Index Where You want to Insert Element");
	 int index=sc.nextInt();
	 System.out.println("Enter Element to insert");
	 int x=sc.nextInt();
	 for(int i=a.length-1;i>index-1;i--)
	 {
	  a[i]=a[i-1];
	 }
	 a[index]=x;
	 System.out.println("Array after Insertion is\n");
	 for(int i=0;i<a.length;i++)
	 {
	   System.out.print(a[i]+"\t");
	 }
  }
}
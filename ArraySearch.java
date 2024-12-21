import java.util.*;
public class ArraySearch
{
   public static void main(String []args)
   {
     int a[]=new int[5];
	 int sElement,flag=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 5 Array Elements");
	 for(int i=0;i<a.length;i++)
	 {
	    a[i]=sc.nextInt();
	 }
	 System.out.println("Enter a Number to Search");
	 sElement=sc.nextInt();
	 for(int i=0;i<a.length;i++)
	 {
	   if(a[i]==sElement)
	   {
	     System.out.println("Search is Successfull!!!");
		 break;
	   }
	   else{
		    flag=1;
	   }
	 }
	 if(flag==1)
	 {
		  System.out.println("Sorry We can`t Find it");
	 }	 
	 
   }

}
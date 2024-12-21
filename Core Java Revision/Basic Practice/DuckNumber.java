import java.util.*;
public class DuckNumber
{
 public static void main(String []args)
 {
	 Scanner sc=new Scanner(System.in);
  System.out.println("Enter limit");
  int limit=sc.nextInt();
  boolean f=false;
  System.out.println("Duck numbers are");
   for(int i=1;i<=limit;i++)
   {int temp=i;
   f=false;
     while(temp!=0)
     {
		 int rem=temp%10;
		 if(rem==0)
		 {f=true;
			 break;
		 }

		 temp=temp/10;
	 }
	 if(f==true)
	 {
		 System.out.println(i);
	 }
   }
 }
}
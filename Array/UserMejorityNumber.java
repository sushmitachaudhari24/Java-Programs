import java.util.*;
public class UserMejorityNumber
{
   public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter array elements");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }

     System.out.println("Array elements\n");
        for(int i=0;i<a.length;i++)
        {
          System.out.print("\t"+a[i]);
    }
    int count=1;
    System.out.println("\nEnter a number to check mejority or not");
    int num=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
     if( num==a[i])
     {
      count++;
     }
    }
    if(count>(a.length/2))
    {
       System.out.println(num+" is mejority element");
    }
    else
    {
		 System.out.println("Not Mejority Element");
	}

   }
}
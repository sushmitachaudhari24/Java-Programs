import java.util.*;
public class Evenno
{
   public static void main(String [] args)
   {
     int i;
	 i=1;
	 System.out.println("Even numbers between 1 to 100");
	 while(i<=100)
	 {
	   if(i%2==0)
	   {
	    System.out.println(i);
	   }
	   i++;
	 }
	 
	 i=1;
	 System.out.println("Odd numbers between 1 to 100");
	 while(i<=100)
	 {
	   if(i%2!=0)
	   {
	    System.out.println(i);
	   }
	   i++;
	 }
   }

}

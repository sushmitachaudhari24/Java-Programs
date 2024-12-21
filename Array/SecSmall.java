import java.util.*;
public class SecSmall
{
   public static void main(String []arg)
   {
     int a[]=new int[5];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Array Elements");
     for(int i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }
     int min=a[0];
     int smin=a[0];

      for(int i=0;i<a.length;i++)
	      {
	         if(min<a[i])
	         {
	             min=a[i];
	         }
	         else if(a[i]<min && (min==smin || a[i]>smin))
	         {
                 smin=a[i];
			 }
	      }
     System.out.println(min+" Sec Minimum "+smin);
   }
}
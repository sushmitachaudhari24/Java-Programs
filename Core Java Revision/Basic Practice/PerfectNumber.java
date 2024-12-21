import java.util.*;
public class PerfectNumber
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter limit");
   int limit=sc.nextInt();
   for(int i=1;i<=limit;i++)
   { int sum=0;
     for(int j=1;j<i;j++)
     {
        if(i%j==0)
        {
          sum=sum+j;
		}
	 }
	 if(sum==i)
	 {
      System.out.println(sum);
 	 }

   }
 }
}
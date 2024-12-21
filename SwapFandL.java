//Swap first and last digit of number
import java.util.*;
public class SwapFandL
{
	public static void main(String []args )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
        int f=0,l=0,temp,rem;
		temp=num;
        l=num%10;
        int count=0;
         while(num!=0)
		 {
			  rem=num%10;
			  num=num/10;
			  f=rem;
			 count++;
		 }
         	 temp=temp/10;

              count=count-2;

              int pow=1;
              for(int i=1;i<=count;i++)
              {
                pow=10*pow;
			  }

              int mid=temp%pow;
			 //temp=temp/;
              //System.out.println(" First "+f+" Last "+l+" temp "+temp+"mid="+mid);
              int swpno=(l*pow*10)+(mid*10)+f;
              System.out.println("Swapped First and Last digit of number"+ swpno);
	}
}
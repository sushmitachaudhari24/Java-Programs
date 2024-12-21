import java.util.*;
public class PrimeNumberN
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count,sum=1;
		System.out.println("Prime Numbers are\n1");
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int n=1;n<=i;n++)
			{
				 if(i%n==0)
				 {
					 count++;
				 }
			}
			if(count==2)
			{ sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of ALL Prime numbers is "+sum);
	}
}
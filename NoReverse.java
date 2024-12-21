import java.util.*;
public class NoReverse
{
	public static void main(String []args)
	{
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse Number is "+rev);
	}
}
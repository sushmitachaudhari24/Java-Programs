import java.util.*;
public class SumNatural
{
  public static void main(String []args)
  {
    int i,sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	i=0;
	while(i<=n)
	{
	 sum=sum+i;
	 i++;
	}
	System.out.println("Sum of Natural numbersup to "+n+" is "+sum);
  }
}
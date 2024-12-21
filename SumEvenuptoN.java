import java.util.*;
public class SumEvenuptoN
{
  public static void main(String []args)
  {
    int i,n,esum=0,osum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	i=1;
	while(i<=n)
	{
	  if(i%2==0)
	  {
	   esum=esum+i;
	  } 
	  else{
	   osum=osum+i;
	   }
	   i++;
	}
	System.out.println("Sum of Even Numbers is "+esum+"\n Sum of odd Numbers is "+osum);
  }
}
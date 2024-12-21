import java.util.*;
public class StrongNumber
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
           int num=sc.nextInt();
           int temp=0,fact=1,sum=0;
           temp=num;
           while(temp!=0)
           {
             int rem=temp%10;
             temp=temp/10;
             fact=1;
             for(int i=1;i<=rem;i++)
             {
               fact=fact*i;
             }

             sum=sum+fact;
           }
        	if(sum==num)
        	{
				System.out.println("Strong number is"+sum);
			}
			else{
				System.out.println("Not a Strong Number");
			}
 }
}
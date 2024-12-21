import java.util.*;
public class RevApp
{
 public static void main(String []args)
 {
   int num,rev,rem;
   rev=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   num=sc.nextInt();
   int temp=num;
   while(num!=0)
   {
     rem=num%10;
	 num=num/10;
	 rev=rev*10+rem;
   }
   System.out.println("Reverse of "+temp+" is "+rev);
 }
}
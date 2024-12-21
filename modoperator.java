import java.util.*;
public class modoperator
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   int num,temp,p=1,count=0,l=0,f=0,rem=0,mid=0;;
   System.out.println("Enter a number");
   num=sc.nextInt();
   temp=num;
   while(temp!=0)//1234
   {
	   temp=temp/10;
	   count++;
   }

    int i=1;
    temp=num;
   while(i<count-1) //4 3 2 1
   {
	   p=p*10;//10//100//1000
	   i++;
   }
   temp=num;
   System.out.print("\np--"+p);

   l=temp%10;//4
   temp=temp/10;//123
   mid=temp%p;
   f=temp/p;

  // System.out.print("\nf--"+f+"\nmid--"+mid+"\nl--"+l);

   int swap=l*(p*10)+mid*10+f;
   System.out.println("\nSwaped number-----"+swap);
 }
}
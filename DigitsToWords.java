import java.util.*;
public class DigitsToWords
{
 public static void main(String [] args)
 {
     int num,rem,rev=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  num=sc.nextInt();
	  while(num!=0)
	  {
	   int r=num%10;
	       num=num/10;
		   rev=rev*10+r;
		  
	  }
	  while(rev!=0)
	  {
		   rem=rev%10;
		   rev=rev/10;
		   
	     if(rem==0)
		 {
		  System.out.printf("Zero ");
		 }
		 if(rem==1)
		 {
		  System.out.printf("One ");
		 }
		 if(rem==2)
		 {
		  System.out.printf("Two ");
		 }
		 if(rem==3)
		 {
		  System.out.printf("Three ");
		 }
		 if(rem==4)
		 {
		  System.out.printf("Four ");
		 }
		 if(rem==5)
		 {
		  System.out.printf("Five ");
		 }if(rem==6)
		 {
		  System.out.printf("Six ");
		 }if(rem==7)
		 {
		  System.out.printf("Seven ");
		 }
		 if(rem==8)
		 {
		  System.out.printf("Eight ");
		 }
		 if(rem==9)
		 {
		  System.out.printf("Nine ");
		 }
		 
	  }
 }
}
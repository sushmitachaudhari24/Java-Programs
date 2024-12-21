import java.util.*;
public class FreqDigit
{
  public static void main(String [] args)
  {
     int n,i,c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,rem;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number");
     n=sc.nextInt();
     while(n>0)
     {
		 rem=n%10;
		 if(rem==0)
		     c0++;
		 else if(rem==1)
		     c1++;
		 else if(rem==2)
		     c2++;
		 else if(rem==3)
		     c3++;
		 else if(rem==4)
		     c4++;
		 else if(rem==5)
		     c5++;
		 else if(rem==6)
		     c6++;
		 else if(rem==7)
		     c7++;
		 else if(rem==8)
		     c8++;
		 else
		     c9++;
		 n=n/10;
	 }
	 if(c0>0)
	     System.out.println("0 ="+c0);
	     if(c1>0)
	     System.out.println("1 ="+c1);
	     if(c2>0)
	     System.out.println("2 ="+c2);
	     if(c3>0)
	     System.out.println("3 ="+c3);
	     if(c4>0)
	     System.out.println("4 ="+c4);
	     if(c5>0)
	     System.out.println("5 ="+c5);
	     if(c6>0)
	     System.out.println("6 ="+c6);
	     if(c7>0)
	     System.out.println("7 ="+c7);
	     if(c8>0)
	     System.out.println("8 ="+c8);
	     if(c9>0)
	     System.out.println("9 ="+c9);
  }
}
import java.util.*;
abstract class Value
{
	int a;
	int b;
  void setValue(int a,int b)
  {
	  this.a=a;
	  this.b=b;
  }
  abstract int getResult();
}
class Power extends Value
{
	public int getResult()
	{
		int p=1;
       for(int i=1;i<=b;i++)
       {
		   p=p*a;
	   }
	   return p;
	}
}
class SearchDigit extends Value
{
	 public int getResult()
	 {
		 boolean f=false;
	    while(a!=0)
	    {
			int rem=a%10;
			 if(rem==b)
			 {
				f= true;
				break;
			 }
			 else
			 {
				f=false;
			 }
			a=a/10;
		}
		if(f==true)
		{
			return b;
		}
		else
		{
			return -1;
		}
	 }
}
public class ValueOperation
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);

     System.out.println("Enter below choice\n1.Calculate Power\n2.Search Digit");
     int ch=sc.nextInt();

     switch(ch)
     {
		 case 1:  System.out.println("Enter base and index");
                  int base=sc.nextInt();
                  int index=sc.nextInt();
                   Value v=null;
                     v=new Power();
                  v.setValue(base,index);
                  System.out.println("Power is "+v.getResult());
                  break;
         case 2:  System.out.println("Enter a number and a digit to search");
                  int no=sc.nextInt();
                  int digit=sc.nextInt();
                  SearchDigit s=new SearchDigit();
                  s.setValue(no,digit);
                   System.out.println("Result is "+s.getResult());
                  break;
	 }




  }
}
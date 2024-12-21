import java.util.*;
class Value
{
   int a,b;
  public void setValue(int a,int b)
  {
   this.a=a;
   this.b=b;
  }
}
class Add extends Value
{
  public  int getAdd()
  {
    return a+b;
  }
}
class Mul extends Value
{
	public int getMul()
	{
		return a*b;
	}
}
class Div extends Value
{
	public int getDiv()
	{
		return a/b;
	}
}

public class ValueOperationApp
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();

		 Add ad=new Add();
		ad.setValue(a,b);
		System.out.println("Addition is "+ad.getAdd());

		 Mul m=new Mul();
				m.setValue(a,b);
		System.out.println("Multiplication is "+m.getMul());
		 Div d=new Div();
				d.setValue(a,b);
		System.out.println("Division is "+d.getDiv());
	}
}
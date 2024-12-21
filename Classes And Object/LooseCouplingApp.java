import java.util.*;
abstract class Value
{
  int a,b;
  void setValue(int x,int y)
  {
   a=x;
   b=y;
  }
  abstract void performCalculation();
}
class Add extends Value
{
  void performCalculation()
  {
   System.out.println("Addition is "+(a+b));
  }
}
class Sub extends Value
{
 void performCalculation()
  {
   System.out.println("Substraction is "+(a-b));
  }
}
class Mul extends Value
{
 void performCalculation()
  {
   System.out.println("Multiplication is "+(a*b));
  }
}
class Div extends Value
{
 void performCalculation()
  {
   System.out.println("Division is "+(a/b));
  }
}

class Calculator
{
  void performOperation(Value v)
  {
   v.performCalculation();
  }
}
public class LooseCouplingApp
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Two Values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Choose From below\n==========================\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n...Enter...");
      int ch=sc.nextInt();

      Calculator c=new Calculator();
      switch(ch)
      {
		  case 1:Add ad=new Add();
		          ad.setValue(a,b);
		          c.performOperation(ad);
		  		break;
		  case 2:Sub s=new Sub();
		          s.setValue(a,b);
		          c.performOperation(s);
		  		break;
		  case 3:Mul m=new Mul();
		  		  m.setValue(a,b);
		  		  c.performOperation(m);
		  		break;
		  case 4:Div d=new Div();
		          d.setValue(a,b);
		          c.performOperation(d);
		  		break;
		  default:System.out.println("Entered Choice is Incorrect!!!");

	  }
   }
}
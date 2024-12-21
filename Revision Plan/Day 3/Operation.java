import java.util.*;
class Value
{
 public int x,y;
  public void setValue(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
}
class Add extends Value
{
  public int getAdd()
  {
    return x+y;
  }
}
class Mul extends Value
{
   public int getMul()
   {
    return x*y;
   }
}
class Div extends Value
{
    public int getDiv()
    {
     return x/y;
    }
}
public class Operation
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two numbers");
   int x=sc.nextInt();
   int y=sc.nextInt();

   Add a=new Add();
   a.setValue(x,y);
   System.out.println("Addition is "+a.getAdd());
   Mul m=new Mul();
   m.setValue(x,y);
    System.out.println("Multiplication is "+m.getMul());
   Div d=new Div();
   d.setValue(x,y);
    System.out.println("Division is "+d.getDiv());
  }
}
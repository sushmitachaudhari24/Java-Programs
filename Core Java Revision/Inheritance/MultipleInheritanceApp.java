import java.util.*;
interface A
{
  void setValue(int a,int b);

}
interface B
{
void getAdd();
}

class D implements A,B
{int a,b;
 public void setValue(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
 public  void getAdd()
  {
	  System.out.println("Addition is "+(a+b));
  }
}
public class MultipleInheritanceApp
{
  public static void main(String []args)
  {
    D dobj=new D();
    dobj.setValue(2,3);
    dobj.getAdd();
  }
}
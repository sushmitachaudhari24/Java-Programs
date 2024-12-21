import java.util.*;
class Circle
{
  private double r;
  Circle(double r)
  {
    this.r=r;
  }
  void Area()
  {
   System.out.println("Area of Circle is "+(3.14*r*r));
  }
  void Circumferece()
  {
   System.out.println("Area of Circumference is "+(2*3.14*r)); 
  }
}
public class CircleApp
{
  public static void main(String []args)
  {
    Circle c=new Circle(20);
    c.Area();
    c.Circumferece();
  }
}
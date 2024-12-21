import java.util.*;
class Circle
{
  float r;
  void setValue(float r1)
  {
  r=r1;
  }
  void  calArea()
  {
    System.out.println("Area of circle is "+(3.14f*r*r));
  }
}
 public class CircleApp
 {
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);

     Circle c=new Circle();
     System.out.println("Enter Radius");
     float radius=sc.nextFloat();

     c.setValue(radius);
     c.calArea();
   }
 }
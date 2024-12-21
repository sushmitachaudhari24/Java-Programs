import java.util.*;
class Area
{  int l,w;
  float r;
  public void setRadius(float radius)
  {
    r=radius;
  }
  public void setLengthWidth(int len,int wid)
  {
	l=len;
    w=wid;
  }

}
class Circle extends Area
{
  public float getCircleArea()
  {
     return 3.14f*r*r;
  }
}
class Rectangle extends Area
{
  public int getRectArea()
  {
   return l*w;
  }
}
public class AreaApp
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Length Width Radius");
    int l=sc.nextInt();
    int w=sc.nextInt();
    float rad=sc.nextFloat();
    Circle c=new Circle();
    c.setRadius(rad);
     System.out.println("Area of Circle is "+ c.getCircleArea());
    Rectangle r=new Rectangle();
    r.setLengthWidth(l,w);
    System.out.println("Area of Rectangle is "+ r.getRectArea());
  }
}
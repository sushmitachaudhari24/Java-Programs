import java.util.*;
class Area
{  float radius;
   int len,wid;
  public void setRadius(float radius)
  {
   this.radius=radius;
  }
  public void setLenWid(int len,int wid)
  {
   this.len=len;
   this.wid=wid;
  }
}

class Circle extends Area
{
  public float getCircleArea()
  {
   return 3.14f*radius*radius;
  }
  
}

class Rectangle extends Area
{
  public int getRectArea()
  {
   return len*wid;
  }
}

public class AreaOperation
{
  public static void main(String []args)
  {
     Circle c=new Circle();
     c.setRadius(30.0f);
     System.out.println("Area of circle "+c.getCircleArea());
     Rectangle r =new Rectangle();
     r.setLenWid(20,10);
     System.out.println("Area of Rectangle "+r.getRectArea());
     
  }
}
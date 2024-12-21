import java.util.*;
class RectArea
{
 private int length;
 private int breadth;
  RectArea(int len,int brd)
  {
    length=len;
    breadth=brd;
  }
  void Area()
  {
    System.out.println("Area of Rectangle is "+(length*breadth));
  }
}
public class RectAreaApp
{
  public static void main(String []args)
  {
      RectArea ra=new RectArea(4,5);
      ra.Area();
      RectArea ra1=new RectArea(5,8);
      ra1.Area();
  }
}
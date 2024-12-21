
class Area
{
  Area(float rad)
  {
    System.out.println("Area of Circle is "+(2*3.14f*rad));
  }
  Area(int len,int wid)
  {
   System.out.println("Area of Rectangle is "+(len*wid));
  }
}
public class AreaApp
{
   public static void main(String []args)
   {
      Area a=new Area(234f);
      a=new Area(10,20); 
   }
}
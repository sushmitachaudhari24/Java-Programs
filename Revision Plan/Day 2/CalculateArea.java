class Area
{
   Area(float radius)
   {
    System.out.println("Area of Circle is "+(3.14f*radius*radius));
   }
   Area(int len,int wid)
   {
    System.out.println("Area of Rectangle is "+(len*wid));
   }
}
public class CalculateArea
{
 public static void main(String []args)
 {
   Area a=new Area(32);
   a=new Area(3,2);
 }
}
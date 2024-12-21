import java.util.*;
abstract class Area
{
  abstract void showArea();
}
class Circle extends Area
{
 int radius;
 void setRadius(int rad)
 {
  radius=rad;
 }
 void showArea()
 {
  float area=3.14f*((float)(radius*radius));
  System.out.println("Area of Circle is "+area);
 }
}
class Rectangle extends Area
{
   int len,brd;
   void setlenbrd(int len,int brd)
   {
     this.len=len;
     this.brd=brd;
   }
   void showArea()
   {
    float area=(float)(len*brd);
    System.out.println("Area of Rectangle is "+area);
   }
}
public class AreaApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Choose from Below\n============================\n   1.Area of Circle\n   2.Area of Rectangle\n============================");
     int ch=sc.nextInt();
     switch(ch)
     {
        case 1:System.out.println("Enter Radius:");
               int rd=sc.nextInt();
               Circle c=new Circle();
               c.setRadius(rd);
               c.showArea();
               break;
        case 2:System.out.println("Enter Length and Breadth");
               int l=sc.nextInt();
               int b=sc.nextInt();
               Rectangle r=new Rectangle();
               r.setlenbrd(l,b);
               r.showArea();
               break;
        default:System.out.println("You have Entered Wrong Choice!!!");
     }
   }
}
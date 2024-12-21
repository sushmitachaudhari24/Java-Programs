import java.util.*;
class Cube
{ int x;
 void setValue(int x)
 {
 this.x=x;
 }
 int getCube()
 {
  return x*x*x;
 }
}
public class CubeApp
{
  public static void main(String []args)
  {
   Cube c=new Cube();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   c.setValue(num);
   System.out.println("Cube of given Number is "+c.getCube());
  }
}
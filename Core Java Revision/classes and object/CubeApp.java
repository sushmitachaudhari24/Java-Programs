import java.util.*;
class cube
{ private int x;
   public void setValue(int x)
   {
     this.x=x;
   }
   public int getCube()
   {
    return x*x*x;
   }
}
public class CubeApp
{
   public static void main(String []args)
   {
      cube c=new cube();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      c.setValue(num);
      System.out.println("Cube is "+c.getCube());
   }
}
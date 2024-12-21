import java.util.*;
class Power
{
  int b,p ,cal=1;
  void setValue(int base, int index)
  {
   b=base;
   p=index;
  }
   void calPower()
   {
    for(int i=1;i<=p;i++)
    {
      cal=cal*b;
    }
     System.out.println(b+"power "+p+" is"+cal);
   }

}
public class PowerApp
{
  public static void main(String []args)
  {
   Scanner sc= new Scanner(System.in);
   Power p=new Power();
    System.out.println("Enter Base and Index");
    int base=sc.nextInt();
    int index=sc.nextInt();
    p.setValue(base,index);
    p.calPower();
  }
}

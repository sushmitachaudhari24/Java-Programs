import java.util.*;
class Sum
{
  int s=0;
  void calSum(int ...x)
  {
   for(int i=0;i<x.length;i++)
   {
    s=s+x[i];
   }
   System.out.println("Sum is "+s);
  }
  
}
public class SumApp
{
 public static void main(String [] args)
 {
    Sum s=new Sum();
    s.calSum(10,20,30,40,50,60);
 }
}
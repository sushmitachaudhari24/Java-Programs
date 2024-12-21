import java.util.*;
class A extends Thread
{
 public void run()
 {
   try
   {
    for(int i=1;i<=10;i++)
    {
     System.out.println("Thread is "+i);
     Thread.sleep(10000);
    }
   }
   catch(Exception e)
   {
    System.out.println("Error is "+e);
   }
 }
}
public class Athread
{
  public static void main(String []args)
  {
   A a1=new A();
   a1.start();
  }
}
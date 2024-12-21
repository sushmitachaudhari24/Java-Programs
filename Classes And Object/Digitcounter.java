import java.util.*;
class Digitcounter1
{
   int no;
   void setData(int num)
   {
     no=num;
   }
   void getData()
   {
     int count=0;
     while(no!=0)
     {
      no=no/10;
      count++;
     }
     System.out.println("Count of Digit is"+count);
   }
}
public class Digitcounter
{
  public static void main(String []args)
  {
    Digitcounter1 dc=new Digitcounter1();
    dc.setData(123);
    dc.getData();
  }
}
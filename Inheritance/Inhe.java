import java.util.*;
class Per
{
     int per=0,total=0;
    void calper(int s[])
    {
         for(int i=0;i<s.length;i++)
         {
         total=total+s[i];
         }
         per=total/(s.length);
         System.out.println("Percentage is "+per);
    }
}
class CSE extends Per
{
      int i;
      String n,a,y;
        CSE(String name,int id,String Add,String Year)
        {
             i=id;
             n=name;
             a=Add;
             y=Year;
        }
        
}
class ETC extends Per
{
     int i;
      String n,a,y;
     ETC(String name,int id,String Add,String Year)
        {
             i=id;
             n=name;
             a=Add;
             y=Year;
        }
}
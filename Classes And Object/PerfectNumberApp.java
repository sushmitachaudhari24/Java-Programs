import java.util.*;
class PerfectNumber
{
   int n;
   void setValue(int num)
   {
    n=num;
   }

    void checkNum()
    {
      int temp,sum=0;
      temp=n;
      for(int i=1;i<n;i++)
      {
       if(n%i==0)
       {
         sum=sum+i;
       }
      }
      if(sum==temp)
      {
       System.out.println(temp+" is Perfect Number");
      }
      else
      {
       System.out.println(temp+ "is not Perfect number");
      }
    }
}
public class PerfectNumberApp
{
  public static void main(String []args)
  {
    PerfectNumber p=new PerfectNumber();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    p.setValue(num);
    p.checkNum();
  }
}
import java.util.*;
class Factorial
{
 int num;
  void setValue(int x)
  {
   num=x;
  }
  int getFactorial()
  {int fact=1;
   for(int i=1;i<=num;i++)
   {
    fact=fact*i;
   }
   return fact;
  }
}
public class FactorialApp
{
  public static void main(String []args)
  {
   Factorial f=new Factorial();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   f.setValue(num);
   System.out.println("Factorial of "+num+" is "+f.getFactorial());
  }
}
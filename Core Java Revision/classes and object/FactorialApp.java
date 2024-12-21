import java.util.*;
class Factorial
{ private int x;
 public void setValue(int x)
 {
   this.x=x; 
 }
 int getfactorial()
 {int fact=1;
   for(int i=1;i<=x;i++)
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
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    Factorial f=new Factorial();
    f.setValue(num);
    System.out.println("Factorial of number "+f.getfactorial());
  }
}
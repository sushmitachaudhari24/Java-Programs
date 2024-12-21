import java.util.*;
class Factorial
{
  int n;
  void setValue(int num)
  {
   n=num;
  }
   void calFact()
   {int fact=1;
     for(int i=1;i<=n;i++)
     {
       fact=fact*i;
     }
     System.out.println("Factorial of a number is"+fact);
   }

}
public class FactorialApp
{
   public static void main(String []args)
   {
     Scanner sc= new Scanner(System.in);
     Factorial f=new Factorial();
     System.out.println("Enter a number");
     int num=sc.nextInt();
      f.setValue(num);
      f.calFact();

   }
}
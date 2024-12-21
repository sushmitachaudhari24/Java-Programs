import java.util.*;
abstract class Value
{int a,b;
 void setValue(int a,int b)
 {
  this.a=a;
  this.b=b;
 }
 abstract int getResult();
}
class Power extends Value
{
   int getResult()
   {
    int p=1;
    for(int i=0;i<b;i++)
    {
     p=p*a;
    }
    return p;
   }
}
class SearchDigit extends Value
{
  int getResult()
  { int f=-1;
   while(a!=0)
   {
    int rem= a%10;
    if(rem==b)
    {
      f= rem;
      break;
    }
    else
    {
     f= -1;
    }
    a=a/10;
   }
   return f;
  }
}
public class ValueApp
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.println("1.Calculate Power\n2.Search Digit");
   int c=sc.nextInt();
   switch(c)
   {
    case 1:Power p=new Power();
           p.setValue(a,b);
           System.out.println("Power of a Number is "+p.getResult());
           break;
    case 2: SearchDigit s=new SearchDigit();
           s.setValue(a,b);
           System.out.println("Status of search is "+s.getResult());
           break;
   }
 }
}

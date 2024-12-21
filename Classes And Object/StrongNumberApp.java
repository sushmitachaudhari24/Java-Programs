import java.util.*;
class StrongNumber
{
  int n;
  void setValue(int num)
  {
    n=num;
  }
  void checkNumber()
  { int fact=1,sum=0,rem,temp;
     temp=n;
     while(n!=0)
     {
      rem=n%10;
      fact=1;
       for(int i=1;i<=rem;i++)
       {
          fact=fact*i;
       }
       sum=sum+fact;
      n=n/10;
     }
     if(sum==temp)
     {
      System.out.println(temp +" is Strong Number");
     }
     else
      {
           System.out.println(temp +" is not Strong Number");
      }
  }
}
public class StrongNumberApp
{
 public static void main(String []args)
 {
    Scanner sc=new Scanner(System.in);

    StrongNumber p=new StrongNumber();
    System.out.println("Enter a number");
    int num=sc.nextInt();
    p.setValue(num);
    p.checkNumber();
 }
}
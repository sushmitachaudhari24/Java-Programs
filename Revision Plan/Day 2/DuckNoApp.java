import java.util.*;
class CheckDuck
{
 int no;
 boolean b=false;
  public void setNo(int no)
  {
   this.no=no;
  }
  public boolean checkNum()
  {
    int temp=no,rem;
    while(temp!=0)
    {
      rem=temp%10;
      if(rem==0)
      {
      b=true;
      break;
      }
      temp=temp/10;
    }
    return b;
  }
}
public class DuckNoApp
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter A number");
     int no=sc.nextInt();
     CheckDuck c=new CheckDuck();
     c.setNo(no);
     if(c.checkNum()==true)
     {
       System.out.println("Number is Duck No");
     }
     else 
       System.out.println("Number is not Duck No");
   }
}
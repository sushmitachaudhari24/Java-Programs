import java.util.*;
class ArmstrongApp
{
  int no;
  void setData(int num)
  {
     no=num;
  }
  void getData()
  {
     int temp,rem,count,p,sum;
     temp=no;
     count=0;
     while(temp!=0)
     {
       temp=temp/10;
       count++;
     }
     temp=no;
     sum=0;
     while(temp!=0)
     {
       rem=temp%10;
       p=1;
        for(int i=1;i<=count;i++)
        {
         p=p*rem;
        }
        sum=sum+p;
        temp=temp/10;
     }
     if(no==sum)
     {
      System.out.println("Number is Armstrong");
     }
     else
     {
       System.out.println("Number is not Armstrong");
     }


  }
}
public class Armstrong
{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  ArmstrongApp a=new ArmstrongApp();
  System.out.println("Enter a number");
  int no=sc.nextInt();
  a.setData(no);
  a.getData();
 }
}
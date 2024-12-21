import java.util.*;
public class LcmHcf
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
     int num1,num2,gcd=1,lcm;
     System.out.println("Enter two number");
     num1=sc.nextInt();
     num2=sc.nextInt();
     for(int i=1;i<=num1 &&i<num2;i++)
     {
         if(num1%i==0 && num2%i==0)
         {
           System.out.println("\t"+i);
           gcd=i;
         }
     }
     lcm=(num1*num2)/gcd;
     System.out.println("Lcm is "+lcm+"\n Hcf is "+gcd);
   }
}
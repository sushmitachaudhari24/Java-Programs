import java.util.*;
public class DuckNumber
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int num=sc.nextInt();
    int rem;
    boolean b=false;
   while(num!=0)
   {
   rem=num%10;
    num=num/10;
    if(rem==0)
      {
      b=true;
      break;
      }
   }
   if(b==true)
   {
   System.out.println("Number is Duck");
   }
   else
    System.out.println("Number is Not Duck");
 }
}
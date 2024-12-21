import java.util.*;
public class FactorialNum
{
   public static void main(String []args)
   {
    int n,i,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    for(i=n;i!=0;i--)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+n+" is "+fact);
   }
}
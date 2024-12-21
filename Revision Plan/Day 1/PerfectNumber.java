import java.util.*;
public class PerfectNumber
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A number to check Number is Perfect or not");
    int num=sc.nextInt();
    int sum=0;

    for(int i=1;i<num;i++)
    {
      if(num%i==0)
      {
      sum=sum+i;
      }
    }
    if(num==sum)
    {
     System.out.println(" Number is Perfect");
    }
    else
    {
    System.out.println(" Number is Not Perfect");
    }
  }
}
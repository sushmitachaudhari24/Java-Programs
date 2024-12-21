import java.util.*;
class ArrayOperation
{int a[];
ArrayOperation(int a[])
{
this.a=a;
}
void calSum()
{
 int temp=0,rem=0,sum=0;
 for(int i=0;i<a.length;i++)
 {
  temp=a[i];
  sum=0;
  while(temp!=0)
  {
   rem=temp%10;
   sum=sum+rem;
   temp=temp/10;
  }
  a[i]=sum;
 }
}
int []getSumArray()
{
 return a;
}
}
public class ArrayOperationApp
{
 public static void main(String []args)
 {
  int a[]=new int[]{5732,8659,2534,9625,7354};
  ArrayOperation ao=new ArrayOperation(a);


  System.out.println("Array Before Operation\n");
  for(int i=0;i<a.length;i++)
  {
    System.out.print("\t"+a[i]);
  }
   ao.calSum();
   a=ao.getSumArray();
    System.out.println("\nArray After Operation\n");
    for(int i=0;i<a.length;i++)
    {
      System.out.print("\t"+a[i]);
    }
  System.out.println();
 }
}
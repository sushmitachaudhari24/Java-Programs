import java.util.*;
class ArrSum
{ int a[];
 public void setValue(int arr[])
 {
  a=arr;
 }
}
class GetSum extends ArrSum
{
 int getArrSum()
 { int sum=0;
   for(int i=0;i<a.length;i++)
   {
    sum=sum+a[i];
   }
   return sum;
 }
}
public class ArraySum
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    GetSum g=new GetSum();
    System.out.println("Enter Array Elements");
    int a[]=new int[7];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    g.setValue(a);
    System.out.println("Array Elements Sum is "+g.getArrSum());
  }
}